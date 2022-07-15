package com.delloite.finance.service.app.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class CustomerDetails
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String customerName;
	private long customerMobileno;
	private String customerDOB;
	private String customerEmailId;
	private String customerPanNo;
	private String customerAadharNo;
	private String customerGender;
	private String customerIncome;
	private String cibil;
	private String loanStatus;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAllDocument customerAllDocument;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 private CustomerLocalAddress customerlocalAddress;
		
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerPermanentAddress customerPermanentAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;

    @OneToOne(cascade = CascadeType.ALL)
    private CustomerBankAccountDetails customerBankAccountDetails;
   
	


}
