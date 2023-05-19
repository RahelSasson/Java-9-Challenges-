//BS'D
import java.util.Scanner;
import java.lang.NumberFormatException;

public class TelephoneTester {
    public static void main (String[] args) {
        System.out.println("Enter a unformatted phone number:");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.trim();
        while (str.length() != 10 || isNumeric(str) == false){
            System.out.println("Invalid format! \nPlease enter 10 digits without spaces or any other characters");
            str = s.next();
            str = str.trim();
            isNumeric(str);
        }

        Telephone tel = new Telephone();
        System.out.println("Formatted Phone Number: " + tel.getFormatted(str));


    }
    public static boolean isNumeric(String str) {
        if (str == null)
            return false;

        try {
            double num = Double.parseDouble(str);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
