import java.io.*;
import java.util.Scanner;

public class Medium
{
  public static void main ( String[] args ) throws IOException
  {
    int value;             // the value of the current integer
    int limit;             // the number of integers to add up
    int sum = 0;           // initialize sum
    int line = 1;
    int countNum = 0;
    
    // Prompt for and open the input file   
    Scanner user = new Scanner( System.in );
    System.out.print("File name? ");
    String fileName = user.next().trim();
    Scanner scan = new Scanner( new File(fileName) );
 


    int count = 1;
    while ( count <= 100 )
    { 
      
      
      System.out.println( "" + line );
   
      countNum = countNum + line;
      line++;
    }
    
    String lastLine = "";

    while ((sCurrentLine = br.readLine()) != null) 
    {
        System.out.println(sCurrentLine);
        lastLine = sCurrentLine;
    }

   median = countNum /  lastLine;
   System.out.println("" + median);
    
}
