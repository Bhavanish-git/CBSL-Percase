package com.project.dbConnect;



import java.sql.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)

@Component
public class POJO {

	@JsonProperty("@id")
	private String AGREEMENT_NO;
	
	@JsonProperty("rlh")
	private String RLH;
	
	@JsonProperty("employee_grade_per")
	private String  EMPLOYEE_GRADE_PER;
	
	private String ASSET_CATEGORY,					
	ASSET_TYPE,						
						
	CFE_ID,					
	MANUFACTURER,					
	PRODUCT,							
	PSA_FLAG,
	REGION,							
	REMARKS,
	SCHEME,							
	SCHEME_TYPE_ADD,					
	ZONE	;

	@JsonFormat(pattern="yyyy-MM-dd")
	@JsonProperty("lms_date_per")
	private Date LMS_DATE;
	
	@JsonProperty("cross_sell_count")
	private Integer CROSS_SELL_COUNT;
	
	@JsonProperty("scheme_specfic_volume_per")
	private Integer SCHEME_SPECIFIC_VOLUME_PER;
	
	@JsonProperty("total_file_processed_used")
	private Integer TOTAL_FILE_PROCESSED_USED;
		
	@JsonProperty("total_volume_used")
	private Integer TOTAL_VOLUME_USED;
	

	private Integer ADD_PO_FILE_PROCESSED_COUNT,		
	AMOUNT_FINANCED,
	BROKER_AMT,					
	BULK_COUNT_PER,										
	BULK_FILE_COUNT,
	BUSINESS_IRR,					
	CE_NEW_COUNT,
	CE_NEW_VOLUME,					
	CE_USED_COUNT,					
	CE_USED_VOLUME,					
	CE_USED_VOLUME_ADDITIONAL,		
	DOCUMENT_CHARGE,					
	DUAL_CASES_COUNT,
	EARLY_BIRD_COUNT,				
	EARLY_BIRD_DAYS	,				
	EARLY_BIRD_VOLUME,
	PV_CV_NEW_COUNT,					
	PV_CV_USED_COUNT,
	SERVICE_CHARGE,					
	SFE_SALARY,						
	TOTAL_BULK_COUNT,
					TOTAL_FILE_VOLUME,				
	TRACTOR_NEW_COUNT,				
	TRACTOR_NEW_USED_COUNT,			
	TRACTOR_USED_COUNT,				
	TW2_NONRE_COUNT,					
	TW2_ONLY_RE_COUNT,				
	TW2_RE_COUNT,					
	TW3_COUNT,						
	W_IRR ;
 
		//	Integer cROSS_SELL_COUNT,
		//	 Integer tOTAL_FILE_PROCESSED_USED,	
		//	Integer bULK_COUNT_PER,

	public Integer getBROKER_AMT() {
		return BROKER_AMT;
	}

	public void setBROKER_AMT(Integer bROKER_AMT) {
		BROKER_AMT = bROKER_AMT;
	}

	public Integer getPV_CV_NEW_COUNT() {
		return PV_CV_NEW_COUNT;
	}


	public void setPV_CV_NEW_COUNT(Integer pV_CV_NEW_COUNT) {
		PV_CV_NEW_COUNT = pV_CV_NEW_COUNT;
	}

	public Integer getPV_CV_USED_COUNT() {
		return PV_CV_USED_COUNT;
	}

	public void setPV_CV_USED_COUNT(Integer pV_CV_USED_COUNT) {
		PV_CV_USED_COUNT = pV_CV_USED_COUNT;
	}

	public String getAGREEMENT_NO() {
		return AGREEMENT_NO;
	}


	public void setAGREEMENT_NO(String aGREEMENT_NO) {
		AGREEMENT_NO = aGREEMENT_NO;
	}


	public String getRLH() {
		return RLH;
	}


	public void setRLH(String rLH) {
		RLH = rLH;
	}


	public String getEMPLOYEE_GRADE_PER() {
		return EMPLOYEE_GRADE_PER;
	}


	public void setEMPLOYEE_GRADE_PER(String eMPLOYEE_GRADE_PER) {
		EMPLOYEE_GRADE_PER = eMPLOYEE_GRADE_PER;
	}


	public String getASSET_CATEGORY() {
		return ASSET_CATEGORY;
	}


	public void setASSET_CATEGORY(String aSSET_CATEGORY) {
		ASSET_CATEGORY = aSSET_CATEGORY;
	}


	public String getASSET_TYPE() {
		return ASSET_TYPE;
	}


	public void setASSET_TYPE(String aSSET_TYPE) {
		ASSET_TYPE = aSSET_TYPE;
	}



	public String getCFE_ID() {
		return CFE_ID;
	}


	public void setCFE_ID(String cFE_ID) {
		CFE_ID = cFE_ID;
	}


	public String getMANUFACTURER() {
		return MANUFACTURER;
	}


	public void setMANUFACTURER(String mANUFACTURER) {
		MANUFACTURER = mANUFACTURER;
	}


	public String getPRODUCT() {
		return PRODUCT;
	}


	public void setPRODUCT(String pRODUCT) {
		PRODUCT = pRODUCT;
	}


	public String getPSA_FLAG() {
		return PSA_FLAG;
	}


	public void setPSA_FLAG(String pSA_FLAG) {
		PSA_FLAG = pSA_FLAG;
	}


	public String getREGION() {
		return REGION;
	}


	public void setREGION(String rEGION) {
		REGION = rEGION;
	}


	public String getREMARKS() {
		return REMARKS;
	}


	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}


	public String getSCHEME() {
		return SCHEME;
	}


	public void setSCHEME(String sCHEME) {
		SCHEME = sCHEME;
	}


	public String getSCHEME_TYPE_ADD() {
		return SCHEME_TYPE_ADD;
	}


	public void setSCHEME_TYPE_ADD(String sCHEME_TYPE_ADD) {
		SCHEME_TYPE_ADD = sCHEME_TYPE_ADD;
	}


	public String getZONE() {
		return ZONE;
	}


	public void setZONE(String zONE) {
		ZONE = zONE;
	}


	public Date getLMS_DATE() {
		return LMS_DATE;
	}


	public void setLMS_DATE(Date lMS_DATE) {
		LMS_DATE = lMS_DATE;
	}


	public Integer getCROSS_SELL_COUNT() {
		return CROSS_SELL_COUNT;
	}


	public void setCROSS_SELL_COUNT(Integer cROSS_SELL_COUNT) {
		CROSS_SELL_COUNT = cROSS_SELL_COUNT;
	}


	public Integer getSCHEME_SPECIFIC_VOLUME_PER() {
		return SCHEME_SPECIFIC_VOLUME_PER;
	}


	public void setSCHEME_SPECIFIC_VOLUME_PER(Integer sCHEME_SPECIFIC_VOLUME_PER) {
		SCHEME_SPECIFIC_VOLUME_PER = sCHEME_SPECIFIC_VOLUME_PER;
	}


	public Integer getTOTAL_FILE_PROCESSED_USED() {
		return TOTAL_FILE_PROCESSED_USED;
	}


	public void setTOTAL_FILE_PROCESSED_USED(Integer tOTAL_FILE_PROCESSED_USED) {
		TOTAL_FILE_PROCESSED_USED = tOTAL_FILE_PROCESSED_USED;
	}


	public Integer getTOTAL_VOLUME_USED() {
		return TOTAL_VOLUME_USED;
	}


	public void setTOTAL_VOLUME_USED(Integer tOTAL_VOLUME_USED) {
		TOTAL_VOLUME_USED = tOTAL_VOLUME_USED;
	}


	public Integer getADD_PO_FILE_PROCESSED_COUNT() {
		return ADD_PO_FILE_PROCESSED_COUNT;
	}


	public void setADD_PO_FILE_PROCESSED_COUNT(Integer aDD_PO_FILE_PROCESSED_COUNT) {
		ADD_PO_FILE_PROCESSED_COUNT = aDD_PO_FILE_PROCESSED_COUNT;
	}


	public Integer getAMOUNT_FINANCED() {
		return AMOUNT_FINANCED;
	}


	public void setAMOUNT_FINANCED(Integer aMOUNT_FINANCED) {
		AMOUNT_FINANCED = aMOUNT_FINANCED;
	}


	public Integer getBULK_COUNT_PER() {
		return BULK_COUNT_PER;
	}


	public void setBULK_COUNT_PER(Integer bULK_COUNT_PER) {
		BULK_COUNT_PER = bULK_COUNT_PER;
	}


	public Integer getBULK_FILE_COUNT() {
		return BULK_FILE_COUNT;
	}


	public void setBULK_FILE_COUNT(Integer bULK_FILE_COUNT) {
		BULK_FILE_COUNT = bULK_FILE_COUNT;
	}


	public Integer getBUSINESS_IRR() {
		return BUSINESS_IRR;
	}


	public void setBUSINESS_IRR(Integer bUSINESS_IRR) {
		BUSINESS_IRR = bUSINESS_IRR;
	}


	public Integer getCE_NEW_COUNT() {
		return CE_NEW_COUNT;
	}


	public void setCE_NEW_COUNT(Integer cE_NEW_COUNT) {
		CE_NEW_COUNT = cE_NEW_COUNT;
	}


	public Integer getCE_NEW_VOLUME() {
		return CE_NEW_VOLUME;
	}


	public void setCE_NEW_VOLUME(Integer cE_NEW_VOLUME) {
		CE_NEW_VOLUME = cE_NEW_VOLUME;
	}


	public Integer getCE_USED_COUNT() {
		return CE_USED_COUNT;
	}


	public void setCE_USED_COUNT(Integer cE_USED_COUNT) {
		CE_USED_COUNT = cE_USED_COUNT;
	}


	public Integer getCE_USED_VOLUME() {
		return CE_USED_VOLUME;
	}


	public void setCE_USED_VOLUME(Integer cE_USED_VOLUME) {
		CE_USED_VOLUME = cE_USED_VOLUME;
	}


	public Integer getCE_USED_VOLUME_ADDITIONAL() {
		return CE_USED_VOLUME_ADDITIONAL;
	}


	public void setCE_USED_VOLUME_ADDITIONAL(Integer cE_USED_VOLUME_ADDITIONAL) {
		CE_USED_VOLUME_ADDITIONAL = cE_USED_VOLUME_ADDITIONAL;
	}


	public Integer getDOCUMENT_CHARGE() {
		return DOCUMENT_CHARGE;
	}


	public void setDOCUMENT_CHARGE(Integer dOCUMENT_CHARGE) {
		DOCUMENT_CHARGE = dOCUMENT_CHARGE;
	}


	public Integer getDUAL_CASES_COUNT() {
		return DUAL_CASES_COUNT;
	}


	public void setDUAL_CASES_COUNT(Integer dUAL_CASES_COUNT) {
		DUAL_CASES_COUNT = dUAL_CASES_COUNT;
	}


	public Integer getEARLY_BIRD_COUNT() {
		return EARLY_BIRD_COUNT;
	}


	public void setEARLY_BIRD_COUNT(Integer eARLY_BIRD_COUNT) {
		EARLY_BIRD_COUNT = eARLY_BIRD_COUNT;
	}


	public Integer getEARLY_BIRD_DAYS() {
		return EARLY_BIRD_DAYS;
	}


	public void setEARLY_BIRD_DAYS(Integer eARLY_BIRD_DAYS) {
		EARLY_BIRD_DAYS = eARLY_BIRD_DAYS;
	}


	public Integer getEARLY_BIRD_VOLUME() {
		return EARLY_BIRD_VOLUME;
	}


	public void setEARLY_BIRD_VOLUME(Integer eARLY_BIRD_VOLUME) {
		EARLY_BIRD_VOLUME = eARLY_BIRD_VOLUME;
	}


	public Integer getSERVICE_CHARGE() {
		return SERVICE_CHARGE;
	}


	public void setSERVICE_CHARGE(Integer sERVICE_CHARGE) {
		SERVICE_CHARGE = sERVICE_CHARGE;
	}


	public Integer getSFE_SALARY() {
		return SFE_SALARY;
	}


	public void setSFE_SALARY(Integer sFE_SALARY) {
		SFE_SALARY = sFE_SALARY;
	}


	public Integer getTOTAL_BULK_COUNT() {
		return TOTAL_BULK_COUNT;
	}


	public void setTOTAL_BULK_COUNT(Integer tOTAL_BULK_COUNT) {
		TOTAL_BULK_COUNT = tOTAL_BULK_COUNT;
	}


	public Integer getTRACTOR_NEW_COUNT() {
		return TRACTOR_NEW_COUNT;
	}


	public void setTRACTOR_NEW_COUNT(Integer tRACTOR_NEW_COUNT) {
		TRACTOR_NEW_COUNT = tRACTOR_NEW_COUNT;
	}


	public Integer getTRACTOR_NEW_USED_COUNT() {
		return TRACTOR_NEW_USED_COUNT;
	}


	public void setTRACTOR_NEW_USED_COUNT(Integer tRACTOR_NEW_USED_COUNT) {
		TRACTOR_NEW_USED_COUNT = tRACTOR_NEW_USED_COUNT;
	}


	public Integer getTRACTOR_USED_COUNT() {
		return TRACTOR_USED_COUNT;
	}


	public void setTRACTOR_USED_COUNT(Integer tRACTOR_USED_COUNT) {
		TRACTOR_USED_COUNT = tRACTOR_USED_COUNT;
	}


	public Integer getTW2_NONRE_COUNT() {
		return TW2_NONRE_COUNT;
	}


	public void setTW2_NONRE_COUNT(Integer tW2_NONRE_COUNT) {
		TW2_NONRE_COUNT = tW2_NONRE_COUNT;
	}


	public Integer getTW2_ONLY_RE_COUNT() {
		return TW2_ONLY_RE_COUNT;
	}


	public void setTW2_ONLY_RE_COUNT(Integer tW2_ONLY_RE_COUNT) {
		TW2_ONLY_RE_COUNT = tW2_ONLY_RE_COUNT;
	}


	public Integer getTW2_RE_COUNT() {
		return TW2_RE_COUNT;
	}


	public void setTW2_RE_COUNT(Integer tW2_RE_COUNT) {
		TW2_RE_COUNT = tW2_RE_COUNT;
	}


	public Integer getTW3_COUNT() {
		return TW3_COUNT;
	}


	public void setTW3_COUNT(Integer tW3_COUNT) {
		TW3_COUNT = tW3_COUNT;
	}


	public Integer getW_IRR() {
		return W_IRR;
	}


	public void setW_IRR(Integer w_IRR) {
		W_IRR = w_IRR;
	}

	public Integer getTOTAL_FILE_VOLUME() {
		return TOTAL_FILE_VOLUME;
	}

	public void setTOTAL_FILE_VOLUME(Integer tOTAL_FILE_VOLUME) {
		TOTAL_FILE_VOLUME = tOTAL_FILE_VOLUME;
	}
	
	

}