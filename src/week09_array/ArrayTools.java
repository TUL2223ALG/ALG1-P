package week09_array;

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
    
    //testing main
    public static void main(String[] args) {
        int [] myArray = {2,3,4,8}; //staticka inicializace konkretnimi hodnotami
        int sum = sum(myArray);
        System.out.println("Suma " + sum); //expected 17
        System.out.println("Max hodnota " + maxValue(myArray)); //expected 8
        init(myArray);
        UI.display(myArray);
        
        System.out.println("Pole nahodnych cisel");
        int[] b =  new int[10];
        random(b, -5, -1);
        UI.display(b);
        
        int n = 10;
        int[] d = random2(n, 10, 20);
        UI.display(d);
    }
}
