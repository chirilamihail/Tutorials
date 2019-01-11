package exceptionfiles;

public class CommonExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		int b=0;
		// 1. Identify potential problem area
		// 2. try catch block
		try {
		int c=a/b;
		} catch (ArithmeticException e) {
			System.out.println("DIVIDE BY ZERO");
			System.out.println(e.toString());
		}
		
		String[] states = {"CA","LA","NY"};
		
		for (int i=0; i<=states.length; i++){
			try{
			System.out.println(states[i]);
			}
			catch (ArrayIndexOutOfBoundsException e){
				
			System.out.println("Error: Index outside of array domain");
			System.out.println(e.toString());
			}
			finally {
				System.out.println("Iterating through...");
			}
		}
		System.out.println("Closing");
	}

}
