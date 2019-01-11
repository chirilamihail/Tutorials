package exceptionfiles;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		doMath(12,0);
		System.out.println("Continue");
	}
	public static void doMath(int a , int b){
		answer(a,b);
		
	}
	public static double answer(int x, int y){
		//Catch error here
		return x/y;
	}
}
