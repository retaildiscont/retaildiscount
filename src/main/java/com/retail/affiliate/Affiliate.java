package com.retail.affiliate;

import com.retail.user.User;

public class Affiliate implements User {


/**
* This method calculates the net payable amount after calculating discount on bill amount
* @param billAmount This is the first parameter in float to getNetPayableAmount() method
* @param duration This is the second parameter in int to getNetPayableAmount() method
* @param type This is the third parameter in String to getNetPayableAmount() method
* @return double This returns final net paybale amount after discount
*/	
public double getNetPayableAmount(float billAmount, int duration,String type) {
		
		double netAmount = 0.0f;
		
		if( type.equalsIgnoreCase("groceries")) {
			
			int discount = (int) (billAmount/100)*5;
			
			netAmount = billAmount - discount;
			
			
		} else {
			
			double discount = (billAmount * 10)/100;
			netAmount = billAmount - discount;
		}
		
		return netAmount;
	}

}
