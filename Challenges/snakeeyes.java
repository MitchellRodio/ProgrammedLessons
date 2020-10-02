import java.util.Scanner;
import java.util.Random; 

public class snakeeyes
{
public static void main(String[] args) throws InterruptedException{
	
	
	
	int max = 6;
	int snakeEyes = 2;
	
	int loss = 1;
	
	int score = 0;
	
	while (loss < 2) {
		
		Thread.sleep(1000);
		
		Random randomGenerator1 = new Random();
		Random randomGenerator2 = new Random();
		int n = randomGenerator1.nextInt(max);

		int b = randomGenerator2.nextInt(max);
	if (n == 1 && b == 1) {
		loss = loss + 2;
		System.out.println("You got snake eyes and lost!");
	} else {
		score = score + n + b;
	}
	System.out.println("You got: " +n + b);
	System.out.println("Your new score is: " + score );

	}
	
	
	    

	    
}
}
