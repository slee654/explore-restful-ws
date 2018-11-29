package explore.restful.ws.model.response;

public enum ResponseStatus {
	SUCCESS("Success"),
	ERROR("Error");
	
	private String status;
	
	ResponseStatus(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
