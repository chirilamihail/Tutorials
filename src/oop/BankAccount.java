package oop;

public class BankAccount implements IRate{
	
	String accountNumber;
	//static belongs to the class not the object instance
	//final is like constant
	private static final String routingNumber = "012345";
	private String name;
	private String CNP;
	String accountType;
	double balance = 0;
	//Constructor definition; unique methods
	   ///1. used to define/setup/initiliaza properties of an object
	BankAccount(){
		System.out.println("New account created");
	}
	//Overloading
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New account created"+accountType);
		System.out.println("New account created"+initDeposit);
		String errmsg = null;
		if (initDeposit < 1000){
			errmsg = "minimum amount must be at least $1200";
			
		
		} else {
			System.out.println("Thanks");
		}
		System.out.println(errmsg);
		balance = balance + initDeposit;
			
	}
	
	///getters setters
	
	public void  setName (String name) {
		this.name = "Domnul/doamna : "+ name;
	}
	public String getName (){
		return name;
	}
	
	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		this.CNP = cNP;
	}
   // interface methods
	public void setRate(){
		System.out.println("rate");
	}
	public void increaseRate(){
		System.out.println("Increase rate");
	}
	// Methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("Deposit");
	}
	public void withdraw(double amount){
		balance = balance - amount;
		showActivity("WithDraw");
    	
    }
	private void showActivity(String activity) {
		
		System.out.println("Show recent activity " + activity);
		System.out.println("Your new balance is "+ balance);
	}
	public void getStatus(){
    	
    }
    void checkBalance(){
    	System.out.println("Balance is "+ balance);
    }
    @Override
    public String toString (){
	 return "[ " + name + ", " + accountNumber + " Balance " + balance + "]";
 }
        
}
