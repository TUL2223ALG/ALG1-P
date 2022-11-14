package christmas;
import java.util.Scanner;
public class AndriiMotovylovets { 
    public static void main(String[] args) {   
Scanner scanner = new Scanner(System.in);
System.out.println("Please provide number of rows to print (from 5 to 10)... ");
int myrows = scanner.nextInt();
       int count = 3;
        for(int i=0; i < count; i++) {
            System.out.print("");
for (int m=1; m<=myrows; m++)
{
for (int n=myrows; n>m; n--)
{
System.out.print(" ");
}
for (int p=1; p<=(m * 2) +20; p++)
{
System.out.print("+");
}
System.out.println("*");
}
for (int m=myrows-1; m>=1; m--)
{
for (int n=myrows-1; n>=m; n--)
{
System.out.print(" ");
}
for (int p=1; p<=(m * 2) +20; p++)
{
System.out.print("+");
}
System.out.println("*");
}
}
}
}     
 
    
