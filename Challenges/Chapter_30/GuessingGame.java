import java.util.Scanner;
import java.util.Random; 

class GuessingGame
{
public static void main (String[] args )
{
	int wrong = 0;
	Random r = new Random(); 
	int randomInt = r.nextInt(10) + 1;
	
	System.out.println("I'm thinking of a number from 1 to 10;");
	
	while (wrong < 3) {
		 
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a guess! ");
		int guess = sc.nextInt(); 
		
		if (guess == randomInt) {
			System.out.println("You guessed it! Congrats :)");
			wrong = wrong + 4;
		} else {
			System.out.println("You guessed incorrectly;"); 
			wrong = wrong + 1;
			
		}
		
		
		
		
		
		
		
		 	}
	System.out.println("My guess is: " + randomInt); 
     
  }
}
 
