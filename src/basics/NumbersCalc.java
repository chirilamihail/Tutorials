package basics;

public class NumbersCalc {
	public static void main (String[] args){
		System.out.println("Program starting:");
		printName("Mihail");
		int numA=10;
		int numB=23;
		addNumbers(numA,numB);
		int product = multiplyNumbers(numA,numB);
		System.out.println(product);
	}
	
	static void printName(String nume){
		System.out.println("My Name is: "+nume);
	}
	static void addNumbers(int numberA, int numberB){
		int sum = numberA+numberB;
		System.out.println ("SUM: "+ sum);
		
	}
	
	static int multiplyNumbers(int valueA, int valueB){
		int product= valueA * valueB;
		addNumbers (product+56,product);
		return product;
	}

}
