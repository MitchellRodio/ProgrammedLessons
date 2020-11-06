import java.util.Scanner; 

class MilesPerGallon {
	
    public static void main(String[] args) {
    	
    	double initialMiles;
    	double finalMiles;
    	double gallons;
    	double MPG;
    	String response;
    	
    	System.out.println("Print your initial miles: "); 
    	Scanner sc = new Scanner(System.in);
    	initialMiles = sc.nextDouble();
    	
    	while (initialMiles == Math.abs(initialMiles)) {
    		System.out.println("Print your final miles: ");
    		finalMiles = sc.nextDouble();
    		System.out.println("Print how many gallons to fill up the tank: ");
    		gallons = sc.nextDouble();
    		MPG = (finalMiles - initialMiles) / gallons;
    		System.out.println("What are your in initial miles? Print '0' to stop.");
    		response=sc.nextLine();
    		if(response.equalsIgnoreCase("0")) {
    			System.out.println("Bye!");
    			System.exit(0);
    		}
    		
    		
    		
    		
    	}
    	
    
    } 
    
     
        
     
    
}
