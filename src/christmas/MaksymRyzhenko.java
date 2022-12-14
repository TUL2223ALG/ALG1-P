package christmas;
import java.util.Scanner;

public class MaksymRyzhenko {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //in
        System.out.println("Enter size of snowballs\nmin - 4\t\tmax - 100");
        int size = scan.nextInt();
        System.out.println("Enter amount of snowballs\nmin - 2\t\tmax - 100");
        int amount = scan.nextInt();
        boolean isBody = false;
        while (amount != 0) {
            int field = size * 3;
            int stars = size;
            if(isBody){
                stars = topHalfBody(size,field,stars);
            
            }else{
                stars = topHalfHead(size, field, stars);
                isBody = true;
            }
            bottomHalf(size, field, stars);
            amount--;
        }
    }
private static int topHalfBody(int size, int field, int stars) {
        for (int i = 0; i < size / 2; i++) {
                int spaces = (field - stars) / 2;
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    if(i == ((size/2)-1) && k == (stars/2)){
                        System.out.print("o ");
                    }else{
                    System.out.print("* ");
                    }
                }
                System.out.println();
                //spaces--;
                stars++;
        }
        return stars;
    }
private static void bottomHalf(int size, int field, int stars){
        for (int i = size / 2; i > 0; i--) {
                stars--;
                int spaces = (field - stars) / 2;
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    
    private static int topHalfHead(int size, int field, int stars) {
        for (int i = 0; i < size / 2; i++) {
                int spaces = (field - stars) / 2;
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    if(i == ((size/2)-1) && (k == (stars/2-1) || k == (stars/2+1)) ){
                        System.out.print("O ");
                    }else{
                        
                    System.out.print("* ");
                    }
                }
                System.out.println();
                //spaces--;
                stars++;
        }
        
        return stars;
    }
    
    
}
