package oop;

public class LoanAccount implements IRate{

	@Override
	public void setRate(){
		System.out.println("rate");
	}
	@Override
	public void increaseRate(){
		System.out.println("Increase Rate");	
	}
	public void setAmortSchedule(){
		System.out.println("Amortization");
	}
}
