package explore.restful.ws.exception;

import explore.restful.ws.model.response.ExploreRest;

public class ExploreServiceException extends RuntimeException{


	private static final long serialVersionUID = -7616508919844957218L;
/*
	public MoveOutServiceException(String message){
		super(message);
	}
*/
	private ExploreRest data;
	
	public ExploreServiceException() {
		super();
	}

	public ExploreServiceException(ExploreRest data) {
		super();
		this.data = data;
	}

	public ExploreServiceException(String message) {
		super(message);
	}

	public ExploreRest getData() {
		return data;
	}

	public void setData(ExploreRest data) {
		this.data = data;
	}
}
