package explore.restful.ws.model.response;

public enum ResponseCode {
	CODE_1001(1001), //Invalid Agreement Id specified
	CODE_1002(1002); //Agreement not in SIGNED phase
	
	private int code;
	
	ResponseCode(int code){
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
