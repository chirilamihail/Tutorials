package lab;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StudDB stud1 = new StudDB("Marcel","98567422");
     stud1.enroll("Curs1");
     StudDB stud2 = new StudDB("Eugen","42298567");

     
 
	}
}
	class StudDB  {
		private static int iD = 999;
		private String userId ; /// id + random 4 digits + last 4 from SSN
		private String name;
		private String SSN;
		private String email ; 
		private String courses;
		public StudDB (String name, String ssn){
			iD++;
			this.name=name;
			this.SSN=ssn;
			setEmail();
			setUserId();
			//setUserid();
			System.out.println("Nume " + name + " SSN " + ssn + " UserId " + userId + "Email - "+ email);
		 
			
		}
      public void setUserId (){
    	  int max=9000;
    	  int min = 1000;
    	  int randNum = (int) Math.random()*10000* ((max-min));
    	  randNum = randNum + min;
    	 // random= random + iD;
    	 ///System.out.println ("Your random is ; "+ randNum);
    	  userId =  iD +"" +randNum+""+ SSN.substring(4);
    	 
    	 System.out.println ("Your userId is ; "+ userId);
      }
		public String getEmail() {
			return email;
		}

		public void setEmail() {
			email =name+"."+iD+"@ggg.com";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSSN() {
			return SSN;
		}

		public void setSSN(String sSN) {
			SSN = sSN;
		}
		///methods
		public void enroll(String course){
			this.courses = this.courses +"\n"+ course;
			System.out.println("CURSURI"+ courses);
		}
		public void pay(){
			
		}
		public void checkBalance(){
			
		}
		public String toString(){
			retunr null;
		}
		public void showCourses(){
			
		}
	}

