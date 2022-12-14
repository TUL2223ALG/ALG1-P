package week10_2Darray;

public class Symetrie {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {2, 3, 1}, {2,3,1}, {1, 2, 3}};
        boolean horSym = true;
        for (int i = 0; i < a.length / 2 && horSym; i++) {
            for (int j = 0; j < a[i].length && horSym; j++) {
                if (a[i][j] != a[a.length - 1 - i][j]) {
                    horSym = false;
                }
            }
        }

        System.out.println("Matice " + ((horSym)?"je ":"není ") + "horizontálně symetrická.");
    }
}
