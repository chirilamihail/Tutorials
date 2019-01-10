package oop;

class Person {
	
	String name;
	String email;
	String phone;
	void walk(){
		System.out.println(name + " walking");
	}
	void eat(){
		System.out.println(name + " eating");
		
	}
	void sleep(){
		System.out.println(name + " sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email="joe@gmail.com";
		person1.phone="123546";
		
		Person person2 = new Person();
		person2.name="Marcel";
		person2.eat();
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		// TODO Auto-generated method stub
     /*   String name = "Joe";
        String email = "joe@gmail.com";
        String phone = "0754956";
        
        //System.out.println(name + " is waling");
        walking(name);
	}
	
    static void walking (String name){
    	System.out.println(name + " is waling");
    }*/
	}
}


