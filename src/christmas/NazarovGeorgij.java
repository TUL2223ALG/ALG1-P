
package christmas;
import java.util.Scanner;
public class NazarovGeorgij {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gift size ");
        int giftSize = sc.nextInt();
        System.out.println("Enter ribbon size");
        int ribbonSize = sc.nextInt(); 
        if (giftSize>ribbonSize)
        {          
        gift(giftSize,ribbonSize);
        note();
        }
        else
        {
            System.out.println("The size of the ribbon should not exceed the size of the gift");
        }
    }
    
    public static void gift(int giftSize, int ribbonSize){
        for(int c = 0; c < 2*giftSize; c++){
            if(c==giftSize)
            {
                for (int i = 0; i < ribbonSize; i++)
                {
                    for (int j = 0; j < giftSize*4+ribbonSize*2; j++) 
                    {
                            System.out.print("@");
                    }
                    System.out.println();
                }
            }
            for (int i = 0; i < 4*giftSize; i++) {
                if(i==2*giftSize){
                    for (int j = 0; j < ribbonSize*2; j++) {
                        System.out.print("@");
                    }
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void note()
    {
        System.out.println("|_");
        System.out.println("  \\"+"___________");
        System.out.print("             ");
        System.out.println(" \\");
        for(int i=0; i<24; i++){
             System.out.print("$");
        }
         System.out.print("\n");
        for(int i=0; i<24; i++){
             System.out.print("$");
        }
        System.out.print("\n");
        System.out.println("$$$ "+"MERRY CHRISTMAS! $$$");
        for(int i=0; i<24; i++){
             System.out.print("$");
        }
        System.out.println();
        for(int i=0; i<24; i++){
             System.out.print("$");
        }
    }
}

