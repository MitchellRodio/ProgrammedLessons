import java.util.Scanner;

class WedgeOfStars
{
public static void main (String[] args )
{
  Scanner sc = new Scanner( System.in );

  System.out.print( "How many Stars do you want? " );
  int starCount = sc.nextInt() ;
  while(starCount>0) {
     //This bit below is what prints a line of stars.
     for(int i = 1; i <= starCount; i++) {
         System.out.print("*");
     }
     System.out.println();
     starCount = starCount - 1;
  }
}
}
