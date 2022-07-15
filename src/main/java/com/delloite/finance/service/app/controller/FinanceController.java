package com.delloite.finance.service.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.delloite.finance.service.app.model.CustomerAllDocument;
import com.delloite.finance.service.app.model.CustomerDetails;
import com.delloite.finance.service.app.model.EmployeeDetails;
import com.delloite.finance.service.app.model.Enquiry;
import com.delloite.finance.service.app.service.FinanceService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.MediaType;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/delloitefinance/service")

public class FinanceController

{ @Autowired
	FinanceService fs;

	@GetMapping("/")
	public String HomeLogin()
	{
		return "Welcome To Delloite Finance Services";
		
	}
	
	@PostMapping(value="/setEnquiryDetail")
	public String postEnquiryData(@RequestBody Enquiry e)
	{
		fs.saveData(e);
	return "Enquiry details set";

	}	
	

	@PostMapping(value="/setCustomerAllDetail", consumes=MediaType.ALL_VALUE)
	public String postCustomerAllDetail(@RequestPart(required=true, value="panCopy")MultipartFile file1,
			@RequestPart(required=true, value="uidCopy")MultipartFile file2,
            @RequestPart( required = true, value="bankPassBookCopy")MultipartFile file3,
            @RequestPart(required=true, value="photo")MultipartFile file4,
            @RequestPart(required=true, value="signature")MultipartFile file5,
            @RequestPart(required=true, value="cancelledCheck")MultipartFile file6,
            @RequestPart(required=true, value="salarySlip")MultipartFile file7,
           
            @RequestPart("doc")String doc) throws IOException
			                            
	{ 
		
		
		//CustomerDetails cad=new CustomerDetails();
		
		CustomerAllDocument customerAllDocument=new CustomerAllDocument();
		customerAllDocument.setPanCopy(file1.getBytes());
		customerAllDocument.setUidCopy(file2.getBytes());		
		customerAllDocument.setBankPassBookCopy(file3.getBytes());
		customerAllDocument.setPhoto(file4.getBytes());
		customerAllDocument.setSignature(file5.getBytes());
		customerAllDocument.setCancelledCheck(file6.getBytes());
		customerAllDocument.setSalarySlip(file7.getBytes());
	
		System.out.println(doc);
	   ObjectMapper om=new ObjectMapper();
	   
	   CustomerDetails cd=om.readValue(doc, CustomerDetails.class); 
	    
	   	System.out.println(cd);
		  System.out.println(doc);
		  cd.setCustomerAllDocument(customerAllDocument);
	
		   fs.postCustomerAllDetail(cd);
	       return "Customer details saved successfully";

	}	

	  
	   @GetMapping("/getCustomerAllDetails")
	   public List<CustomerDetails> getCustomerDetails()
	   {
		   List<CustomerDetails> gcd=fs.getCustomerAllDetails();
		   return gcd;
	   }
	   
	   @PutMapping(value="/updateCustomerAllDetail")
		public String updateCustomerAllDetails(@RequestBody CustomerDetails doc)
		{	
			   fs.updateCustomerAllDetail(doc);
		       return "Customer details updated successfully";

		}	

		  
	   
	   

 }
