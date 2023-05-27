//BS'D
import java.util.Scanner;

public class TestPasswordVerifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your password:");
        System.out.println("NOTE: Password must be between 6-16 characters long without spaces;");
        System.out.println("Password must contain a digit, a lowercase character and an uppercase character");

        String password = s.next();
        PasswordVerifier passObj = new PasswordVerifier(password);

        boolean isValid = passObj.verify();

        if(isValid)
            System.out.println("You have entered an acceptable password");

        while(!isValid) {
            System.out.println("password is invalid, try again;");
            password = s.next();
            passObj = new PasswordVerifier(password);
            isValid = passObj.verify();

            if(isValid)
                System.out.println("You have entered an acceptable password");

        }


    }
}
