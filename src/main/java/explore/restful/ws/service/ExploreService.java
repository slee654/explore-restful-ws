package explore.restful.ws.service;

import explore.restful.ws.shared.dto.ExploreDto;

public interface ExploreService {
	
	ExploreDto createExplore(long id);
	ExploreDto createExplore (long id, long residentId);
}
