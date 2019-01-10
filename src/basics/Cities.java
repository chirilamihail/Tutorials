package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /// declare and define of an array
		String[] cities = {"Cluuj","Bucuresti","Paris"};
	    System.out.println (cities[2]);
	    
	     
	    String[] countries;
	    
	    countries = new String[2];
	    countries[0]="Cluj";
	    countries[1]="Turda";
	    System.out.println (countries[1]);
	    
	    System.out.println("*****************");
	    String[] states = new String[5];
	    states[0]="Cluj";
	    states[1]="Turda";
	    states[2]="Mures";
	    states[3]="Sighisoara";
	    states[4]="Brasov";
	    int i=0;
	    do {
	    	System.out.println (states[i]);
	    	i = i+1;
	    } while (i<states.length);
	    int c=0;
	    boolean stateFound= false;
	    	
	    System.out.println("*****************");
	    while (!stateFound) {
	    	String state = states[c];
	    	System.out.println (state);
	    	if (state=="Cluj") {
	    		System.out.println (state + " found* "+ c);
	    		stateFound= true;
	    	}
	    	
	    	c++;
	    }
	    System.out.println ("-----------------");
	    /// for the best structure for iterating an array
	    for (int x = 0; x<5 ;x++) {
	    	
	    	System.out.println (states[x] + " LOOP ");
	    }
	    
	    
	}

}
