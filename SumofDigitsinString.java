import java.util.Scanner;
/*
Write a program that asks the user to enter a series of single digit numbers with nothing
separating them. The program should display the sum of all the single digit numbers in the
string. For example, if the user enters 2514, the method should return 12, which is the sum
of 2, 5, 1, and 4. The program should also display the highest and lowest digits in the string.
 */
//BS'D
public class SumofDigitsinString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a series of single digit numbers without separations");
        String numbers = s.nextLine();
        boolean isCorrectFormat = true;

        do {
            for(int i = 0; i < numbers.length(); i++) {
                if (!Character.isDigit(numbers.charAt(i))) {
                    isCorrectFormat = false;
                    break;
                }

                isCorrectFormat = true;
            }
            if(isCorrectFormat)
                break;
            System.out.println("incorrect format, try again");
            numbers = s.nextLine();
        } while(!isCorrectFormat);

        int sum = 0;
        int max = Character.getNumericValue(numbers.charAt(0));
        int min = Character.getNumericValue(numbers.charAt(0));


        for(int i = 0; i < numbers.length(); i++) {
            sum += Character.getNumericValue(numbers.charAt(i));
            int temp = Character.getNumericValue(numbers.charAt(i));

            if(temp >= max) {
                max = temp;
            }
            if(temp <= min)
                min = temp;
        }

        System.out.println("Total: " + sum);
        System.out.println("Max: " + max + "  Min: " + min);
    }
}
