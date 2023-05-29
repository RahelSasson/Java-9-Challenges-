//BS'D
/*
Morse code is a code where each letter of the English alphabet, each digit, and various
punctuation characters are represented by a series of dots and dashes.
Write a program that asks the user to enter a string, and then converts that
string to Morse code. Use hyphens for dashes and periods for dots.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MorseCode {
    public static void main(String[] args) {

        System.out.println("enter a series of words: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str.trim();

        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                " ", ",", ".", "?" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                " ", "-----", "--..--", ".-.-.-", "..--.." };

        Map<String,String> morseCode = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for(int i = 0; i < english.length; i++) {
            morseCode.put(english[i], morse[i]);
        }

        StringBuffer buff = new StringBuffer();

        for(int i = 0; i < str.length(); i++) {
            if(morseCode.containsKey(String.valueOf(str.charAt(i))) == false)
               continue;
            buff.append(morseCode.get(String.valueOf(str.charAt(i))));
        }

        System.out.println("English: " + str);
        System.out.println("Morse Code: " + buff.toString());

    }
}
