package explore.restful.ws.model.response;

public enum ErrorMessages {
	/*
	    “Status”: “Error (String)",
		“Code”: "Error Code (Numeric),
		“Data”: (String)
	*/
	/*
	    1001 – Invalid Agreement Id specified
		1002 – Agreement not in SIGNED phase
	 */
	
	INVALID_AGMTID_SPECIFIED("Invalid Agreement Id specified"),
	AGMT_NOT_IN_SIGNED_PHASE("Agreement not in SIGNED phase");
	
	private String errorMessage;
	
	ErrorMessages(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
			

}
