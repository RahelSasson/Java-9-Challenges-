//BS'D
import java.util.Scanner;

public class TestVowelsAndConsonants {
    public static void main(String[] args) {
        System.out.println("Please enter a series of words");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        printMenu();
        char choice = s.next().charAt(0);

        VowelsAndConsonants vnc = new VowelsAndConsonants();
        int vowels = 0;
        int consonants = 0;

        while(choice != 'e'){
            vnc.setS(str);
            vowels = vnc.getCountVowels();
            consonants = vnc.getCountConsonants();

            if(Character.toLowerCase(choice) == 'a')
                System.out.println(vowels);
            else if(Character.toLowerCase(choice) == 'b')
                System.out.println(consonants);
            else if(Character.toLowerCase(choice) == 'c')
                System.out.println(vowels+consonants);
            else if (Character.toLowerCase(choice) == 'd') {
                System.out.println("Enter a new string");
                str = s.nextLine();
            }
            else if(Character.toLowerCase(choice) == 'e')
                System.exit(0);
            else{
                System.out.println("invalid option, try again (a-e)");
            }

            System.out.println("make another choice: ");
            choice = s.next().charAt(0);
            s.nextLine();

        }


    }

    public static void printMenu() {
        System.out.println ("The program displays the following menu:\n" +
                "a. Count the number of vowels in the string\n" +
                "b. Count the number of consonants in the string\n" +
                "c. Count both the vowels and consonants in the string\n" +
                "d. Enter another string\n" +
                "e. Exit the program");
        return;
    }

}
