package explore.restful.ws.model.response;

public class ExploreResponse {
	private String status;
	private int code;
	private ExploreRest data;
	
	public ExploreResponse(String status, int code, ExploreRest data) {
		super();
		this.status = status;
		this.code = code;
		this.data = data;
	}
	
	public ExploreResponse(String status, ExploreRest data) {
		super();
		this.status = status;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	public ExploreRest getData() {
		return data;
	}

	public void setData(ExploreRest data) {
		this.data = data;
	}


}
