package com.project.Controller;

import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.project.model.Case;
import com.project.model.CaseRequest;
import com.project.dbConnect.POJO;
import com.project.dbConnect.service;


@Component
public class ControllerService {
	
	
	@Value("${spring.datasource.url}")
	private String url ;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Autowired Environment env ;
	
    String status="";

    public String Response(@RequestBody String json) throws Exception {
    	
    	//System.out.println("request--------->"+json);
    	RestTemplate restTemplate2 = new RestTemplate();
    	
    	//System.out.println("response test");

    	
    	String urlString2 = "https://cholamandalam--tst1.custhelp.com/determinations-server/batch/12.2.7/policy-models/CholaCBSLPayout/assessor";
        URI uri = new URI(urlString2);
        
    	//System.out.println("response test 2");

    	
    	HttpHeaders headers2 = new HttpHeaders();
    	headers2.setContentType(MediaType.APPLICATION_JSON);

    	HttpEntity<String> entity2 = new HttpEntity<String>(json,headers2);
    	String answer = restTemplate2.postForObject(uri, entity2, String.class);
    	//System.out.println("answer ========= "+answer);
    	
   	
    	try 
    	{
    		//Class.forName("oracle.jdbc.driver.OracleDriver");
			//String mysqlUrl = "jdbc:oracle:thin:@mexacscifcl-sqmcv-scan.dbprimarysn.dbexacsvcn01.oraclevcn.com:1625/SITFIN_SITFIN_PDB.paas.oracle.com";
    		url = env.getProperty("spring.datasource.url");
    		username = env.getProperty("spring.datasource.username");
    		password = env.getProperty("spring.datasource.password");
    		
    		Connection con = DriverManager.getConnection(url,username,password);
    		
			System.out.println("Connection established......");
			
			try
			{
				JSONObject jsonObj = new JSONObject(answer);
				
				JSONArray ja_data = jsonObj.getJSONArray("cases");
				//int ja_len = ja_data.length();
				//System.out.println( "ja_data length ===================" + ja_len);
				
				JSONObject jsonObj1 = ja_data.getJSONObject(0);
				JSONArray ja = jsonObj1.getJSONArray("CBSLpayoutPerCaseInstance");
				int len = ja.length();

				ArrayList<String> id = new ArrayList<>();
				ArrayList<Object> SC_INCENTIVElist = new ArrayList<>();
				ArrayList<Object> TL_SC_INCENTIVElist = new ArrayList<>();
				ArrayList<Object> CFE_INCENTIVElist = new ArrayList<>();
				ArrayList<Object> SFE_PSA_INCENTIVElist = new ArrayList<>();
				ArrayList<Object> COA_PSA_INCENTIVElist = new ArrayList<>();
				//System.out.println("ja.Len  ================== "+len);
				
				
				for(int j=0; j<len; j++)
				{
					JSONObject jsonz = ja.getJSONObject(j);
					  System.out.println(jsonz);
					  
					  id.add(jsonz.getString("@id"));
					  TL_SC_INCENTIVElist.add(jsonz.get("SC_INCENTIVE"));
					  TL_SC_INCENTIVElist.add(jsonz.get("TL_SC_INCENTIVE"));
					  CFE_INCENTIVElist.add(jsonz.get("CFE_INCENTIVE"));
					  SFE_PSA_INCENTIVElist.add(jsonz.get("SFE_PSA_INCENTIVE"));
					  COA_PSA_INCENTIVElist.add (jsonz.get("COA_PSA_INCENTIVE"));
					
				}
				System.out.println("Copied.........");
				int size=id.size();
				//System.out.println("Size : "+size);
				int count=0;
				PreparedStatement ps_processing,ps_pro,ps_unpro;
				
				try
				{
					System.out.println("...........Records Processing.........");
					ps_processing = con.prepareStatement("UPDATE PAYOUT_CBSL_PERCASE SET SC_INCENTIVE =? ,TL_SC_INCENTIVE = ?, CFE_INCENTIVE = ? ,SFE_PSA_INCENTIVE = ?,COA_PSA_INCENTIVE = ?,STATUS = 'PROCESSING' WHERE AGREEMENT_NO = ?");		          
				
				String agreementno = "";
				String SCINCENTIVE = "";
				String TL_SCINCENTIVE = "";
				String CFEINCENTIVE = "";
				String SFE_PSAINCENTIVE = "";
				String COA_PSAINCENTIVE = "";
				
					for(int i=0;i<size;i++)
					{
						 agreementno = id.get(i) ;
						 System.out.println("agreementno : "+agreementno);
						 
						 if(SC_INCENTIVElist.get(i).toString().equals("null") || SC_INCENTIVElist.get(i).toString().equals("{}")){
								
								SCINCENTIVE = "0";

								 }else {
									 SCINCENTIVE = SC_INCENTIVElist.get(i).toString();

								 }     
							
							System.out.println("SC_INCENTIVE ===  "+SCINCENTIVE);
							
						
						if(TL_SC_INCENTIVElist.get(i).toString().equals("null") || TL_SC_INCENTIVElist.get(i).toString().equals("{}")){
							
							TL_SCINCENTIVE = "0";

							 }else {
								 TL_SCINCENTIVE = TL_SC_INCENTIVElist.get(i).toString();

							 }     
						
						System.out.println("TL_SC_INCENTIVE ===  "+TL_SCINCENTIVE);
						
						//Integer cfe = CFE_INCENTIVElist.get(i).toString().length();
						
						//System.out.println("cfe length ========= " + cfe);
				
						
						if(CFE_INCENTIVElist.get(i).toString().equals("null") || CFE_INCENTIVElist.get(i).toString().equals("{}")) {
							
							CFEINCENTIVE = "0";
							


						 }else {
							 CFEINCENTIVE = CFE_INCENTIVElist.get(i).toString();

						 }
						//System.out.println("total incentive ==== "+TOTAL.get(i));
						System.out.println("CFE_INCENTIVE === "+CFEINCENTIVE);


						if(SFE_PSA_INCENTIVElist.get(i).toString().equals("null")  || SFE_PSA_INCENTIVElist.get(i).toString().equals("{}")){
							SFE_PSAINCENTIVE =  "0";


							 }else {
								 SFE_PSAINCENTIVE = SFE_PSA_INCENTIVElist.get(i).toString();

							 }
						System.out.println("SFE_PSA_INCENTIVE  ===  "+SFE_PSAINCENTIVE);

						if(COA_PSA_INCENTIVElist.get(i).toString().equals("null") || COA_PSA_INCENTIVElist.get(i).toString().equals("{}")) {  
							COA_PSAINCENTIVE =  "0";

							 }else {
									
								 COA_PSAINCENTIVE = COA_PSA_INCENTIVElist.get(i).toString();

							 }
						
						System.out.println("COA_PSA_INCENTIVE  ===  "+COA_PSAINCENTIVE);

						ps_processing.setDouble(1, Double.parseDouble(TL_SCINCENTIVE));
						//ps_processing.setInt(1,Integer.parseInt (TL_SCINCENTIVE));
						//System.out.println(ps_processing.setInt(1, (Integer) ruleid));
						//ps_processing.setInt(2,Integer.parseInt (CFEINCENTIVE));
						//ps_processing.setInt(3,Integer.parseInt (SFE_PSAINCENTIVE));
						//ps_processing.setInt(4,Integer.parseInt (COA_PSAINCENTIVE));

						ps_processing.setDouble(2,Double.parseDouble(CFEINCENTIVE) );
						ps_processing.setDouble(3, Double.parseDouble(SFE_PSAINCENTIVE));
						ps_processing.setDouble(4, Double.parseDouble(COA_PSAINCENTIVE));
						ps_processing.setString(5, agreementno);
						//ps_processing.executeUpdate();
						count++;
						//System.out.rintln(count+" row updated");
					}
					ps_processing.close();
					
					ps_pro=con.prepareStatement("UPDATE PAYOUT_CBSL_PERCASE SET STATUS ='PROCESSED' WHERE STATUS = 'PROCESSING'");
					//ps_pro.executeUpdate();
					ps_pro.close();
					
					System.out.println("............Records Processed.........");
					
				} 
				catch(Exception e3)
				{
					ps_unpro=con.prepareStatement("UPDATE PAYOUT_CBSL_PERCASE SET STATUS='FAILED' WHERE STATUS = 'PROCESSING' ");
					//ps_unpro.executeUpdate();
					ps_unpro.close();
														
					System.out.println("*******Failed*********");
					System.out.println(e3.getLocalizedMessage());
				}
								
				System.out.println(count+" >>>>>>>>>>>>>Records Updated....."); 
							
			} 
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			finally {
				try {
					con.close();
					System.out.println("Connection closed..........");
				} 
				catch (SQLException sqlException)
				{
					sqlException.printStackTrace();
				}
			}
			    	
    	} 
    	catch(Exception e2)
    	{
    		e2.printStackTrace();
    	}
    	
    	
    	
    	return answer;
    	
    }

    
   // ==========================================REQUEST=====================================
    
  @Autowired(required = true) service serv;
    
  @Autowired(required = true) POJO pojo;

//@Scheduled(fixedRate = 5000 )

public String Request() throws IOException {
			
    	String apiResponse="";
    	
    	CaseRequest caseRequest=new CaseRequest();
    	
    	List <Case> casesList=new ArrayList<Case>();
    	casesList.add(serv.Fetch_Data());
    	caseRequest.setCases(casesList);
    	
    	List <String> outcome=new ArrayList<String>();
    	
    	//System.out.println("before");
    	
    	outcome.add("SC_INCENTIVE");
    	outcome.add("TL_SC_INCENTIVE");
    	outcome.add("CFE_INCENTIVE");
    	outcome.add("SFE_PSA_INCENTIVE");
    	outcome.add("COA_PSA_INCENTIVE");
    	
    	
    	outcome.add("RULE_PER");
    	outcome.add("RULE_ADD_PER");
    	outcome.add("RULE_SC_ACH");
    	outcome.add("RULE_SC_IN");
    	outcome.add("RULE_CFE");
    	outcome.add("RULE_PSI");
    	outcome.add("SFE_INCENTIVE");
    	outcome.add("SFE_ADD_PO");
    	outcome.add("DUAL_CASES_COUNT");
    	outcome.add("SFE_ADD_PO_USED");
    	outcome.add("rule_add_used_per");
    	outcome.add("BULK_PO");
    	outcome.add("RULE_ID_BULK");
    	outcome.add("TOTAL_BULK_COUNT");
    	outcome.add("CE_ADD_PO");
    	outcome.add("rlh_bonus_incentive");
    	outcome.add("scheme_specific_bonus_incentive");
    	outcome.add("SFE_ADD_PO_CE_USED");
    	outcome.add("RULE_ID_CE_USED_ADD");
    	outcome.add("early_bird_incentive");
    	
    	//System.out.println("after");

    	
    	caseRequest.setOutcomes(outcome);
    	
    	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();    	
    	String json = gson.toJson(caseRequest);
    	
    	System.out.println("test");

    	
    	//String json2 = gson.toJson(caseRequest.getCases().get(0).getRelTractorVolumeMon().get(0).getLmsAuthDate());
    	//System.out.println(caseRequest.getCases().get(0).getRelTractorVolumeMon().get(0).getLmsAuthDate());
    	//System.out.println(json.toString());
    	//System.out.println("***************request*********"+"\n"+ json);
    	
		try
		{
			apiResponse =  Response(json);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			apiResponse="";
		}   	
    	//return json;
		
    	//System.out.println("test1");

		return apiResponse;		
	}
    

}

