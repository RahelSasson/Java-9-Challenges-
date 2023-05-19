public class PlayingWithStrings {
    public static void main(String[] args) {
        String str = "word";
        System.out.println(backwardString(str));
        String sentence =" I went to the park today ";
        System.out.println(wordCounter2(sentence));
        String str2 = " hello. My name is Rachel.  i am 30 years old.  ";

        String s = sentenceCapitalizer(str2);
        System.out.println(s);

    }
    public static String backwardString(String str) {
        StringBuffer str2 = new StringBuffer(str);
        str2.reverse();

       return str2.toString();
    }

    public static String backwardString2(String str) {
        String str2 = "";
        for(int i = str.length()-1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        return str2;
    }
    public static int wordCounter(String str) {
        str = str.trim();
        int count = 1;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i)))
                count++;
        }
        return count;
    }

    public static int wordCounter2(String str) {
        str = str.trim();
        String[] strArr = str.split(" ");

        return strArr.length;
    }

    public static String sentenceCapitalizer(String str) {
        String s = "";
        String[] strArr = str.split("\\.");
        for(int i = 0; i < 3; i++) {
            strArr[i] = strArr[i].trim();
            char newchar = Character.toUpperCase(strArr[i].charAt(0));
            char oldchar = strArr[i].charAt(0);
            strArr[i] = strArr[i].replaceFirst(String.valueOf(oldchar), String.valueOf(newchar));
            s += strArr[i] + ". ";
        }

        return s;
    }

}
