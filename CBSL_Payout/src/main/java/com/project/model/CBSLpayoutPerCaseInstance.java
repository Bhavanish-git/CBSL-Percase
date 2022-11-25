
package com.project.model;

import java.sql.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CBSLpayoutPerCaseInstance {

    @SerializedName("@id")
    @Expose
    private String id;
    @SerializedName("SERVICE_CHARGE")
    @Expose
    private Integer serviceCharge;
    @SerializedName("PRODUCT")
    @Expose
    private String product;
    @SerializedName("ZONE")
    @Expose
    private String zone;
    @SerializedName("AMOUNT_FINANCED")
    @Expose
    private Integer amountFinanced;
    @SerializedName("BUSINESS_IRR")
    @Expose
    private Integer businessIrr;
    @SerializedName("SFE_SALARY")
    @Expose
    private Integer sfeSalary;
    @SerializedName("REGION")
    @Expose
    private String region;
    @SerializedName("SCHEME")
    @Expose
    private String scheme;
    @SerializedName("MANUFACTURER")
    @Expose
    private String manufacturer;
    @SerializedName("ASSET_CATEGORY")
    @Expose
    private String assetCategory;
    @SerializedName("DOCUMENT_CHARGE")
    @Expose
    private Integer documentCharge;
    @SerializedName("ASSET_TYPE")
    @Expose
    private String assetType;
    @SerializedName("BROKER_AMT")
    @Expose
    private Integer brokerAmt;
    @SerializedName("W_IRR")
    @Expose
    private Integer wIrr;
    @SerializedName("PSA_FLAG")
    @Expose
    private String psaFlag;
    @SerializedName("SCHEME_TYPE_ADD")
    @Expose
    private String schemeTypeAdd;
    
    @SerializedName("CFE_ID")
    @Expose
    private String cfeId;

    @SerializedName("ADD_PO_FILE_PROCESSED_COUNT")
    @Expose
    private Integer addPoFileProcessedCount;
    @SerializedName("REMARKS")
    @Expose
    private String remarks;

    @SerializedName("rlh")
    @Expose
    private String rlh;
    @SerializedName("TW3_COUNT")
    @Expose
    private Integer tw3Count;
    @SerializedName("TW2_RE_COUNT")
    @Expose
    private Integer tw2ReCount;
    @SerializedName("TW2_ONLY_RE_COUNT")
    @Expose
    private Integer tw2OnlyReCount;
    @SerializedName("TW2_NONRE_COUNT")
    @Expose
    private Integer tw2NonreCount;
    @SerializedName("TRACTOR_USED_COUNT")
    @Expose
    private Integer tractorUsedCount;
    @SerializedName("TRACTOR_NEW_USED_COUNT")
    @Expose
    private Integer tractorNewUsedCount;
    @SerializedName("TRACTOR_NEW_COUNT")
    @Expose
    private Integer tractorNewCount;
    @SerializedName("PV_CV_USED_COUNT")
    @Expose
    private Integer pvCvUsedCount;
    @SerializedName("PV_CV_NEW_COUNT")
    @Expose
    private Integer pvCvNewCount;
    @SerializedName("scheme_specfic_volume_per")
    @Expose
    private Integer schemeSpecficVolumePer;
    @SerializedName("lms_date_per")
    @Expose
    private Date lmsDatePer;
    @SerializedName("CE_NEW_VOLUME")
    @Expose
    private Integer ceNewVolume;
    @SerializedName("CE_USED_VOLUME")
    @Expose
    private Integer ceUsedVolume;
    @SerializedName("CE_USED_VOLUME_ADDITIONAL")
    @Expose
    private Integer ceUsedVolumeAdditional;
    @SerializedName("CE_USED_COUNT")
    @Expose
    private Integer ceUsedCount;
    @SerializedName("CE_NEW_COUNT")
    @Expose
    private Integer total_volume_used;
    @SerializedName("total_volume_used")
    @Expose
    private Integer ceNewCount;
    @SerializedName("employee_grade_per")
    @Expose
    private String employeeGradePer;
    @SerializedName("EARLY_BIRD_VOLUME")
    @Expose
    private Integer earlyBirdVolume;
    @SerializedName("EARLY_BIRD_COUNT")
    @Expose
    private Integer earlyBirdCount;
    @SerializedName("EARLY_BIRD_DAYS")
    @Expose
    private Integer earlyBirdDays;
    @SerializedName("BULK_FILE_COUNT")
    @Expose
    private Integer bulkFileCount;
    @SerializedName("DUAL_CASES_COUNT")
    @Expose
    private Integer dualCasesCount;
    @SerializedName("TOTAL_BULK_COUNT")
    @Expose
    private Integer totalBulkCount;
    @SerializedName("total_volume")
    @Expose
    private Integer totalFileVolume;
    

    public CBSLpayoutPerCaseInstance(String agreement_NO, Integer service_CHARGE, String product2, String zone2,
			Integer amount_FINANCED, Integer business_IRR, Integer sfe_SALARY, String region2, String scheme2,
			String manufacturer2, String asset_CATEGORY, Integer document_CHARGE, String asset_TYPE, Integer broker_AMT,
			Integer w_IRR, String psa_FLAG,
			String scheme_TYPE_ADD, String cfe_ID, Integer total_VOLUME_USED,
			Integer add_PO_FILE_PROCESSED_COUNT, String remarks2, String rlh2, Integer tw3_COUNT, Integer tw2_RE_COUNT,
			Integer tw2_ONLY_RE_COUNT, Integer tw2_NONRE_COUNT, Integer tractor_USED_COUNT,
			Integer tractor_NEW_USED_COUNT, Integer tractor_NEW_COUNT, 
			
			
			Integer pv_CV_USED_COUNT,
			Integer pv_CV_NEW_COUNT, Integer scheme_SPECIFIC_VOLUME_PER, Date lms_DATE, Integer ce_NEW_VOLUME,
			Integer ce_USED_VOLUME, Integer ce_USED_VOLUME_ADDITIONAL, Integer ce_USED_COUNT, Integer ce_NEW_COUNT,
			String employee_GRADE_PER, Integer early_BIRD_VOLUME, Integer early_BIRD_COUNT, Integer early_BIRD_DAYS,
			Integer bulk_FILE_COUNT , Integer tOTAL_FILE_VOLUME ) {
    	
		    		this.id = agreement_NO;
		    		this.serviceCharge = service_CHARGE;
		    		this.product = product2;
		    		this.zone = zone2;
		    		this.amountFinanced = amount_FINANCED;
    				this.businessIrr = business_IRR;
    				this.sfeSalary = sfe_SALARY;
    				this.region = region2;
    				this.scheme = scheme2;
    				this.manufacturer = manufacturer2;
    				this.assetCategory = asset_CATEGORY;
    				this.documentCharge = document_CHARGE;
    				this.assetType = asset_TYPE;
    				this.brokerAmt = broker_AMT;
    				this.wIrr = w_IRR;
    				this.psaFlag = psa_FLAG;
    				this.schemeTypeAdd = scheme_TYPE_ADD;
    				this.cfeId = cfe_ID;
    				this.total_volume_used = total_VOLUME_USED;
    				this.addPoFileProcessedCount = add_PO_FILE_PROCESSED_COUNT;
    				this.remarks = remarks2;
    				this.rlh = rlh2;
    				this.tw3Count = tw3_COUNT;
    				this.tw2ReCount = tw2_RE_COUNT;
    				this.tw2OnlyReCount = tw2_ONLY_RE_COUNT;
    				this.tw2NonreCount = tw2_NONRE_COUNT;
    				this.tractorUsedCount = tractor_USED_COUNT;
    				this.tractorNewUsedCount = tractor_NEW_USED_COUNT;
    				this.tractorNewCount = tractor_NEW_COUNT;
    				this.pvCvUsedCount = pv_CV_USED_COUNT;
    				this.pvCvNewCount = pv_CV_NEW_COUNT;
    				this.schemeSpecficVolumePer = scheme_SPECIFIC_VOLUME_PER;
    				this.lmsDatePer = lms_DATE;
    				this.ceNewVolume = ce_NEW_VOLUME;
    				this.ceUsedVolume = ce_USED_VOLUME;
    				this.ceUsedVolumeAdditional = ce_USED_VOLUME_ADDITIONAL;
    				this.ceUsedCount = ce_USED_COUNT;
    				this.ceNewCount = ce_NEW_COUNT;
    				this.employeeGradePer = employee_GRADE_PER;
    				this.earlyBirdVolume = early_BIRD_VOLUME;
    				this.earlyBirdCount = early_BIRD_COUNT;
    				this.earlyBirdDays = early_BIRD_DAYS;
    				this.bulkFileCount = bulk_FILE_COUNT;
    				this.totalFileVolume = tOTAL_FILE_VOLUME;
    			
    				}

    
	public Integer getTotalFileVolume() {
		return totalFileVolume;
	}


	public void setTotalFileVolume(Integer totalFileVolume) {
		this.totalFileVolume = totalFileVolume;
	}


	public Date getLmsDatePer() {
		return lmsDatePer;
	}


	public void setLmsDatePer(Date lmsDatePer) {
		this.lmsDatePer = lmsDatePer;
	}


	public Integer getTotal_volume_used() {
		return total_volume_used;
	}

	public void setTotal_volume_used(Integer total_volume_used) {
		this.total_volume_used = total_volume_used;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getAmountFinanced() {
        return amountFinanced;
    }

    public void setAmountFinanced(Integer amountFinanced) {
        this.amountFinanced = amountFinanced;
    }

    public Integer getBusinessIrr() {
        return businessIrr;
    }

    public void setBusinessIrr(Integer businessIrr) {
        this.businessIrr = businessIrr;
    }

    public Integer getSfeSalary() {
        return sfeSalary;
    }

    public void setSfeSalary(Integer sfeSalary) {
        this.sfeSalary = sfeSalary;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAssetCategory() {
        return assetCategory;
    }

    public void setAssetCategory(String assetCategory) {
        this.assetCategory = assetCategory;
    }

    public Integer getDocumentCharge() {
        return documentCharge;
    }

    public void setDocumentCharge(Integer documentCharge) {
        this.documentCharge = documentCharge;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public Integer getBrokerAmt() {
        return brokerAmt;
    }

    public void setBrokerAmt(Integer brokerAmt) {
        this.brokerAmt = brokerAmt;
    }

    public Integer getWIrr() {
        return wIrr;
    }

    public void setWIrr(Integer wIrr) {
        this.wIrr = wIrr;
    }

    public String getPsaFlag() {
        return psaFlag;
    }

    public void setPsaFlag(String psaFlag) {
        this.psaFlag = psaFlag;
    }

    public String getSchemeTypeAdd() {
        return schemeTypeAdd;
    }

    public void setSchemeTypeAdd(String schemeTypeAdd) {
        this.schemeTypeAdd = schemeTypeAdd;
    }



    public String getCfeId() {
        return cfeId;
    }

    public void setCfeId(String cfeId) {
        this.cfeId = cfeId;
    }


    public Integer getAddPoFileProcessedCount() {
        return addPoFileProcessedCount;
    }

    public void setAddPoFileProcessedCount(Integer addPoFileProcessedCount) {
        this.addPoFileProcessedCount = addPoFileProcessedCount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRlh() {
        return rlh;
    }

    public void setRlh(String rlh) {
        this.rlh = rlh;
    }

    public Integer getTw3Count() {
        return tw3Count;
    }

    public void setTw3Count(Integer tw3Count) {
        this.tw3Count = tw3Count;
    }

    public Integer getTw2ReCount() {
        return tw2ReCount;
    }

    public void setTw2ReCount(Integer tw2ReCount) {
        this.tw2ReCount = tw2ReCount;
    }

    public Integer getTw2OnlyReCount() {
        return tw2OnlyReCount;
    }

    public void setTw2OnlyReCount(Integer tw2OnlyReCount) {
        this.tw2OnlyReCount = tw2OnlyReCount;
    }

    public Integer getTw2NonreCount() {
        return tw2NonreCount;
    }

    public void setTw2NonreCount(Integer tw2NonreCount) {
        this.tw2NonreCount = tw2NonreCount;
    }

    public Integer getTractorUsedCount() {
        return tractorUsedCount;
    }

    public void setTractorUsedCount(Integer tractorUsedCount) {
        this.tractorUsedCount = tractorUsedCount;
    }

    public Integer getTractorNewUsedCount() {
        return tractorNewUsedCount;
    }

    public void setTractorNewUsedCount(Integer tractorNewUsedCount) {
        this.tractorNewUsedCount = tractorNewUsedCount;
    }

    public Integer getTractorNewCount() {
        return tractorNewCount;
    }

    public void setTractorNewCount(Integer tractorNewCount) {
        this.tractorNewCount = tractorNewCount;
    }

    public Integer getPvCvUsedCount() {
        return pvCvUsedCount;
    }

    public void setPvCvUsedCount(Integer pvCvUsedCount) {
        this.pvCvUsedCount = pvCvUsedCount;
    }

    public Integer getPvCvNewCount() {
        return pvCvNewCount;
    }

    public void setPvCvNewCount(Integer pvCvNewCount) {
        this.pvCvNewCount = pvCvNewCount;
    }

    public Integer getSchemeSpecficVolumePer() {
        return schemeSpecficVolumePer;
    }

    public void setSchemeSpecficVolumePer(Integer schemeSpecficVolumePer) {
        this.schemeSpecficVolumePer = schemeSpecficVolumePer;
    }

 

    public Integer getCeNewVolume() {
        return ceNewVolume;
    }

    public void setCeNewVolume(Integer ceNewVolume) {
        this.ceNewVolume = ceNewVolume;
    }

    public Integer getCeUsedVolume() {
        return ceUsedVolume;
    }

    public void setCeUsedVolume(Integer ceUsedVolume) {
        this.ceUsedVolume = ceUsedVolume;
    }

    public Integer getCeUsedVolumeAdditional() {
        return ceUsedVolumeAdditional;
    }

    public void setCeUsedVolumeAdditional(Integer ceUsedVolumeAdditional) {
        this.ceUsedVolumeAdditional = ceUsedVolumeAdditional;
    }

    public Integer getCeUsedCount() {
        return ceUsedCount;
    }

    public void setCeUsedCount(Integer ceUsedCount) {
        this.ceUsedCount = ceUsedCount;
    }

    public Integer getCeNewCount() {
        return ceNewCount;
    }

    public void setCeNewCount(Integer ceNewCount) {
        this.ceNewCount = ceNewCount;
    }

    public String getEmployeeGradePer() {
        return employeeGradePer;
    }

    public void setEmployeeGradePer(String employeeGradePer) {
        this.employeeGradePer = employeeGradePer;
    }

    public Integer getEarlyBirdVolume() {
        return earlyBirdVolume;
    }

    public void setEarlyBirdVolume(Integer earlyBirdVolume) {
        this.earlyBirdVolume = earlyBirdVolume;
    }

    public Integer getEarlyBirdCount() {
        return earlyBirdCount;
    }

    public void setEarlyBirdCount(Integer earlyBirdCount) {
        this.earlyBirdCount = earlyBirdCount;
    }

    public Integer getEarlyBirdDays() {
        return earlyBirdDays;
    }

    public void setEarlyBirdDays(Integer earlyBirdDays) {
        this.earlyBirdDays = earlyBirdDays;
    }

    public Integer getBulkFileCount() {
        return bulkFileCount;
    }

    public void setBulkFileCount(Integer bulkFileCount) {
        this.bulkFileCount = bulkFileCount;
    }

    public Integer getDualCasesCount() {
        return dualCasesCount;
    }

    public void setDualCasesCount(Integer dualCasesCount) {
        this.dualCasesCount = dualCasesCount;
    }

    public Integer getTotalBulkCount() {
        return totalBulkCount;
    }

    public void setTotalBulkCount(Integer totalBulkCount) {
        this.totalBulkCount = totalBulkCount;
    }

}
