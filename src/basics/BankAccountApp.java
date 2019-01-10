package basics;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BankAccount acc1 = new BankAccount("18943905434",1000);
   BankAccount acc2 = new BankAccount("19043905434",2340);
   BankAccount acc3 = new BankAccount("3343905434",3450);
  
   
   acc1.setName("Client1");
   System.out.println(acc1.getName());
   acc1.makeDeposit(120);
   acc1.showBalance();
   acc1.payBill(566);
   acc1.showBalance();
   acc1.accrue();
   acc1.showBalance();
   System.out.println(acc1.toString());
	}
}
	class BankAccount implements IInterest{
		private static int iD = 1000;
		private String accountNumber; ///id+CNP+random 2 digit no
		private final static String zona = "00001";
		private String name;
		private String CNP;
		private double balance;
		
		//
		public BankAccount(String CNP, double initDep){
			//System.out.println("Created");
			balance=initDep;
			this.CNP= CNP;
			iD++;
			setAccountNumber();
			
		}
		private void setAccountNumber(){
			int random = (int) Math.random() * 100;
			accountNumber = iD + "" + random + CNP.substring(0,2);
			System.out.println("Your AccNo: "+accountNumber);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void payBill (double amount){
			System.out.println("Pay a bill "+ amount);
			balance = balance - amount;
		}
		public void makeDeposit(double amount){
			balance= balance + amount;
		}
		public void showBalance (){
			System.out.println("Balance: "+balance);
		}
		
		public void accrue(){
			balance = balance * (1+rate/100);
		}
		@Override
		public String toString(){
			return "[Name " + name + "]"+ accountNumber + " ]\n" + zona +" n" +"Balance :"+ balance + " \n";
			
		}
		
	}


