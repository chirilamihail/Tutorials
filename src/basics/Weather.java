package basics;

public class Weather {
	public static void main (String[] args)
	{
	int temparature =65;
	String sunCond = "Sunny";
	
	if (temparature > 80) {
		System.out.println ("It's ok");
		}
	else if ((temparature > 60) && (sunCond =="Sunny"))
	{
		System.out.println ("It's not really ok");
		System.out.println ("It's Sunny");
	}
	else {
		System.out.println ("It's not ok");
	}
	System.out.println ("eND");
	}

}
