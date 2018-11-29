package explore.restful.ws.model.request;

import java.util.Date;

public class ExploreRequestModel {
	
	//requestParms=>Id=1234567&ResId=b124&FREndDate=2018-10-31&MODate=2018-10-27&MOReason=Transferred
	
	
	private long id; //Id
	private long residentId; //ResId
	private Date startDate; //startDate
	private Date endDate; //endDate
	private String exploreReason; //exploreReason	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getResidentId() {
		return residentId;
	}
	public void setResidentId(long residentId) {
		this.residentId = residentId;
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
	public void setMoveoutDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getExploreReason() {
		return exploreReason;
	}
	public void setExploreReason(String exploreReason) {
		this.exploreReason = exploreReason;
	}	

}
