package explore.restful.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="explorelocaction")
public class ExploreLoactionEntity implements Serializable {
	
	private static final long serialVersionUID = -3050860370962099449L;
	
	@Id
	private long contactAgreementId;
	
	@Column(nullable=false)
	private long contactId;

	
	public long getContactAgreementId() {
		return contactAgreementId;
	}

	public void setContactAgreementId(long contactAgreementId) {
		this.contactAgreementId = contactAgreementId;
	}

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}


}
