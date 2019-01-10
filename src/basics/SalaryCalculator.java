package basics;

public class SalaryCalculator {
	public static void main (String[] args){
		String career;
		System.out.println("program is starting:");
		career = "Soft Develop";
		System.out.print("My career is "+career);
		
		int hoursWeek = 40;
		int weeksyears=50;
		double rate = 42.50;
	
		double salary = hoursWeek*weeksyears*rate;
		System.out.println("My salary as a "+ career + " at the rate of " + rate + " is " + salary);
		
		
		
	}

}
