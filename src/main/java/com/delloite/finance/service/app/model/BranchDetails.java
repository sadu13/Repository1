package com.delloite.finance.service.app.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class BranchDetails 
{
@Id	
private Integer branchId;
private String branchName;
private String branchType;
private Integer branchIfscCode;
private Integer microCode;
private Integer branchCode;
private Integer branchContactNo;
private Integer branchEmailId;
private Integer branchStatus;

}
