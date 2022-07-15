package com.delloite.finance.service.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delloite.finance.service.app.model.EmployeeDetails;
import com.delloite.finance.service.app.service.FinanceService;
@CrossOrigin("*")
@RestController
public class EmployeeController {
	 @Autowired
		FinanceService fs;
	
	 @PostMapping(value="/setEmployeeAllDetail")
	   public String postEmployeeAllDetail(@RequestBody EmployeeDetails ed) throws IOException
	   {
		 
		  fs.saveEmployeeDetails(ed);
		  return "Employee Details Saved successfully";
		
	   }
}
