package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Computer(); // default Constructor is initialized 
		
		Computer computer01 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		Computer computer02 = new Computer("Windows", "Dell", "Intel", 700, 'A', true);
       
		Computer computer03 = new Computer("Apple", 800, 'A', false);
	    Computer computer04 = new Computer("Apple", "MacBook Air", "MacOS Mojave");
	    
	}

}
