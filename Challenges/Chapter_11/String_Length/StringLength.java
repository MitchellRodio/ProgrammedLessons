public class StringLength {

    public static void main(String[] args) {
        String str;
        int len;

        str = new String("Elementary, my dear Watson!");
        len = str.length();

        System.out.println("The length is: " + len);

        String spaced = new String("    Elementary, my dear Watson");
        String trimed = spaced.trim();

        System.out.println(trimed);
    }

}