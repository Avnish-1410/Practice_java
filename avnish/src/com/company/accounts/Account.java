package com.company.accounts;

public class Account {
	private int Acno;
	private String AcType;
	private double Balance;
	
	
	public Account(int acno, String acType, double balance) {
		Acno = acno;
		AcType = acType;
		Balance = balance;
	}
	
	
	public int getAcno() {
		return Acno;
	}


	public String getAcType() {
		return AcType;
	}


	public double getBalance() {
		return Balance;
	}


	public void displayAccountDetails() {
		System.out.println(Acno+" "+AcType+" "+Balance);
	}
}
