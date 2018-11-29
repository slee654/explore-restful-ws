package explore.restful.ws.shared.dto;

import java.io.Serializable;
import java.util.Date;

public class ExploreDto implements Serializable {
	
	private static final long serialVersionUID = 6737947146380520954L;
	/*requestParms=>id=1234567&ResId=b124&StartDate=2018-10-31&EndDate=2018-10-27&ExploreReason=curiosity
	 *response => "Id", "StartDate", "EndDate","ExploreReason"
	 */
	
	
	private long id;
	private long residentId;
	private Date startDate;
	private Date  endDate;
	private String exploreReason;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getExploreReason() {
		return exploreReason;
	}
	public void setExploreReason(String exploreReason) {
		this.exploreReason = exploreReason;
	}
}
