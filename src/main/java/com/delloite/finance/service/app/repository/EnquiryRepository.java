package com.delloite.finance.service.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.delloite.finance.service.app.model.Enquiry;


@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>
{

	
	

	

}
