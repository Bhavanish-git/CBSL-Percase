package com.project.dbConnect;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.model.CBSLpayoutPerCaseInstance;
import com.project.model.Case;

@Repository
public class service {
	
	List<POJO> data = null;

	@Autowired JdbcTemplate dataTemplate;
	@Autowired Case cases;
	Integer count = null;
	String query1 = "SELECT AGREEMENT_NO,SERVICE_CHARGE,PRODUCT,ZONE,AMOUNT_FINANCED,BUSINESS_IRR,SFE_SALARY,REGION,SCHEME,MANUFACTURER,ASSET_CATEGORY,DOCUMENT_CHARGE,ASSET_TYPE,BROKER_AMT,W_IRR,PSA_FLAG,SCHEME_TYPE_ADD,CFE_ID,TOTAL_VOLUME_USED,ADD_PO_FILE_PROCESSED_COUNT,REMARKS,RLH,TW3_COUNT,TW2_RE_COUNT,TW2_ONLY_RE_COUNT,TW2_NONRE_COUNT,TRACTOR_USED_COUNT,TRACTOR_NEW_USED_COUNT,TRACTOR_NEW_COUNT,PV_CV_USED_COUNT,PV_CV_NEW_COUNT,SCHEME_SPECFIC_VOLUME_PER,to_char(to_date(LMS_DATE),'yyyy-MM-dd') as LMS_DATE,CE_NEW_VOLUME,CE_USED_VOLUME,CE_USED_VOLUME_ADDITIONAL,CE_USED_COUNT,CE_NEW_COUNT,EMPLOYEE_GRADE_PER,EARLY_BIRD_VOLUME,EARLY_BIRD_COUNT,EARLY_BIRD_DAYS,BULK_FILE_COUNT,TOTAL_FILE_VOLUME FROM PAYOUT_CBSL_PERCASE "
					+" WHERE STATUS='UNPROCESSED' AND ROWNUM <= 1";
		      
	public Case Fetch_Data() {
				
		    List<POJO> data = dataTemplate.query(query1,new BeanPropertyRowMapper<POJO>(POJO.class));
		    
			List<CBSLpayoutPerCaseInstance> CBSLpayoutPerCaseInstanceList = new ArrayList<>();
			
			Case cases=new Case();
			
			
			for (POJO obj:data)
				{
				
				CBSLpayoutPerCaseInstance entity= new CBSLpayoutPerCaseInstance (obj.getAGREEMENT_NO(),
																				obj.getSERVICE_CHARGE(),
																				obj.getPRODUCT(),
																				obj.getZONE(),
																				obj.getAMOUNT_FINANCED(),
																				obj.getBUSINESS_IRR(),
																				obj.getSFE_SALARY(),
																				obj.getREGION(),
																				obj.getSCHEME(),
																				obj.getMANUFACTURER(),
																				obj.getASSET_CATEGORY(),
																				obj.getDOCUMENT_CHARGE(),
																				obj.getASSET_TYPE(),
																				obj.getBROKER_AMT(),
																				obj.getW_IRR(),
																				obj.getPSA_FLAG(),
																				obj.getSCHEME_TYPE_ADD(),
																				obj.getCFE_ID(),
																				obj.getTOTAL_VOLUME_USED(),
																				obj.getADD_PO_FILE_PROCESSED_COUNT(),
																				obj.getREMARKS(),
																				obj.getRLH(),
																				obj.getTW3_COUNT(),
																				obj.getTW2_RE_COUNT(),
																				obj.getTW2_ONLY_RE_COUNT(),
																				obj.getTW2_NONRE_COUNT(),
																				obj.getTRACTOR_USED_COUNT(),
																				obj.getTRACTOR_NEW_USED_COUNT(),
																				obj.getTRACTOR_NEW_COUNT(),
																				obj.getPV_CV_USED_COUNT(),
																				obj.getPV_CV_NEW_COUNT(),
																				obj.getSCHEME_SPECIFIC_VOLUME_PER(),
																				obj.getLMS_DATE(),
																				obj.getCE_NEW_VOLUME(),
																				obj.getCE_USED_VOLUME(),
																				obj.getCE_USED_VOLUME_ADDITIONAL(),
																				obj.getCE_USED_COUNT(),
																				obj.getCE_NEW_COUNT(),
																				obj.getEMPLOYEE_GRADE_PER(),
																				obj.getEARLY_BIRD_VOLUME(),
																				obj.getEARLY_BIRD_COUNT(),
																				obj.getEARLY_BIRD_DAYS(),
																				obj.getBULK_FILE_COUNT(),
																				obj.getTOTAL_FILE_VOLUME()
																				
																		       );
				CBSLpayoutPerCaseInstanceList.add(entity);
					//count++;					
				}
				//System.out.println("count --------------------------" + count);
				cases.setId("Batch1");
				cases.setCBSLpayoutPerCaseInstance(CBSLpayoutPerCaseInstanceList);
				
				return cases;
	}
	
	 
}
