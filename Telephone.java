//BS'D
public class Telephone {
    public final static int FORMATTED_LENGTH= 13;
    public final static int UNFORMATTED_LENGTH= 10;

    public Telephone() {}
    public static boolean isFormatted(String str) {
        if(str.length() == FORMATTED_LENGTH &&
            str.charAt(0) == '(' &&
            str.charAt(4) == ')' &&
            str.charAt(8) == '-')
                return true;

        return false;
    }

    public static String unformat(String str) {
        StringBuffer str2 = new StringBuffer(str);
        if(isFormatted(str)){
            str2.deleteCharAt(8);
            str2.deleteCharAt(4);
            str2.deleteCharAt(0);
        }
        return str2.toString();
    }

    public static String format(String str) {
        StringBuffer str2 = new StringBuffer(str);
        if(!isFormatted(str) && str.length() == UNFORMATTED_LENGTH){
            str2.insert(0,'(');
            str2.insert(4,')');
            str2.insert(8,'-');
        }
        return str2.toString();
    }

    public String getFormatted(String str) {
        String s = this.format(str);
        return s;
    }


}
