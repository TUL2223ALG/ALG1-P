//package christmas;
import java.util.Random;
import java.util.Scanner;
public class MykolaPetrov {
    static Random rand = new Random();
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static int color;
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        boolean end = false;
        int select;
        do {
            System.out.println("Select a picture.");
            System.out.println("0. Close.");
            System.out.println("1. Star.");
            System.out.println("2. Snowman.");
            select = scan.nextInt();
            switch(select) {
                case 1:  star();
                end = true;
                break;
                case 2: snowman();
                case 0: end = true;
                break;
                default: System.out.println("Inncorect value ");
            }
        }while(!end);
    }
    private static void snowman(){
        selectColor();
        selectedColor();
        String selectedcolor = selectedColor();
        snowmanConfigurate(selectedcolor);
    }
    private static void star(){
        selectColor();
        selectedColor();
        String selectedcolor = selectedColor();
        starConfigurate(selectedcolor);
    }
    private static void selectColor() {
        int random;
        System.out.println("Choose a color of figure.");
        System.out.println("1. Black.");
        System.out.println("2. Red.");
        System.out.println("3. Green.");
        System.out.println("4. Yellow.");
        System.out.println("5. Blue.");
        System.out.println("6. Purple.");
        System.out.println("7. Cyan.");
        System.out.println("8. White.");
        System.out.println("9. Random.");
        color = scan.nextInt();
        if (color == 9){
            color = rand.nextInt(8);
        }else{
        }
    }
    private static String selectedColor() {
        String selectedColor = "";
        switch (color) {
            case 1:
                selectedColor = ANSI_BLACK;
                break;
            case 2:
                selectedColor = ANSI_RED;
                break;
            case 3:
                selectedColor = ANSI_GREEN;
                break;
            case 4:
                selectedColor = ANSI_YELLOW;
                break;
            case 5:
                selectedColor = ANSI_BLUE;
                break;
            case 6:
                selectedColor = ANSI_PURPLE;
                break;
            case 7:
                selectedColor = ANSI_CYAN;
                break;
            case 8:
                selectedColor = ANSI_WHITE;
                break;
            default:
                System.out.println("Incorrect value.");
        }
        return selectedColor;
    }
    public static void starConfigurate(String selectedcolor) {
        System.out.println("Print size of figure(5-15)!");
        int random = rand.nextInt(100);
        int size;
        size = scan.nextInt();
        size = size / 2 + 1;
        int i = 0;
        for (i = 0; i < size; i++) {
            for (int j = i; j < size; j++)
                System.out.print("  ");
            for (int b = 0; b <= 2 * i; b++) {
                if (random >= 80){
                    System.out.print(selectedcolor + "^ " + ANSI_RESET);
                }else {
                    System.out.print(selectedcolor + "& " + ANSI_RESET);
                }
            }
            System.out.println();
        }
        size = i;
        for (i = size - 1; i > 0; i--) {
            for (int k = i; k < size + 1; k++)
                System.out.print("  ");
            for (int j = 2 * i; j > 1; j--) {
                if (random >= 80){
                    System.out.print(selectedcolor + "* " + ANSI_RESET);
                }else {
                    System.out.print(selectedcolor + "& " + ANSI_RESET);
                }
            }
            System.out.println();
        }
    }
    public static void snowmanConfigurate(String selectedcolor){
        System.out.println("Select a snowman's mood.");
        System.out.println("1. Bad.");
        System.out.println("2. Good.");
        int mood = scan.nextInt();
        if(mood == 2){
            System.out.println(selectedcolor + "      _______" + ANSI_RESET);
            System.out.println(selectedcolor + "     /       \\" + ANSI_RESET);
            System.out.println(selectedcolor + "    /         \\" + ANSI_RESET);
            System.out.println( selectedcolor +"   /___________\\" + ANSI_RESET);
            System.out.println(selectedcolor + "    * * * * * * " + ANSI_RESET);
            System.out.println(selectedcolor + "  * * 0 * * * 0 *  " + ANSI_RESET);
            System.out.println(selectedcolor + "  * * * * ^ * * * " + ANSI_RESET);
            System.out.println(selectedcolor + "   * * * \\__/ * * " + ANSI_RESET);
            System.out.println(selectedcolor + "     * * * * * " + ANSI_RESET);
        }else if(mood == 1){
            System.out.println(selectedcolor + "      _______" + ANSI_RESET);
            System.out.println(selectedcolor + "     /       \\" + ANSI_RESET);
            System.out.println(selectedcolor + "    /         \\" + ANSI_RESET);
            System.out.println( selectedcolor +"   /___________\\" + ANSI_RESET);
            System.out.println(selectedcolor + "    * * * * * * " + ANSI_RESET);
            System.out.println(selectedcolor + "  * * 0 * * * 0 *  " + ANSI_RESET);
            System.out.println(selectedcolor + "  * * * * ^ * * * " + ANSI_RESET);
            System.out.println(selectedcolor + "   * * * /--\\ * * " + ANSI_RESET);
            System.out.println(selectedcolor + "     * * * * * " + ANSI_RESET);
        }else{
            System.out.println("Incorrect value.");
        }
    }
}

