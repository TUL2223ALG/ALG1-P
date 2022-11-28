
package week09_array;

import java.util.Scanner;

public class BankNotes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int x = sc.nextInt();
        int zbytek = x;
        int[] p = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] b = new int[p.length];
        for(int i = 0;i < p.length;i++){
            b[i] = zbytek/p[i];
            zbytek = zbytek % p[i];
           
        }
        UI.display(p);
        UI.display(b);
        
        for (int i = 0; i < b.length; i++) {
            if(b[i] != 0){
                System.out.println(b[i] + "x " + p[i] + "Kc");
            }
        }
    }
    
}
