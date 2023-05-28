//BS'D
/*
Write a class with the following static methods:
•	 WordCount. This method should accept a reference to a String object as an argument
and return the number of words contained in the object.
•	 arrayToString. This method accepts a char array as an argument and converts it to a
String object. The method should return a reference to the String object.
•	 mostFrequent. This method accepts a reference to a String object as an argument and
returns the character that occurs the most frequently in the object.
•	 replaceSubstring. This method accepts three references to String objects as arguments.
Let’s call them string1, string2, and string3. It searches string1 for all occurrences
of string2. When it finds an occurrence of string2, it replaces it with string3. For
example, suppose the three arguments have the following values:
string1: “the dog jumped over the fence”
string2: “the”
string3: “that”
With these three arguments, the method would return a reference to a String object with
the value “that dog jumped over that fence”.
 */
public class MiscellaneousStringOperations {

    public static int wordCount(String str) {
        str.trim();
        String[] strArr = str.split(" ");

        return strArr.length;
    }

    public static String arrayToString(char[] charArr) {
        StringBuffer s = new StringBuffer();
        for(int i = 0; i < charArr.length; i++)
            s.append(String.valueOf(charArr[i]));

        return s.toString();
    }

    public static char mostFrequent(String str) {

        int countMax = 0;
        int index = 0;
        for(int i = 0; i < str.length(); i++) {
            int countFreq = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                    countFreq++;
            }
            if(countFreq > countMax) {
                countMax = countFreq;
                index = i;
            }
        }
        return str.charAt(index);
    }

    public static String replaceSubString(String str1, String str2, String str3) {
        str1.trim();
        String[] s = str1.split(" ");
        StringBuffer strReturn = new StringBuffer();
        for(int i = 0; i < s.length; i++) {
            if(s[i].equalsIgnoreCase(str2))
                s[i] = str3;
            strReturn.append(s[i] + " ");
        }

        return strReturn.toString();
    }

}
