package explore.restful.ws.shared.dto;

import java.io.Serializable;

public class ReasonDto implements Serializable {

	private static final long serialVersionUID = -7816527881446469213L;
	
	private long reasonId;
	private String reasonDesc;

	public long getReasonId() {
		return reasonId;
	}

	public void setReasonId(long reasonId) {
		this.reasonId = reasonId;
	}

	public String getReasonDesc() {
		return reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

}
