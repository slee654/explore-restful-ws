package explore.restful.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="REASON")
public class ReasonEntity implements Serializable {

	private static final long serialVersionUID = -2726674300825600235L;
	
	@Id
	private long reasonId;
	
	@Column(nullable=false)
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
