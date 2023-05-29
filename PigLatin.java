//BS'D
/*
Write a program that reads a sentence as input and converts each word to “Pig Latin”. In
one version of Pig Latin, you convert a word by removing the first letter, placing that letter
at the end of the word, and then appending “ay” to the word. Here is an example:
English: I SLEPT MOST OF THE NIGHT
Pig Latin: IAY LEPTSAY OSTMAY FOAY HETAY IGHTNA
 */
import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println("enter a sentence: ");
        Scanner s = new Scanner(System.in);
        String[] strArr = s.nextLine().trim().split("\\s+");
        String str = "";


        for(int i = 0; i < strArr.length; i++)
            str += strArr[i].substring(1,strArr[i].length()) + strArr[i].charAt(0) + "ay ";

        System.out.println("Sentence Translated into Pig Latin: \n" + str.toUpperCase());

    }
}
