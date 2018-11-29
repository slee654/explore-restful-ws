package explore.restful.ws.repository;

import org.springframework.data.repository.CrudRepository;

import explore.restful.ws.entity.ExploreLoactionEntity;

public interface ExploreLocationRepository extends CrudRepository<ExploreLoactionEntity,Long>{
	
	ExploreLoactionEntity findExploreByContactId(long resId);

}
