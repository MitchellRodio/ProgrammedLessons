import java.util.Scanner;

public class Echo
{
  public static void main (String[] args)
  { 
	  
	  String text = "";
	  Integer times = 1;
	
   
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter your text: ");
	  
	  text = scan.nextLine();
	  
	  int textLength = text.length();
	  System.out.println("The text: " + text + " contains " + textLength + " letters.");
	  
	  
	  while (times <= textLength) {
		  System.out.println("" + text);
		  
		  times = times + 1;
	  }

	 
	  
  }
}
