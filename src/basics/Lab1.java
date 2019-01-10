package basics;

public class Lab1 {
	// takes a value n and returns sum of 1..n
	public static void main(String[] args) {
		System.out.println ( fact(4));
		int[] numbers = {5,-2,0,234,-438,63};
	}
	public static int sum(int n){
		int sum = 0;
		for (int i =1; i<=n;i++){
			sum = sum + i;
		}
		return sum;
	}
    public static int fact(int n){
    	if (n <= 1) {
    		return 1;
    	}
    	else if (n == 2) {
    		return 2;
    	}
    	return (n*fact(n-1));
    }
 }
