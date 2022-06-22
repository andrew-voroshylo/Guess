package defaultguess;
import java.util.*;

public class Guess {
	
	public static void main(String[] args) {
		int counter = 0;
		Random rand = new Random();
		int randomNumber = rand.nextInt(20)+1;
		Scanner scanName = new Scanner(System.in);
		System.out.println("Hello, What is your name?");
		String name = scanName.nextLine();
		System.out.println("Well, "+ name + ", I am thinking of a number between 1 and 20");
		while (counter < 6) {
			System.out.println("Take a guess");
			Scanner scanInt = new Scanner(System.in);
			String intHolder = scanInt.nextLine();
			try {int holder = Integer.parseInt(intHolder);
				if ((holder < 0) || (holder > 20)){
					System.out.println("Not a number between 0 and 20");
					counter++;
				}
				else {
					if (holder > randomNumber) {
						System.out.println("Your guess is too high");
						counter++;
					}
					if (holder < randomNumber) {
						System.out.println("Your guess is too low");
						counter++;
					}
					if (holder == randomNumber) {
						int realcount = counter + 1;
						System.out.println("Good job, " + name + "! You guessed my number in " + realcount + " guesses!");
						counter = 10;
					}
				}
				
			}
			catch (NumberFormatException ex){
	        	System.out.println("Clearly not a valid number");
	        }
		}
	}

}
