//BS'D
/*
Write a program that has two parallel arrays of String objects. One of the arrays should
hold people’s names and the other should hold their phone numbers. Here are example
contents of both arrays:
name Array Example Contents phone Array Example Contents
"Harrison, Rose" "555-2234"
"James, Jean" "555-9098"
"Smith, William" "555-1785"
"Smith, Brad" "555-9224"
The program should ask the user to enter a name or the first few characters of a name to
search for in the array. The program should display all of the names that match the user’s
input and their corresponding phone numbers. For example, if the user enters “Smith”, the
program should display the following names and phone numbers from the list:
Smith, William: 555-1785
Smith, Brad: 555-9224
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelemarketingPhoneNumberList {
    public static void main(String[] args) {

        String[] namesArray = { "Harrison, Rose",
                    "James, Jean",
                    "Smith, William",
                    "Smith, Brad"};
        String[] phoneNumbersArray = { "555-2234",
                    "555-9098",
                    "555-1785",
                    "555-9224"};

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name;");
        String name = s.nextLine();

        List<String> str = Search(namesArray,phoneNumbersArray,name);

        for(int i = 0; i < str.size(); i = i+2) {
            System.out.println(str.get(i) + " " + str.get(i+1));
        }
    }

    public static List<String> Search(String[] names, String[] numbers, String name) {

        List<String> str = new ArrayList<String>();

        for(int i = 0; i < names.length; i++ ) {
            String[] n = names[i].split(", ");
            if (n[0].toUpperCase().startsWith(name.toUpperCase()) || n[1].toUpperCase().startsWith(name.toUpperCase())) {
                str.add(names[i]);
                str.add(numbers[i]);
            }
        }
        return str;
    }
}
