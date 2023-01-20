package hw3JavaVariables;

public class AboutMe {
		

	public String MyName;  // variable declared
		public String name = "Nusrat Sharmin Rima"; // variable initialized
		public byte age = 100;
		public short mortgage = 31234;
		public int mySalary = 7500000;
		public long mySavings = 9876543219876l;
		public float myChildHeight = 1.987654f;
		public double myCGPA = 3.238765432165434;
		public char sex = 'F';
		public boolean fullTimeEmployee = true;
		
		public static void main(String[] args) {
		
	
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name: " + aboutMe.name + "\nAge: " + aboutMe.age + "\nmortgage: " + aboutMe.mortgage);
		

		}	

}
