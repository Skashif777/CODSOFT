
import java.util.*;

//cod soft projet//

public class Game2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int minRange = 1;
    int maxRange = 100;
    int maxAttempts = 10;
    int score = 0;
    
    boolean playAgain = true;
    while (playAgain) {
int targetNumber = random.nextInt(maxRange - minRange+1)+minRange;
System.out.println("welcome to the Number Gussing name !");
System.out.println("I have select a number between "+ minRange + "and " + maxRange +". Try the again");
	int attempts = 0;
while(attempts < maxAttempts) {
System.out.print("Enter your guess Number: ");
int userGuess = scanner.nextInt();
attempts++;

if(userGuess < targetNumber) {
	System.out.println("Too low! Try again.");	
}else if (userGuess > targetNumber) {
	System.out.println("Too high! Try again.");
	
}else {
	System.out.println("Congratulation! you guessed the number "+ targetNumber + "in");	
	score += maxAttempts - attempts +1;
	break;
	
}
}
if (attempts == maxAttempts) {
	System.out.println("soory ,you've reached the maximum number of attempts.The correct number ");
}
System.out.print("Do you want to play again? (yes/no): ");
String playAgainResponce = scanner.next().toLowerCase();
playAgain =playAgainResponce.equals("yes");

}
		System.out.println("Thanks for playing ! Your total score is: "+ score);		
	}	
}
