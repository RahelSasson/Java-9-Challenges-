//BS'D
import java.util.Locale;
import java.util.Scanner;


public class Lookup {
    public static void main (String[] args) {
        String lookup;

        String[] names = {"Luffy","Ken","Lana","Satou", "Kallen"};

        Scanner s = new Scanner(System.in);

        lookup = s.nextLine();

        for(int i = 0; i < names.length; i++) {
            String str = lookup.substring(0,1).toUpperCase() + lookup.substring(1);
                if(names[i].startsWith(str)){
                    System.out.println("Name found: " + names[i]);
                }
        }

    }
}
