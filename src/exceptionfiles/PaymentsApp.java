package exceptionfiles;

import java.util.Scanner;

public class PaymentsApp {

	//Take a payment from a user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payment = 0;
		boolean positivePymnt = true;
		
		
		do{
			
		
		System.out.print("enter payment amount: ");
		//ask the user for input
		Scanner in = new Scanner(System.in);
		try{
		payment = in.nextDouble();
		 if (payment<=0){
			 
			 throw new NegativePaymentException(payment);
			 
		 } else {
			 positivePymnt = true;
		 }
		} catch (NegativePaymentException e) {
			System.out.println(e.toString());
			System.out.println("Please try again... ");
			System.out.println();
			positivePymnt = false;
		}
		} while (!positivePymnt);
		//get the amount and test the value
		
		//handle exceptions appropiate
		
		System.out.println("Thanks for payment! "+ payment);
		//prin confirmation
		

	}

}
