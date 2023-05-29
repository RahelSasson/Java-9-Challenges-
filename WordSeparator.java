//BS'D
/*
Write a program that accepts as input a sentence in which all of the words are run together,
but the first character of each word is uppercase. Convert the sentence to a string in which
the words are separated by spaces and only the first word starts with an uppercase letter.
For example, the string “StopAndSmellTheRoses.” would be converted to “Stop and smell
the roses.”
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSeparator {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("WordSeparator.txt");
        Scanner s = new Scanner(file);

        while(s.hasNext()) {
            StringBuffer str = new StringBuffer(s.nextLine().trim());

            for(int i = 1; i < str.length(); i++) {
                if(Character.isUpperCase(str.charAt(i)) == true) {
                    char c = Character.toLowerCase(str.charAt(i));
                    str.deleteCharAt(i);
                    str.insert(i,c);
                    str.insert(i, ' ');
                }
            }
            System.out.println(str);
        }

    }
}
