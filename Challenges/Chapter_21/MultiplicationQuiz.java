import java.util.Scanner; 
import java.util.Random;

class MultiplicationQuiz {
	
    public static void main(String[] args) {
    	
        int count = 0;
        int lowerbound = 0;
        int higherbound = 10;
        int correct = 0;
        
        Random r = new Random();
        
       int firstNum;
       int secondNum;
        
        
        while(count < 10) {
        	firstNum = r.nextInt(higherbound-lowerbound) + lowerbound;
        	secondNum = r.nextInt(higherbound-lowerbound) + lowerbound;
        	
        	int answerMultiplied = firstNum * secondNum;
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("What is: " + firstNum  + " * " + secondNum + "?");
        	int answerInput = sc.nextInt();
        	
        	if (answerInput == answerMultiplied) {
        		System.out.println("Correct!");
        		correct++;
        		
        	} else {
        		System.out.println("Wrong");
        	}
        	
        
        	
        	count++;
        }
    
        System.out.println("You got " + correct + "/10 correct!");
        
    }
    
    
}
