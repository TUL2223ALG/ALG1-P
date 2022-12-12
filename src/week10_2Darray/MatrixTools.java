package week10_2Darray;

public class MatrixTools {

    //vyplni matici zadanou rozmery zadanym cislem
    public static int[][] fill(int m, int n, int number) {
        int[][] a = new int[m][n];
        for (int i = 0; i < a.length; i++) { //m
            for (int j = 0; j < a[i].length; j++) { //n
                a[i][j] = number;
            }
        }
        return a;
    }

    public static String toString(int[][] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) { //m
            for (int j = 0; j < a[i].length; j++) { //n
                s = s + String.format("%5d", a[i][j]);
            }
            s = s + "\n";
        }
        return s;
    }

    public static String toString2(int[][] a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) { //m
            for (int j = 0; j < a[i].length; j++) { //n
                s.append(String.format("%5d", a[i][j]));
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void normForm(int[][] matrix) {
        int maxValue = maxAbsValue(matrix);
        for (int i = 0; i < matrix.length; i++) { //m
            for (int j = 0; j < matrix[i].length; j++) { //n
                matrix[i][j] = (matrix[i][j]) / maxValue;               
            }
        }
    }

    public static int maxAbsValue(int[][] matrix) {
        int tempMaxValue;
        int maxValue = 0;
        for (int i = 0; i < matrix.length; i++) { //m
            for (int j = 0; j < matrix[i].length; j++) { //n
                tempMaxValue = Math.abs(matrix[i][j]);
                if (tempMaxValue > maxValue) {
                    maxValue = tempMaxValue;
                }
            }           
        }
        return maxValue;
    }
    
    //to check
    public static boolean isStochastic (double [][] matrix){
    	double rowSum;
    	for (int i = 0; i < matrix.length; i++) {
        	rowSum=0;
        	for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j]>=0){
                	rowSum+=matrix[i][j];
                    }   
                    else{
                	return false;
}   
        	}
            if (rowSum!=1) {
           	return false;
            }
    	}
    	return true;
    }
    
    //pouzitelne i kdyz to nebude metoda (nevyuziva return false/true)
    public static boolean isStochastic1 (double [][] matrix){
    	double rowSum;
    	boolean isStochastic = true;
    	for (int i = 0; i < matrix.length && isStochastic; i++) {
        	rowSum=0;
        	for (int j = 0; j < matrix[i].length && isStochastic; j++) {
                    if (matrix[i][j]>=0){
                	rowSum+=matrix[i][j];
                    }   
                    else{
                	isStochastic = false;
}   
        	}
            if (rowSum!=1) {
           	isStochastic = false;
            }
    	}
    	return isStochastic;
    }
    
    public static boolean isHorizontalSym(int[][] a){
        boolean horSym = true;
        for (int i = 0; i < a.length / 2 && horSym; i++) {
            for (int j = 0; j < a[i].length && horSym; j++) {
                if (a[i][j] != a[a.length - 1 - i][j]) {
                    horSym = false;
                }
            }
        }
        return horSym;
    }
    
    public static boolean isVerticalSym(int[][] a){
        boolean verSym = true;
        for (int i = 0; i < a.length && verSym; i++) {
            for (int j = 0; j < a[i].length / 2 && verSym; j++) {
                if (a[i][j] != a[i][a[i].length-1-j]) {
                    verSym = false;
                }
            }
        }
        return verSym;
    }
    
    public static boolean isMainDiagonalSym(int[][] a){
        boolean mainDiagSym = true;
        for (int i = 1; i < a.length && mainDiagSym; i++) {
            for (int j = 0; j < i && mainDiagSym; j++) {
                if (a[i][j] != a[j][i]) {
                    mainDiagSym = false;
                }
            }
        }
        return mainDiagSym;
    }
    
    public static boolean isOtherDiagonalSym(int[][] a){
        boolean otherDiagSym = true;
        for (int i = 0; i < a.length - 1 && otherDiagSym; i++) {
            for (int j = a[i].length-2 -i ; j < 0 && otherDiagSym; j++) {
                if (a[i][j] != a[a.length-1 - j][a[i].length - 1 - i]) {
                    otherDiagSym = false;
                }
            }
        }
        return otherDiagSym;
    }
    
    public static int sumMainDiagonal(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
                    sum = sum + a[i][i];               
        }
        return sum;
    }
    
    public static int sumOtherDiagonal(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
                    sum = sum + a[i][a.length-1-i];               
        }
        return sum;
    }
    
    public static boolean areSameRows(int[][] matrix){
        boolean areSame = true;
        int sum;
        int firstSum = 0;
        //int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length && areSame; i++) { //m
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) { //n
                 sum = sum + matrix[i][j];
            }
            //sums[i] = sum;
            if(i == 0){
                firstSum = sum;
            } else {
                if(sum != firstSum){
                    areSame = false;
                }
            }
        }       
//        firstSum = sums[0];
//        for (int i = 1; i < sums.length && areSame; i++) {
//            if(sums[i] != firstSum){
//                areSame = false;
//            }
//            
//        }
        
        return areSame;
    }
    
    
    public static boolean isHorizontalSym1(int[][] a){
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != a[a.length - 1 - i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
   
        //testing
    public static void main(String[] args) {
        int[][] my = fill(4, 5, 10);
//        System.out.println(toString2(my));
        
        int[][] matrix = my;
        matrix[1][1]=5;
        matrix[3][2]=3;
        System.out.println(toString2(matrix));
        normForm(matrix);
        System.out.println(toString(matrix));
    }
}
