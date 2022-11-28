package week09_array;

import java.util.Arrays;

public final class ArrayTools {
    private ArrayTools(){
        
    }
    
    public static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    
    public static int maxValue(int[] a){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    /**
     * 
     * @param array
     * @return index of maximum or -1 if array is empty
     */
    public static int maxvalueIndexFirst(int[] array){
        if(array == null || array.length < 1 ){ //osetreni limitniho stavu 
            //pole bez alokovane pameti, nebo prazdne pole
            return -1;
        }
        int max = array[0];
        int pozMax = 0;
        for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    pozMax = i;
                }
        }
        return pozMax;
    }
    
    public static int maxvalueIndexLast(int[] array){
        int max = array[0];
        int pozMax = 0;
        for (int i = 0; i < array.length; i++) {
                if (array[i] >= max) {
                    max = array[i];
                    pozMax = i;
                }
        }
        return pozMax;
    }
    
    public static int maxvalueIndexLast1(int[] array){
        int max = array[0];
        int pozMax = 0;
        for (int i = array.length - 1; i >= 0; i--) { //prochazeni pole odzadu
                if (array[i] > max) {
                    max = array[i];
                    pozMax = i;
                }
        }
        return pozMax;
    }
    
    public static int[] maxMin(int[] array, boolean findFirst) {
        int max = array[0];
        int min = array[0];
        int pozMax = 0;
        int pozMin = 0;
        if (findFirst) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    pozMax = i;
                }
                if (array[i] < min) {
                    min = array[i];
                    pozMin = i;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= max) {
                    max = array[i];
                    pozMax = i;
                }
                if (array[i] <= min) {
                    min = array[i];
                    pozMin = i;
                }
            }
        }
        return new int[]{max, pozMax, min, pozMin};
    }
    
    public static int firstIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }

        }
        return -1;
    }
                   
    public static void init(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }
    
    //varianta menim existujici pole
    public static void random(int[] a, int min, int max){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*(max - min + 1)) + min;
        }
    }
    
    //varianta vytvarim nove pole
    public static int[] random2(int n, int min, int max){
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*(max - min + 1)) + min;
        }
        return a;
    }
    
    public static void reverse(int[] a){
        int temp;
        for (int i = 0; i < a.length/2; i++) {
            temp = a[a.length -1 -i];
            a[a.length -1 -i] = a[i];
            a[i] = temp;
        }
    }
    
    //TO CHECK
    public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("pocet hodnot: ");
  int pocet = sc.nextInt();
  pocet = pocet +2;
  System.out.println("min hodnota: ");
  int min = sc.nextInt();
  System.out.println("max hodnota: ");
  int max =sc.nextInt();
  int[] a = new int[pocet];
a[0] = (int)(Math.random()*(max-min+1)+min);
  
  for(int i=0;i<pocet;i++){          
     for(int j=0;j<i;j++){
         if(a[i]==a[j]){
             a[i] = (int)(Math.random()*(max-min+1)+min);
             j=0;        
         }
     }
     if(i>1){
     System.out.println((i-1 )+". "+a[i]);
     }
  }
  
  
    }
    
}
    
    //testing main
    public static void main(String[] args) {
        int [] myArray = {1,2,4,8}; //staticka inicializace konkretnimi hodnotami
        System.out.println(Arrays.binarySearch(myArray, 9));
                
        UI.display(myArray);
        reverse(myArray);
        UI.display(myArray);
        //int maxvalueIndexFirst = maxvalueIndexFirst(myArray);
        //System.out.println(maxvalueIndexFirst);
//        int sum = sum(myArray);
//        System.out.println("Suma " + sum); //expected 17
//        System.out.println("Max hodnota " + maxValue(myArray)); //expected 8
//        init(myArray);
//        UI.display(myArray);
//        
//        System.out.println("Pole nahodnych cisel");
//        int[] b =  new int[10];
//        random(b, -5, -1);
//        UI.display(b);
//        
//        int n = 10;
//        int[] d = random2(n, 10, 20);
//        UI.display(d);
    }
}
