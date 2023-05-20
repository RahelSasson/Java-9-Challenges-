//BS'D
/*
        Write a class with a constructor that accepts a String object as its argument. The class
should have a method that returns the number of vowels in the string, and another method
                that returns the number of consonants in the string. Demonstrate the class in a program
        that performs the following steps:
        1. The user is asked to enter a string.
        2. The program displays the following menu:
        a. Count the number of vowels in the string
        b. Count the number of consonants in the string
        c. Count both the vowels and consonants in the string
        d. Enter another string
        e. Exit the program
        3. The program performs the operation selected by the user and repeats until the user
        selects e, to exit the program
*/
public class VowelsAndConsonants {

    private static String s;
    private char[] arr = {'A','E','U','I','O'};

    public  VowelsAndConsonants() {}
    public VowelsAndConsonants(String str) {
        this.s = str;
    }

    public int countVowels(String str) {
        //char[] arr = {'A','E','U','I','O'};
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < this.arr.length; j++) {
                if (Character.toUpperCase(str.charAt(i)) == this.arr[j])
                    count++;
            }
        }
        return count;
    }

    public int countConsonant(String str) {
        boolean isVowel = false;
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i)))
                continue;
            for (int j = 0; j < this.arr.length; j++) {
                if (Character.toUpperCase(str.charAt(i)) == this.arr[j]) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel)
                count++;
            isVowel = false;
        }
        return count;
    }

    public int getCountVowels() {
        int n = this.countVowels(this.s);
        return n;
    }

    public int getCountConsonants() {
        int n = this.countConsonant(this.s);
        return n;
    }

    public void setS(String s) {
        this.s = s;
    }
}
