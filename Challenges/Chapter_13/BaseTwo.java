import java.util.Scanner;

public class BaseTwo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number of seconds: ");
        
        double x = scanner.nextDouble();
        double logbase = (Math.log(x)) / (Math.log(2));
        System.out.println("Base 2 log of " + x + " is " + logbase);

        scanner.close();

    }
}