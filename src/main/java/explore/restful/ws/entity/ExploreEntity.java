package explore.restful.ws.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="EXPLORE")
public class ExploreEntity implements Serializable {	

	private static final long serialVersionUID = -8285831473868184447L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable =false)
	private long contactAgreementId;
	
	@Column(nullable =false)
	private long reasonId; 
	
	@Column
	private Date startDate; 
	
	@Column
	private Date endDate; 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getContactAgreementId() {
		return contactAgreementId;
	}

	public void setContactAgreementId(long contactAgreementId) {
		this.contactAgreementId = contactAgreementId;
	}

	public long getReasonId() {
		return reasonId;
	}

	public void setReasonId(long reasonId) {
		this.reasonId = reasonId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
		

}
