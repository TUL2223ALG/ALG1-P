
package week08_methods;

public final class DateTimeTools {
    private DateTimeTools(){
    }
    
    public static boolean isLeap(int year){
        boolean isLeap = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        return isLeap;
        //return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    
    
}
