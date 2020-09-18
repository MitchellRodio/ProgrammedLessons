import java.util.Scanner;


class Circle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the radius: ");
        float circ = myObj.nextFloat();
    
        String radius = myObj.nextLine();  // Read user input
        System.out.println("Your circ is: " + circ + radius);  // Output user input
    }
}