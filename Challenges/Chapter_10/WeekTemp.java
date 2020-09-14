
   import java.util.Scanner;

   public class WeekTemp {
   
    
    public static void main(String[] args) {


        
        String sunday = "";
        String monday = "";
        String tuesday = "";
        String wednsday = "";
        String thursday = "";
        String friday = "";
        String saturday = "";
        String str = "Ttestingtestingtesting";

       
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("What is the week temp?");
     

        sunday = str.substring(1, 2);
        monday = str.substring(3, 4);
        tuesday = str.substring(5, 6);
        wednsday = str.substring(6, 7);
        thursday = str.substring(8, 9);
        friday = str.substring(10, 11);
        saturday = str.substring(12, 13);
        

        
        String temp = scanner.next();

        System.out.println(" Sunday: "+ sunday + " Monday: "+ monday + " Tuesday: "+ tuesday + " Wednsday: "+ wednsday + " Thursday: "+ thursday + " Friday: "+ friday + " Saturday: "+ saturday) ;

      
    }
    

    
    
}