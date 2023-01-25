package hw5Q2Constructor;

public class Computer {
     // variables are declared  
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	
	// default Constructor declared
	public Computer () {
		System.out.println("This is from the default Constructor of Computer class.");
	}
    // parameterized Constructor 01 and 02 declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Computer Brand: " + brand + ", Computer Model: " + model + ", Computer Operating System:  " + operatingSystem + ", Computer Price: " + price + ", Computer Grade: " + grade + ", Computer Made In USA: " + madeInUSA);
	}
	// parameterized Constructor 03 declared
	public Computer(String brand, int price, char grade, boolean madeInUSA) {
		
		this.brand = brand;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Computer Brand: " + brand + ", Computer Price: " + price + ", Computer Grade: " + grade + ", Computer Made In USA: " + madeInUSA);
	}
	// parameterized Constructor 04 declared
	public Computer(String brand, String model, String operatingSystem) {
		
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		System.out.println("Computer Brand: " + brand + ", Computer Model: " + model + ", Computer Operating System: " + operatingSystem);
	}
	

}
