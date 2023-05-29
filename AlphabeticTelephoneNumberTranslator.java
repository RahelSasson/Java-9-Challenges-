//BS'D
/*
Many companies use telephone numbers like 555-GET-FOOD so the number is easier for
their customers to remember. On a standard telephone, the alphabetic letters are mapped to
numbers in the following fashion:
A, B, and C = 2
D, E, and F = 3
G, H, and I = 4
J, K, and L = 5
M, N, and O = 6
P, Q, R, and S = 7
T, U, and V = 8
W, X, Y, and Z = 9
Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX. The application should display the telephone number with any alphabetic characters that appeared in the original translated to their numeric equivalent. For
example, if the user enters 555-GET-FOOD the application should display 555-438-3663.
 */
public class AlphabeticTelephoneNumberTranslator {
    private final static int formattedLength = 12;
    private final static int unformattedLength = 10;
    private String str;

    public AlphabeticTelephoneNumberTranslator(String str) {
        this.str = str;
    }

    public String returnNumbers() {
        StringBuffer str1 = new StringBuffer(unformat(this.str));
        System.out.println(str1);
        int n = 0;
        for(int i = 0; i < str1.length(); i++) {
            if (Character.isLetter(str1.charAt(i))) {
                n = matchLettersToNumbers(str1.charAt(i));
                str1.deleteCharAt(i);
                str1.insert(i,String.valueOf(n));
            }
            n = 0;
        }

        return format(str1.toString());
    }

    public static boolean isFormatted(String str) {
        str.trim();
        if(str.length() == formattedLength && str.charAt(3) == '-' && str.charAt(7) == '-')
            return true;
        return false;
    }

    public static String format(String str) {
        StringBuffer str2 = new StringBuffer(str);
        if(!isFormatted(str) && str.length() == unformattedLength){
            str2.insert(6, '-');
            str2.insert(3,'-');
        }
        return str2.toString();
    }

    public static String unformat(String str) {
        StringBuffer str2 = new StringBuffer(str);
        if(isFormatted(str)){
            str2.deleteCharAt(7);
            str2.deleteCharAt(3);
        }
        return str2.toString();
    }

   public int matchLettersToNumbers(char c) {
        int n = 0;
        char c1 = Character.toUpperCase(c);
        if(c1 == 'A' || c1 == 'B' || c1 == 'C')
            n = 2;
        else if(c1 == 'D' || c1 == 'E' || c1 == 'F')
            n = 3;
        else if(c1 == 'G' || c1 == 'H' || c1 == 'I')
            n = 4;
        else if(c1 == 'J' || c1 == 'K' || c1 == 'L')
            n = 5;
        else if(c1 == 'M' || c1 == 'N' || c1 == 'O')
            n = 6;
        else if(c1 == 'P' || c1 == 'Q' || c1 == 'R' || c1 == 'S')
            n = 7;
        else if(c1 == 'T' || c1 == 'U' || c1 == 'V')
            n = 8;
        else if(c1 == 'W' || c1 == 'X' || c1 == 'Y' || c1 == 'Z')
            n = 9;

        return n;
   }
}
