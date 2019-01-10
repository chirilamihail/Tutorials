package basics;

public class FibonaciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int arrn[]; 
		arrn = new int[13];
		for (int k=0;k<arrn.length;k++){
			
			arrn[k] = k+8;
		}
		System.out.println("media"+ media (arrn));
		System.out.println("First "+ n + " Fibo numbers: ");
		for (int i =0;i<=n;i++){
			   System.out.println(fib(i));
		}
		System.out.println("First "+ n + " Fact numbers: ");
		for (int i =0;i<=n;i++){
			   System.out.println(fact(i));
		}
   
	}
    public static int fib(int n){
    	if (n == 0) {
    		return 0;
    	}
    	else if (n == 1) {
    		return 1;
    	}
    	return (fib(n-1)+fib(n-2));
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
    
    public static double media(int[] arrn){
    	double md =0;
    	
    	for (int l=0;l<arrn.length;l++){
			md = (md + arrn [l])/2;
			
		}
    	return md;
    }
    public static double suma(int[] arrn){
    	int sum =0;
    	
    	for (int l=0;l<arrn.length;l++){
			sum = sum + arrn[l];
			
		}
    	return sum;
    }
}
