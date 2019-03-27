package isti;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


import javax.persistence.*;

@XmlRootElement(name = "DatiCMAD", namespace = "http://stingray.isti.cnr.it/docs/xsd/v1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JCAMD", propOrder = {
    "Id",
    "CMAD_TYPE",
    "CMAD_REVISION",
    "CMAD_POSITION",
    "CMAD_DESCRIPTION",
    "CMAD_LONGITUDE",
    "CMAD_LATITUDE",
    "CMAD_DIGITAL_INFO",
    "CMAD_ANALOG_INFO",
    "CMAD_RAW",
    "CMAD_CRC",
    
    
})
@Entity(name="Jcmad" )
@Table(name = "CMAD") 
@NamedQueries({
    @NamedQuery(name="JCMAD.findAll",
                query="SELECT c FROM Jcmad c"),
    
   
}) 
/*@NamedNativeQueries({
    @NamedNativeQuery(
            name    =   "updateCMAD",
            query   =   "UPDATE c SET c = ?, c.CMAD_ANALOG_INFO= ?, c.CMAD_CRC= ?, c.CMAD_DESCRIPTION= ?, c.CMAD_DIGITAL_INFO= ?, c.CMAD_HEADER= ?, c.CMAD_LATITUDE= ?, c.CMAD_LONGITUDE= ?, c.CMAD_POSITION= ?, c.CMAD_RAW= ?, c.CMAD_REVISION= ?, c.CMAD_TYPE  WHERE c.MAC_ADR = ? FROM Jcmad c"
            ,resultSetMapping = "updateResult"
    )
})*/
public class JCMAD  implements java.io.Serializable{
	
	@XmlElement(/*name = "CMAD",*/ required = true)
	@EmbeddedId
	JCMADID Id;
	/*
	@XmlElement(name = "CMAD_HEADER", required = true)
	String CMAD_HEADER;
	
	@Id 
	@XmlElement(name = "MAC_ADR", required = true)
	String MAC_ADR;

	@XmlElement(name = "CMAD_DATE", required = true)
	LocalDateTime CMAD_DATE;*/
	
	@XmlElement(name = "CMAD_TYPE", required = true)
	int CMAD_TYPE = 0;
	@XmlElement(name = "CMAD_REVISION", required = true)
	int CMAD_REVISION;
	@XmlElement(name = "CMAD_POSITION", required = true)
	String CMAD_POSITION;
	@XmlElement(name = "CMAD_DESCRIPTION", required = true)
	String CMAD_DESCRIPTION;
	@XmlElement(name = "CMAD_LONGITUDE", required = true)
	String  CMAD_LONGITUDE;
	@XmlElement(name = "CMAD_LATITUDE", required = true)
	String CMAD_LATITUDE;
	@XmlElement(name = "CMAD_DIGITAL_INFO", required = true)
	String CMAD_DIGITAL_INFO;
	
	
	@XmlElement(name = "CMAD_ANALOG_INFO", required = true)
	 @Embedded
	CMADAnalogInfo CMAD_ANALOG_INFO;
	
	@XmlElement(name = "CMAD_RAW_BASE64", required = true)
	String CMAD_RAW;
	@XmlElement(name = "CMAD_CRC", required = true)
	String CMAD_CRC;
	
	

	public JCMAD() {
	}
	
	
	
	
	/**
	 * @param cMAD_HEADER
	 * @param mAC_ADR
	 * @param cMAD_TYPE
	 * @param cMAD_REVISION
	 * @param cMAD_POSITION
	 * @param cMAD_DESCRIPTION
	 * @param cMAD_LONGITUDE
	 * @param cMAD_LATITUDE
	 * @param cMAD_DIGITAL_INFO
	 * @param cMAD_ANALOG_INFO
	 * @param cMAD_Dummy
	 * @param cMAD_CRC
	 */
	public JCMAD(String cMAD_HEADER, String mAC_ADR, int cMAD_TYPE, int cMAD_REVISION, String cMAD_POSITION,
			String cMAD_DESCRIPTION, String cMAD_LONGITUDE, String cMAD_LATITUDE, String cMAD_DIGITAL_INFO,
			 String cCMAD_RAW, int cMAD_CRC) {
		Id = new JCMADID(mAC_ADR,  new Date(), cMAD_HEADER);
		//CMAD_HEADER = cMAD_HEADER;
		//MAC_ADR = mAC_ADR;
		CMAD_TYPE = cMAD_TYPE;
		CMAD_REVISION = cMAD_REVISION;
		CMAD_POSITION = cMAD_POSITION;
		CMAD_DESCRIPTION = cMAD_DESCRIPTION;
		CMAD_LONGITUDE = cMAD_LONGITUDE;
		CMAD_LATITUDE = cMAD_LATITUDE;
		CMAD_DIGITAL_INFO = cMAD_DIGITAL_INFO;
		
		CMAD_RAW = cCMAD_RAW;
		CMAD_CRC = String.valueOf(cMAD_CRC);
		//date = new Date();
		//CMAD_DATE = LocalDateTime.now();
		//System.out.print(CMAD_DATE);
	}




	/*public String getCMAD_HEADER() {
		return CMAD_HEADER;
	}
	public void setCMAD_HEADER(String cMAD_HEADER) {
		CMAD_HEADER = cMAD_HEADER;
	}
	public String getMAC_ADR() {
		return MAC_ADR;
	}
	public void setMAC_ADR(String mAC_ADR) {
		MAC_ADR = mAC_ADR;
	}*/
	public int getCMAD_TYPE() {
		return CMAD_TYPE;
	}
	public void setCMAD_TYPE(int cMAD_TYPE) {
		CMAD_TYPE = cMAD_TYPE;
	}
	public int getCMAD_REVISION() {
		return CMAD_REVISION;
	}
	public void setCMAD_REVISION(int cMAD_REVISION) {
		CMAD_REVISION = cMAD_REVISION;
	}
	public String getCMAD_POSITION() {
		return CMAD_POSITION;
	}
	public void setCMAD_POSITION(String cMAD_POSITION) {
		CMAD_POSITION = cMAD_POSITION;
	}
	public String getCMAD_DESCRIPTION() {
		return CMAD_DESCRIPTION;
	}
	public void setCMAD_DESCRIPTION(String cMAD_DESCRIPTION) {
		CMAD_DESCRIPTION = cMAD_DESCRIPTION;
	}
	public String getCMAD_LONGITUDE() {
		return CMAD_LONGITUDE;
	}
	public void setCMAD_LONGITUDE(String cMAD_LONGITUDE) {
		CMAD_LONGITUDE = cMAD_LONGITUDE;
	}
	public String getCMAD_LATITUDE() {
		return CMAD_LATITUDE;
	}
	public void setCMAD_LATITUDE(String cMAD_LATITUDE) {
		CMAD_LATITUDE = cMAD_LATITUDE;
	}
	public String getCMAD_DIGITAL_INFO() {
		return CMAD_DIGITAL_INFO;
	}
	public void setCMAD_DIGITAL_INFO(String cMAD_DIGITAL_INFO) {
		CMAD_DIGITAL_INFO = cMAD_DIGITAL_INFO;
	}
	public CMADAnalogInfo getCMAD_ANALOG_INFO() {
		return CMAD_ANALOG_INFO;
	}
	public void setCMAD_ANALOG_INFO(CMADAnalogInfo cMAD_ANALOG_INFO) {
		CMAD_ANALOG_INFO = cMAD_ANALOG_INFO;
	}
	public String getCMAD_RAW() {
		return CMAD_RAW;
	}
	public void setCMAD_RAW(String cMAD_Dummy) {
		CMAD_RAW = cMAD_Dummy;
	}
	public String getCMAD_CRC() {
		return CMAD_CRC;
	}
	public void setCMAD_CRC(String cMAD_CRC) {
		CMAD_CRC = cMAD_CRC;
	}




	public JCMADID getId() {
		return Id;
	}




	public void setId(JCMADID id) {
		Id = id;
	}




	/*public LocalDateTime getDate() {
		return CMAD_DATE;
	}




	public void setDate(LocalDateTime date) {
		this.CMAD_DATE = date;
	}*/
	
	
	
	
	
}
