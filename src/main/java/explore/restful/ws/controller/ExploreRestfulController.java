package explore.restful.ws.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import explore.restful.ws.model.request.ExploreRequestModel;
import explore.restful.ws.model.response.ExploreRest;
import explore.restful.ws.service.ExploreService;
import explore.restful.ws.shared.dto.ExploreDto;

//https://localhost/csp/prod/RestAPI/explore/" -- localhost
//https://{server}[:port]/csp/{namespace}/RestAPI/explore

//response
/*
 response => Explore
"Id": "Id (String)",
"startDate": "startDate Date Echoed Back",
"endDate": "endDate Date Echoed Back",
"exploreReason": "exploreReason Echoed Back"
*/

@RestController
@RequestMapping("/csp/prod/RestAPI/explore") // https://{server}[:port]/csp/{namespace}/RestAPI/explore
public class ExploreRestfulController {
	//requestParms=>Id=1234567startDate=2018-10-31&endDate=2018-10-27&exploreReason=curiosity
	@Autowired
	ExploreService exploreService;
	
	@PostMapping(
			consumes= {MediaType.APPLICATION_JSON_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE}
			)
	public ExploreRest  createExplore(@RequestBody ExploreRequestModel exploreDetails) {
		
		ExploreRest returnValue = new ExploreRest();		
		ExploreDto exploreDto = new ExploreDto();		
		
		long id = exploreDetails.getId();
		long resId = exploreDetails.getResidentId();
		ExploreDto createdExplore = exploreService.createExplore(id, resId);
		BeanUtils.copyProperties(createdExplore, returnValue);		
		
		return returnValue;
	}
	

}