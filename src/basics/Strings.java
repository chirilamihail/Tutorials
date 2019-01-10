package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordC = "arip";
		bookTitle ="Pe Aripile vantului";
		
		if (bookTitle.contains(wordC)){
			System.out.println("Contine");
		}
	    if (bookTitle.equalsIgnoreCase(wordC)){
	    	System.out.println("Contine");
	    }
	}

}
