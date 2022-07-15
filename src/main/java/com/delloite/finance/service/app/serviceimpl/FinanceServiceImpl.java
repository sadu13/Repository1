package com.delloite.finance.service.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delloite.finance.service.app.model.CustomerDetails;
import com.delloite.finance.service.app.model.EmployeeDetails;
import com.delloite.finance.service.app.model.Enquiry;
import com.delloite.finance.service.app.repository.CustomerDetailsRepository;
import com.delloite.finance.service.app.repository.EmployeeRepository;
import com.delloite.finance.service.app.repository.EnquiryRepository;
import com.delloite.finance.service.app.service.FinanceService;

@Service
public class FinanceServiceImpl implements FinanceService
{
	@Autowired
	EnquiryRepository er;
	@Autowired
	CustomerDetailsRepository cdr;
	@Autowired
	EmployeeRepository empR;

	@Override
	public void saveData(Enquiry e) {
		
		er.save(e);
	}

	@Override
	public void postCustomerAllDetail(CustomerDetails cad)
	{
		
		cdr.save(cad);
		
	}

	@Override
	public void saveEmployeeDetails(EmployeeDetails ed) {
		empR.save(ed);
		
	}

	@Override
	public List<CustomerDetails> getCustomerAllDetails() {
	
		return cdr.findAll();
	}

	@Override
	public void updateCustomerAllDetail(CustomerDetails doc) {
		cdr.save(doc);
		
	}

	

}
