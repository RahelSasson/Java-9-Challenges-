//BS'D
/*
Imagine you are developing a software package for Amazon.com that requires users
to enter their own passwords. Your software requires that users’ passwords meet the
following criteria:
•	 The password should be at least six characters long.
•	 The password should contain at least one uppercase and at least one lowercase letter.
•	 The password should have at least one digit.
Write a class that verifies that a password meets the stated criteria. Demonstrate the class in
a program that allows the user to enter a password and then displays a message indicating
whether it is valid or not.
 */
public class PasswordVerifier {
    private final int minLength = 6;
    private final int maxLength = 16;
    private String password;

    public PasswordVerifier(String str) {
        this.password = str;
    }

    public boolean verify() {
        String str = this.password;

        if(str.length() <= this.minLength-1 || str.length() >= this.maxLength+1)
            return false;

        boolean upperFlag = false;
        boolean lowerFlag = false;
        boolean digitFlag = false;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                digitFlag = true;
            if(Character.isUpperCase(str.charAt(i)))
                upperFlag = true;
            if(Character.isLowerCase(str.charAt(i)))
                lowerFlag = true;
            if(Character.isWhitespace(str.charAt(i)))
                return false;
        }

        if(upperFlag && lowerFlag && digitFlag)
            return true;

        return false;
    }

}
