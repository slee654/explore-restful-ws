package explore.restful.ws.model.response;

import java.util.Date;

public class ExploreRest {
	
	/*
	 * Success response:
	 * {
			“Status”: "Success (String)"
			"Data": "(Object)"
					{
						"AgrId": "Agreement Key/Id (String)",
						"FREndDate": "Financial Responsibility End Date Echoed Back",
						"MODate": "Move-Out Date Echoed Back",
						"MOReason": "Move-Out Reason Echoed Back"
					}
		}
	 */
	
	private long AgrId;  //contactAgreementId; //may need to change to RAS Agmt ID (getting from MoveIn ??, instead of purely agmtId from Moveout table)
	private Date FREndDate;  //FinancialRespEndDate; 
	private Date MODate;  //ActualDate; // for now, this is taken as moDate;
	private String MOReason;  //reason; //will need to be mapped from table 'moveout'-reasonId to table 'reason'-reasonDesc

	public long getAgrId() {
		return AgrId;
	}

	public void setAgrId(long agrId) {
		AgrId = agrId;
	}

	public Date getFREndDate() {
		return FREndDate;
	}

	public void setFREndDate(Date fREndDate) {
		FREndDate = fREndDate;
	}

	public Date getMODate() {
		return MODate;
	}

	public void setMODate(Date mODate) {
		MODate = mODate;
	}

	public String getMOReason() {
		return MOReason;
	}

	public void setMOReason(String mOReason) {
		MOReason = mOReason;
	}	
	
}
