import java.util.*;

public class GuessNumber {

    int counter = 0;
    int continueGame = 0;
    int continueAsking = 0;
    String nextGame = "m";


    public String getSetup(){
        return counter+continueGame+continueAsking+nextGame;
    }

    int endCounter = 6;
    int endContinueGame = 1;
    int endContinueAsking = 1;
    String endNextGame = "y";
    public String getEnd(){
        return endCounter+endContinueGame+endContinueAsking+endNextGame;
    }

    public static void main(String[] args) {
        int counter = 0;
        int continueGame = 0;
        int continueAsking = 0;
        String nextGame = "m";
        Random rand = new Random();
        Scanner scanName = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String name = scanName.nextLine();
        while (continueGame == 0) {
            int randomNumber = rand.nextInt(20)+1;
            nextGame = "m";
            counter = 0;
            continueAsking = 0;
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
            if (counter == 6) {
                System.out.println("You lost");
            }
            while (continueAsking == 0){
                Scanner scanContinue = new Scanner(System.in);
                System.out.println("Would you like to play again? (y/n)");
                nextGame = scanContinue.nextLine();
                if (nextGame.equals("y")) {
                    continueAsking++;
                }
                if (nextGame.equals("n")) {
                    nextGame = "m";
                    counter = 0;
                    continueGame = 15;
                    continueAsking++;
                }
            }
        }
    }


}
