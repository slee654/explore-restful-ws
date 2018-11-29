package explore.restful.ws.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import explore.restful.ws.entity.ExploreLoactionEntity;
import explore.restful.ws.entity.ExploreEntity;
import explore.restful.ws.entity.ReasonEntity;
import explore.restful.ws.exception.ExploreServiceException;
import explore.restful.ws.model.response.ExploreRest;
import explore.restful.ws.repository.ExploreLocationRepository;
import explore.restful.ws.repository.ExploreRepository;
import explore.restful.ws.repository.ReasonRepository;
import explore.restful.ws.shared.dto.ExploreDto;

@Service
public class ExploreServiceImpl implements ExploreService{
//public class MoveOutServiceImpl implements MoveOutService{
	
	@Autowired
	ExploreRepository exploreRepository;
	
	@Autowired
	ReasonRepository reasonRepository;
	
	@Autowired
	ExploreLocationRepository exploreLocRepository;

	//we need to retrieve data from DB and wrap it as an ExploreEntity, 
	//then tranfer it as ExploreDto, send it back to response model "ExploreRest"
	//all these will be trigger when the post request comes in.
	@Override
	public ExploreDto createExplore (long id) { 
		ExploreDto exploreDto = new ExploreDto();
		ExploreEntity exploreEntity = exploreRepository.findExploreByContactAgreementId(id);
		
		BeanUtils.copyProperties(exploreDto, exploreEntity);		
		return exploreDto;
	}

	@Override	
	public ExploreDto createExplore(long id, long resId) {
		
		
		//find contactAgreementId from contactAgreement table based on resId
		ExploreLoactionEntity exploreLoactionEntity = exploreLocRepository.findExploreByContactId(resId);
		if(exploreLoactionEntity == null) {
			ExploreRest exRest = new ExploreRest();
			exRest.setAgrId(id);
			throw new ExploreServiceException(exRest);
		}
		long contactAgreementId = exploreLoactionEntity.getContactAgreementId();
		
		ExploreEntity exploreEntity = exploreRepository.findExploreByContactAgreementId(contactAgreementId);
		if(exploreEntity == null) {
			ExploreRest exRest2 = new ExploreRest();
			exRest2.setAgrId(id);
			throw new ExploreServiceException(exRest2);
		}
		long reasonId = exploreEntity.getReasonId();
		
		//get reasonDesc
		Optional<ReasonEntity> reason = reasonRepository.findById(reasonId);
		ReasonEntity reasonEntity = reason.get();
		
		String reasonDesc = reasonEntity.getReasonDesc();
		
		ExploreDto exploreDto = new ExploreDto();
		exploreDto .setId(id);
		exploreDto.setStartDate(exploreEntity.getStartDate());
		exploreDto.setEndDate(exploreEntity.getEndDate());
		exploreDto.setExploreReason(reasonDesc);
		
		return exploreDto;
	}
	
	public String DateFormatted(Date date) {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		return simpleDateFormat.format(date);
	}
	
	
}
