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
