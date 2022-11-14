
package christmas;
import java.util.Scanner;

public class VolodymyrCherniakov {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //in
        System.out.println("Enter size of snowballs\nmin - 4\t\tmax - 10");
        int size = scan.nextInt();
        System.out.println("Enter amount of snowballs\nmin - 2\t\tmax - 100");
        int amount = scan.nextInt();
        boolean isBody = false;
        int field = size * 3;
        int stars = size;
        while (amount != 0) {
            if(isBody){
                stars = topHalfBody(size,field,stars);
                stars = bottomHalf(size, field, stars, isBody);
            
            }else{
                Hat(size, field, stars);
                stars = topHalfHead(size, field, stars);
                stars = bottomHalf(size, field, stars, isBody);
                isBody = true;
            }
            
            stars+=2;
            amount--;
            
        }
    }

    
    private static int topHalfBody(int size, int field, int stars) {
        for (int i = 0; i < size / 2; i++) {
                int spaces = (field - stars) / 2;
                for (int j = 0; j < spaces; j++) {
                    System.out.print("  ");
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
                stars+=2;
        }
        return stars;
    }
    private static int bottomHalf(int size, int field, int stars, boolean isBody){
        for (int i = size / 2; i > 0; i--) {
                stars-=2;
                int spaces = (field - stars) / 2;
                for (int j = 0; j < spaces; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < stars; k++) {
                    if(k == stars/2 &&  i == size/2 && !isBody){
                            System.out.print(" > ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        return stars;
    }
    
    private static int topHalfHead(int size, int field, int stars) {
        for (int i = 0; i < size / 2; i++) {
                int spaces = (field - stars) / 2;
                for (int j = 0; j < spaces; j++) {
                    System.out.print("  ");
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
                stars+=2;
        }
        
        return stars;
    }
    
    private static void Hat(int size,int field, int stars) {
        stars/=2;
        for(int i = 0; i<size; i++){
            int spaces = (field-stars);
            for(int j = 0; j<spaces ;j++){
                    System.out.print(" ");
                }
           boolean flag = true;
                for(int k = 0; k<stars; k++){
                    if(i == 0){
                        System.out.print("__");
                    }else{
                        
                        if(k == (stars-1)){
                            System.out.print("_\\");
                        }else if(flag){
                            System.out.print("/_");
                            flag = false;
                        }else{
                            System.out.print("__");
                        }
                    }
               }
            stars++;
            System.out.println("");
        }
    }
}
 
