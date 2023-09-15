package com.composite.pk.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPk {
	
	private Long mobileNo;
	private Long aadharNo;
	private String passport;
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long i) {
		this.mobileNo = i;
	}
	public Long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long i) {
		this.aadharNo = i;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	@Override
	public String toString() {
		return "PersonPk [mobileNo=" + mobileNo + ", aadharNo=" + aadharNo + ", passport=" + passport + "]";
	}
	
	

}
