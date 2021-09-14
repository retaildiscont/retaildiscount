package com.retail.test;

import static org.junit.Assert.*;  
import org.junit.Test;

import com.retail.affiliate.Affiliate;
import com.retail.customer.Customer;
import com.retail.employee.Employee;

public class TestDiscount {
	
	Employee employee = new Employee();
	Affiliate affiliate = new Affiliate();
	Customer customer = new Customer();
	
	@Test
	public void testDiscountForEmployeeWithGroceries() {
		
		 double netAmount =0.0f;
		
		 netAmount = employee.getNetPayableAmount(500.25f, 2, "groceries");
		 assertEquals(475.25,netAmount,0.0);
		 
		 netAmount = employee.getNetPayableAmount(990.00f, 2, "groceries");
		 assertEquals(945,netAmount,0.0);
		
	}
	
	@Test
	public void testDiscountForEmployeeWithoutGroceries() {
		
		double netAmount =0.0f;
		
		netAmount = employee.getNetPayableAmount(500.00f, 2, "electronics");
		assertEquals(350,netAmount,0.0);	
		
		netAmount = employee.getNetPayableAmount(2000.00f, 2, "electronics");
		assertEquals(1400,netAmount,0.0);	
	}
	
	@Test
	public void testDiscountForAffiliateWithGroceries() {
		
		 double netAmount =0.0f;
		
		 netAmount = affiliate.getNetPayableAmount(500.25f, 2, "groceries");
		 assertEquals(475.25,netAmount,0.0);
		 
		 netAmount = affiliate.getNetPayableAmount(990.00f, 2, "groceries");
		 assertEquals(945,netAmount,0.0);
		
	}
	
	@Test
	public void testDiscountForAffiliateWithoutGroceries() {
		
		double netAmount =0.0f;
		
		netAmount = affiliate.getNetPayableAmount(500.00f, 2, "electronics");
		assertEquals(450,netAmount,0.0);	
		
		netAmount = affiliate.getNetPayableAmount(2000.00f, 2, "electronics");
		assertEquals(1800,netAmount,0.0);	
	}
	
	@Test
	public void testDiscountForCustomerWithGroceries() {
		
		 double netAmount =0.0f;
		
		 netAmount = customer.getNetPayableAmount(500.25f, 2, "groceries");
		 assertEquals(475.25,netAmount,0.0);
		 
		 netAmount = customer.getNetPayableAmount(990.00f, 2, "groceries");
		 assertEquals(945,netAmount,0.0);
		
	}
	
	@Test
	public void testDiscountForCustomerWithoutGroceries() {
		
		double netAmount =0.0f;
		
		netAmount = customer.getNetPayableAmount(500.00f, 2, "electronics");
		assertEquals(500,netAmount,0.0);	
		
		netAmount = customer.getNetPayableAmount(2000.00f, 2, "electronics");
		assertEquals(2000,netAmount,0.0);
		
		netAmount = customer.getNetPayableAmount(500.00f, 4, "electronics");
		assertEquals(475,netAmount,0.0);	
		
		netAmount = customer.getNetPayableAmount(2000.00f, 4, "electronics");
		assertEquals(1900,netAmount,0.0);
	}
	
	

}
