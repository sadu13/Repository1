package com.delloite.finance.service.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustomerBankAccountDetails {
@Id
private long accountNumber;
private String ifscCode;
private String bankName;
private String address;

}
