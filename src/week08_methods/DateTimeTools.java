
package week08_methods;

public final class DateTimeTools {
    private DateTimeTools(){
    }
    
    public static boolean isLeap(int year){
        boolean isLeap = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        return isLeap;
        //return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    
    /**
     * Calculates the day in the week using Gregorian calendar used today
     * https://blaze.sk/gregoriansky-juliansky-kalendar-poznate-ich-rozdiely/
     * https://en.wikipedia.org/wiki/Zeller%27s_congruence
     * @param day
     * @param month
     * @param year
     * @return  1 to 7 where 1 -> Monday and so on
     */
    public static int zeller(int day, int month, int year) {
        // January and February are counted as months 13 and 14 of the previous year
        if (month == 1){
            month = 13;
            year --;
        }
        if (month == 2){
            month = 14;
            year --;
        }
        int q = day;
        int m = month;
        int k = year % 100; // year of the century for 2022 it is 22
        int j = year / 100; // zero-based century for 2022 it is 20
        //formula for gregorian calendar
        int h = (q + ((13*(m+1))/5) + k  + (k/4) + (j/4) - (2 * j))%7; //0-6, 0 - Saturday
        int dayInWeek =((h+5) % 7) + 1; //1-7, 1 - Monday
        return dayInWeek;
    }
}
