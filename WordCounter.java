//BS'D
/*
Write a program that asks the user for the name of a file. The program should display the
number of words that the file contains.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("WordCounterTxtFile.txt");
        Scanner s = new Scanner(file);

        int counter = 0;
        while(s.hasNext()) {
            String fileLine = s.nextLine();
            fileLine.trim();
            String[] fileLineArr = fileLine.split(" ");
            counter += fileLineArr.length;
        }

        System.out.println("File contains: " + counter + " words");

    }
}
