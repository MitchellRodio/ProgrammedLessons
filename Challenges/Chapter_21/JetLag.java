import java.util.Scanner;

public class JetLag {
    public static void main(String[] args) {
    
    
        Scanner sc = new Scanner(System.in);
        System.out.println("How long was your flight?");
        double time = sc.nextInt();
        
        System.out.println("# of Time Zones crossed");
        double zones = sc.nextInt();
        System.out.println("What time did you depart?");
        double DepartTime = sc.nextInt();
        
        System.out.println("What time will you arrive?");
        double TimeArived = sc.nextInt();
        double departure = 0;
        double arrive = 0;

        if (8 <= DepartureTime && DepartureTime < 12) {
            departure = 0;
        } else if (12 <= DepartureTime && DepartureTime < 18) {
            departure = 1;
        } else if (18 <= DepartTime && DepartTime < 22) {
            departure = 3;
        } else if (22 <= DepartureTime && DepartureTime < 1) {
            departure = 4;
        } else if (1<= DepartureTime && DepartureTime < 8) {
            departure = 5;
        }

        if (8 <= ArriveTime && ArriveTime < 12) {
            arrive = 4;
        } else if (12 <= ArriveTime && ArriveTime < 18) {
            departure = 2;
        } else if (18 <= ArriveTime && ArriveTime < 22) {
            departure = 0;
        } else if (22 <= ArriveTime && ArriveTime < 1) {
            departure = 1;
        } else if (1<= ArriveTime && ArriveTime < 8) {
            departure = 3;
        }
        double recovery = ((time / 2) + (zones - 3) + departure + arrive) / 10;
        System.out.println("You will need " + recovery + " days to recover");
    }
}
