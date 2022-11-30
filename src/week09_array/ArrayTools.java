package week09_array;

import java.util.Arrays;

public final class ArrayTools {

    private ArrayTools() {

    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int maxValue(int[] a) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
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
    public static int maxvalueIndexFirst(int[] array) {
        if (array == null || array.length < 1) { //osetreni limitniho stavu 
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

    public static int maxvalueIndexLast(int[] array) {
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

    public static int maxvalueIndexLast1(int[] array) {
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

    public static void init(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    //varianta menim existujici pole
    public static void random(int[] a, int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    //varianta vytvarim nove pole
    public static int[] random2(int n, int min, int max) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return a;
    }
    //predpoklad n < pocet cisel mezi min a max
    public static int[] randomUnique(int n, int min, int max) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) { //rovna se nekteremu predchozimu cislu
                    i--; //budu generovat znova pro stejnou pozici  i-- + i++ i se nepohne
                    break;
                }
            }
        }
        return a;
    }

    public static void reverse(int[] a) {
        int temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = temp;
        }
    }

    public static int[] digitCounts(int[] number) { //24852 => [2,4,8,5,2]
        int[] counts = new int[10]; //indexy = cifry = 0 az 9
        for (int i = 0; i < number.length; i++) {
            counts[number[i]]++;
        }
        return counts;
    }
    
    //testing main
    public static void main(String[] args) {
        UI.display(randomUnique(5, 10, 19));
//        int [] myArray = {1,2,4,8,2}; //staticka inicializace konkretnimi hodnotami
//        int[] digitCounts = digitCounts(myArray);
//        UI.displayCounts(digitCounts);
//        
//        System.out.println(Arrays.binarySearch(myArray, 9));
//                
//        UI.display(myArray);
//        reverse(myArray);
//        UI.display(myArray);
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
