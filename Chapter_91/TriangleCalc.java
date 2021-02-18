import java.util.Scanner;

class TriangleCalc
{
    System.out.println("Chose a Number");
    Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     
       while (!sc.hasNextInt() || (n = sc.nextInt()) <= 0) {
        System.out.print(errorMessage + "\n" + message);
        sc.nextLine();
    }
    
  public int Triangle( int N )
  {
        
      
      
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
}

public class TriangleTester
{
  public static void main ( String[] args)
  {
    TriangleCalc tri = new TriangleCalc();
    int result = tri.Triangle( 4 );
    System.out.println("Triangle(4) is " + result );
  }
}
