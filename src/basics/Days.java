package basics;

public class Days {
	public static void main (String[] args){
		//execute different block of code based of a value of a condition
		String dayOfWeek="Friday";
		
		switch (dayOfWeek){
		case "Monday" :
			System.out.println("Luni");break;
		case "Tuesday" : 
			System.out.println("Marti");break;
		case "Wednesday" :
			System.out.println("Miercuri");break;
		case "Friday" :
			System.out.println("Vineri");break;
		}
	}
}
