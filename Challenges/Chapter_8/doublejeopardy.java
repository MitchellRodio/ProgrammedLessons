public class doublejeopardy
{
    public static void main ( String[] args )
    {
        double value = 32.2E+306 * 99.9E+99 * 99.9E+99* 99.9E+99* 99.9E+99;
        System.out.println("A double: " + value); 
    }
}

// This prints "A double: Infinity"
// Adding .0 to 32 creates a syntax error