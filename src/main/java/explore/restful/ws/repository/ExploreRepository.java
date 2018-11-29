package explore.restful.ws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import explore.restful.ws.entity.ExploreLoactionEntity;
import explore.restful.ws.entity.ExploreEntity;
import explore.restful.ws.entity.ReasonEntity;

@Repository
public interface ExploreRepository extends CrudRepository<ExploreEntity,Long> {
	
	ExploreEntity findExploreByContactAgreementId(Long contactAgreementId);
}
