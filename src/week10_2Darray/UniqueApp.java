package week10_2Darray;

import java.util.Scanner;

public class UniqueApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej rozmer matice");
        int n = sc.nextInt();
        System.out.println("Zadej hodnoty");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int[] counts = new int[n*n+1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                counts[matrix[i][j]]++;
            }
        }
        boolean isUnique = true;
        for (int i = 1; i < counts.length && isUnique; i++) {
            if(counts[i] != 1){
                isUnique = false;
            }
        }
        
        System.out.println("Matice " + ((isUnique)? "obsahuje" : "neobsahuje") + " 1 az n2.");
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
