package com.mphasis.billsystem;

public class BillCalculator {

	public static void main(String[] args) {
		int units = 280;
		double billTOPay= 0;
		if(units<100)
		{
			billTOPay= units *1.20;
			
		}
		else if(units < 300)

		{
			billTOPay= 100 *1.20+(units-100) *2;
		}
		System.out.println("The electricity bill for "+units+ " is: "+billTOPay);
	    }

}
