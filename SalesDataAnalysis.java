//BS'D
/*
The file SalesData.txt, in this chapter’s source code folder, contains the dollar amount of
sales that a retail store made each day for a number of weeks. Each line in the file contains
seven numbers, which are the sales numbers for one week. The numbers are separated by a
comma. The following line is an example from the file:
2541.36,2965.88,1965.32,1845.23,7021.11,9652.74,1469.36
Write a program that opens the file and processes its contents. The program should display
the following:
•	 The total sales for each week
•	 The average daily sales for each week
•	 The total sales for all of the weeks
•	 The average weekly sales
•	 The week number that had the highest amount of sales
•	 The week number that had the lowest amount of sales
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SalesDataAnalysis {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("SalesData.txt");
        Scanner s = new Scanner(file);
        double totalSalesWeek = 0;
        double totalSalesAllWeeks = 0;
        List<Double> weeklySalesList = new ArrayList<>();
        int lines = 0;

        while(s.hasNext()) {
            lines++;
            String str = s.nextLine();
            str.trim();
            double[] salesWeekArr = Arrays.stream(str.split(",")).mapToDouble(Double::parseDouble).toArray();
            for(int i = 0; i < salesWeekArr.length; i++) {
                totalSalesWeek += salesWeekArr[i];
            }
            System.out.println("Total Sales for week " + lines + ": " + totalSalesWeek);
            System.out.println("Average Sales for week: " + String.format("%.2f",totalSalesWeek/salesWeekArr.length));
            weeklySalesList.add(totalSalesWeek);
            totalSalesAllWeeks += totalSalesWeek;
            totalSalesWeek = 0;
        }

        System.out.println();
        System.out.println("Total sales for all weeks: " + totalSalesAllWeeks);
        System.out.println("Average weekly sales: " + totalSalesAllWeeks/lines);

        double max = weeklySalesList.get(0);
        double min = weeklySalesList.get(0);
        int indexMin = 0;
        int indexMax = 0;
        for(int i = 1; i < weeklySalesList.size(); i++) {
            if(weeklySalesList.get(i) > max) {
                indexMax = i+1;
                max = weeklySalesList.get(i);
            }
            if(weeklySalesList.get(i) < min) {
                indexMin = i+1;
                min = weeklySalesList.get(i);
            }
        }

        System.out.println("Week " + indexMax + " had the highest amount of sales at: $" + max);
        System.out.println("Week " + indexMin + " had the lowest amount of sales at: $" + min);

     }
}
