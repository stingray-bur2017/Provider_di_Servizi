package isti;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JCMADID", propOrder = {
    "MAC_ADR",
    "CMAD_DATE",
    "CMAD_HEADER"
    
})
@Embeddable
public class JCMADID implements Serializable {


	@XmlElement(name = "MAC_ADR", required = true)
	String MAC_ADR;
	@XmlElement(name = "CMAD_DATE", required = true)
	Date CMAD_DATE;
	@XmlElement(name = "CMAD_HEADER", required = true)
	String CMAD_HEADER;
	
	/**
	 * 
	 */
	public JCMADID() {
		
	}
	
	
	/**
	 * @param mAC_ADR
	 * @param cMAD_DATE
	 * @param cMAD_HEADER
	 */
	public JCMADID(String mAC_ADR, Date cMAD_DATE, String cMAD_HEADER) {
		super();
		MAC_ADR = mAC_ADR;
		CMAD_DATE = cMAD_DATE;
		CMAD_HEADER = cMAD_HEADER;
	}


	public String getMAC_ADR() {
		return MAC_ADR;
	}
	public void setMAC_ADR(String mAC_ADR) {
		MAC_ADR = mAC_ADR;
	}
	public Date getCMAD_DATE() {
		return CMAD_DATE;
	}
	public void setCMAD_DATE(Date cMAD_DATE) {
		CMAD_DATE = cMAD_DATE;
	}
	public String getCMAD_HEADER() {
		return CMAD_HEADER;
	}
	public void setCMAD_HEADER(String cMAD_HEADER) {
		CMAD_HEADER = cMAD_HEADER;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JCMADID other = (JCMADID) obj;
		if (MAC_ADR == null) {
			if (other.MAC_ADR != null)
				return false;
		} else if (!MAC_ADR.equals(other.MAC_ADR))
			return false;
		if (CMAD_DATE != other.CMAD_DATE)
			return false;
		return true;
	}
	
	
	
}
