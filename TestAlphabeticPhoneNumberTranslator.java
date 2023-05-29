import java.util.Scanner;

public class TestAlphabeticPhoneNumberTranslator {
    public static void main(String[] args) {
        System.out.println("Enter a formatted phone number containing letters (Ex) XXX-XXX-XXXX) :");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.trim();
        isValid(str);
        while (str.length() != 12 || isValid(str) == false){
            System.out.println("Invalid format! \nPlease enter a formatted phone number containing letters (Ex) XXX-XXX-XXXX) :");
            str = s.next();
            str = str.trim();
            isValid(str);
        }

        AlphabeticTelephoneNumberTranslator obj = new AlphabeticTelephoneNumberTranslator(str);
        System.out.println("Your phone number is: " + obj.returnNumbers());
    }
    public static boolean isValid(String str) {
        String str1 = AlphabeticTelephoneNumberTranslator.unformat(str);
        for(int i = 0; i < str1.length(); i++)
            if(Character.isDigit(str1.charAt(i)) == false && Character.isLetter(str1.charAt(i)) == false)
                return false;

        return true;
    }
}
