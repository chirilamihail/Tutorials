package exceptionfiles;

public class NegativePaymentException extends Exception{
	
	double payment;

	public NegativePaymentException(double payment){
		//System.out.println( "error : negative payment");
		this.payment=payment;
	}
	
	public String toString(){ 
		return "error cannot take negative payment " + payment;
	}
	}
