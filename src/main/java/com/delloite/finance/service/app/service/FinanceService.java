package com.delloite.finance.service.app.service;


import java.util.List;

import com.delloite.finance.service.app.model.CustomerDetails;
import com.delloite.finance.service.app.model.EmployeeDetails;
import com.delloite.finance.service.app.model.Enquiry;

public interface FinanceService 
{

	public void saveData(Enquiry e);

	public void postCustomerAllDetail(CustomerDetails cad);

	public void saveEmployeeDetails(EmployeeDetails ed);

	public List<CustomerDetails> getCustomerAllDetails();

	public void updateCustomerAllDetail(CustomerDetails doc);


}
