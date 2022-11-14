package week08_methods;

import java.util.Scanner;

public class ProgramCalendar {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej rok:");
        int y = sc.nextInt();
        
        boolean result = DateTimeTools.isLeap(y);
        
        System.out.println("zadany rok " + (result?"je":"neni") + " prestupny");
    }
    
}
