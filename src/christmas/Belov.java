package christmas;
import java.util.Scanner;
public class Belov {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte výšku a velikost vánočního stromu");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int scale = 1;
        String s1 = "";
        String s2 = "";
        for (int r = 0; r<b; r++){
            i = 0;
            while (i < a) {
                s1 = "";
                s2 = "";
                for (int j = 0; j < (a - i); j++){
                    s1 += " ";
                }
                for (int j = 0; j < (2 * i + 1); j++) {
                    s2 += "*";
                }
                System.out.println(s1+s2);
                i++;
            }
        }
        System.out.println("         | |       _█_          ");
        System.out.println("         | |      (°﹆°)           ");
        System.out.println("         | |   ☚═(¯¯⁑¯¯)═☛       ");
        System.out.println("         | |      (¯¯¯⁑¯¯)           ");
    }

}