package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe rima = new AboutMe(); // constructor is initialized

		rima.name = "Nusrat Sharmin Rima"; // variables are initialized
		rima.myAge = 100;
		rima.myMortgage = 31234;
		rima.mySalary = 7500000;
		rima.mySavings = 9876543219876l;
		rima.myHeight = 1.987654f;
		rima.myCGPA = 3.238765432165434;
		rima.mySex = 'F';
		rima.myFullTimeEmployee = true;

		rima.aboutMe(); // method is initialized

		System.out.println("\n.......................................................\n");

		AboutMe alex = new AboutMe(); // constructor is initialized

		alex.name = "Alex"; // variables are initialized
		alex.myAge = 10;
		alex.myMortgage = 31134;
		alex.mySalary = 6700000;
		alex.mySavings = 9876543219872l;
		alex.myHeight = 1.987651f;
		alex.myCGPA = 3.238765432898789;
		alex.mySex = 'M';
		alex.myFullTimeEmployee = false;

		alex.aboutMe(); // method is initialized

	}

}
