
package newpackage;
import java.util.Scanner;
/**
 *
 * @author mcivko04
 */
public class XmasToy {

    public static void main(String[] args) {
        
        int xcord, ycord, radius, diameter, point;
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter radius:");
        radius = sc.nextInt();
        Scanner sy = new Scanner(System.in);
        System.out.println(" Enter symbol:");
        char symbol = sy.next().charAt(0);
        Scanner h = new Scanner(System.in);
        System.out.println(" Do you want hook?(write true or false):");
        boolean hacek = h.nextBoolean();
        
        diameter = 2 * radius;
        
        if(hacek==true){for(int y=0; y<1; y++){
            for(int x=0; x<diameter+1; x++){
            if(x==radius+radius-1 ){
                System.out.println("_");
            }
            else{
                    System.out.print(" ");
            }
        
         }
        } 
       }
         if(hacek==true){for(int y=0; y<3; y++){
            for(int x=0; x<diameter+1; x++){
            if(x==radius+radius){
                System.out.println("|");
            }
            else{
                    System.out.print(" ");
            }
        
         }
        }
       }
         
        for(int i=0; i<=diameter; i++) { 
            for (int j=0; j<=diameter; j++) {
                xcord = radius - i;
                ycord = radius - j;
                point = xcord*xcord + ycord*ycord;
            
        if (point <= radius*radius +1){
            System.out.print(symbol +" "); 
        }
        else {
        System.out.print("  ");
      }
    }
        System.out.println();
   }
  } 
}