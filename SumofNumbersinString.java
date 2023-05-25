//BS'D
/*
Write a program that asks the user to enter a series of numbers separated by commas. Here
is an example of valid input:
7,9,10,2,18,6
The program should calculate and display the sum of all the numbers
 */
import java.util.Scanner;

public class SumofNumbersinString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a series of numbers separated by commas");
        String numbers = s.nextLine();
        numbers.trim();
        String[] numbersArr = numbers.split("[,\\s+]");
        int total = 0;

        for(int i = 0; i < numbersArr.length; i++) {
            numbersArr[i].trim();
            try{
                int n = Integer.parseInt(numbersArr[i]);
            }catch(NumberFormatException nfe){
                continue;
            }
            total += Integer.valueOf(numbersArr[i]);
        }

        System.out.println("the total of all the values entered is " + total);

    }
}
