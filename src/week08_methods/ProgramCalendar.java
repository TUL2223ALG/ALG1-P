package week08_methods;

import java.util.Scanner;

public class ProgramCalendar {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej den, mesic a rok: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        
        int dayInWeek= DateTimeTools.zeller(day, month, year); 

        String dayInWeekText = null;
        switch (dayInWeek)
        {
            case 1 -> dayInWeekText = "Monday";
            case 2 -> dayInWeekText = "Tuesday";
            case 3 -> dayInWeekText = "Wednesday";
            case 4 -> dayInWeekText = "Thursday";
            case 5 -> dayInWeekText = "Friday";
            case 6 -> dayInWeekText = "Saturday";
            case 7 -> dayInWeekText = "Sunday";
        } 
        
        System.out.println("Zadany datum je " + dayInWeekText + ".");
        
        boolean result = DateTimeTools.isLeap(year);
        System.out.println("Zadany rok " + (result?"je":"neni") + " prestupny.");
    }
}
