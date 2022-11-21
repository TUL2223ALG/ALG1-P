package week09_array;

import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej pocet cisel");
        int count = sc.nextInt();
        System.out.println("Zadej cisla");
        int[] loadedValues = load(count);
        //System.out.println(loadedValues);
        display(loadedValues);
        int[] b = new int[3];
        display(b);
        
    }
    
    public static int[] load(int n){ //pocet prvku v poli
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void display(int[] a){ // [1, 2, 3, 4]
        System.out.print("[");
        for (int i = 0; i < a.length-1; i++) { //po predposledni hodnotu
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1] + "]\n");
    }
    
}
