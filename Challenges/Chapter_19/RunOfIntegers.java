import java.util.Scanner; 

public class RunOfIntegers
{
  public static void main (String[] args ) 
  {
	  
	  int count = 0;
	  Scanner start = new Scanner(System.in);
	  System.out.println("Chose a starting number. ");
	  int s = start.nextInt(); 
	  
	  Scanner end = new Scanner(System.in);
	  System.out.println("Chose an ending number. ");
	  int e = end.nextInt(); 
    
   
    
         
    while ( s <= e )   
    {
      System.out.println( "count is:" + s );
      
       
       s = s + 1;    
    }
    System.out.println( "Done with the loop" );
  }
}
