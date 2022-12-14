package christmas;
import java.util.Scanner;
public class DryhaSerhii {

    public static void main(String[] args) {
        gift();
    }
    
    public static void gift(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gift box size");
        int boxSize = sc.nextInt();
        System.out.println("Enter line size");
        int lineSize = sc.nextInt();
        for(int c = 0; c < 2*boxSize; c++){
            if(c==boxSize){
                for (int i = 0; i < lineSize; i++) {
                    for (int j = 0; j < boxSize*4+lineSize*2; j++) {
                            System.out.print("+");

                        }System.out.println();
                }
            }
            for (int i = 0; i < 4*boxSize; i++) {
                if(i==2*boxSize){
                    for (int j = 0; j < 2*lineSize; j++) {
                        System.out.print("+");
                    }
                }
                System.out.print("X");
            }System.out.println();
        }
        System.out.println("Happy X-mas");
    }
}
