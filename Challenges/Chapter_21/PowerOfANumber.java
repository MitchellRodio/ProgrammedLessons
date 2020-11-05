import java.util.Scanner; 
import java.util.Random;

class PowerOfANumber {
	
    public static void main(String[] args) {
    	
    float x;
    int n;
    long result = 1;
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter X ");
    x = sc.nextFloat();
    
    
    Scanner scN = new Scanner(System.in);
    System.out.println("Enter N ");
    n = scN.nextInt();
    
    while(n < 0) {
    	System.out.println("N cannot be negative");
    	n = scN.nextInt();
    }
    
    while(n != 0) {
    	result *= x;
    	--n;
    }
    
    
    
    System.out.println("" + result);
    System.exit(0);
      
        
    }
    
    
}
