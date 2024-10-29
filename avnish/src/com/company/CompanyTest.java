package com.company;
import com.company.accounts.Account;
import com.company.hr.Employee;

public class CompanyTest {
	public static void main(String[] args) {
		
		Account ac = new Account(5603255, "Savings", 1500000);
		ac.displayAccountDetails();
		
		Employee emp = new Employee(1001, "avnish", 45000);
		emp.displayEmployeeDetails();
		
	}
}
