package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount acc1 = new BankAccount();
   
    acc1.accountNumber = "010102";
    acc1.balance = 1230;
    ///acc1.name = "marcelus";
    acc1.setName("Marcel Who");
    acc1.setCNP("1232156456456");
    acc1.setRate();
    acc1.increaseRate();
    System.out.println( acc1.getCNP());
    System.out.println(acc1.getName());
    System.out.println(acc1.toString());
    acc1.deposit(2340);
    acc1.deposit(100);
    acc1.deposit(1230);
    
    BankAccount acc2 = new BankAccount(" Checking account ",12900);
    acc2.accountNumber = "013102";
    acc2.checkBalance();
    //System.out.println(acc1.routingNumber);
   // System.out.println(acc2.routingNumber);
    
    
    /*CDAccount cd1 = new CDAccount();
    cd1.balance = 3000;
    cd1.interestRate = "4.5";
    cd1.name = "Nume1";
    cd1.accountType = "CD Account";
    System.out.println(cd1.toString());
    cd1.compund();*/
	}

}
