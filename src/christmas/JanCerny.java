package christmas;

import java.util.Scanner;

/**
 *
 * @author Jan Černý
 */
public class JanCerny {

    static Scanner sc = new Scanner(System.in);
    static int size;
    static int color;
    static String resetColor = "\u001B[30m";

    public static void main(String[] args) {
        int choice;
        boolean end = true;
        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ChristmasPresent();
                    break;
                case 2:
                    NextProject();
                    break;
                case 0:
                    end = false;
                    break;
                default:
                    System.out.println("\n\nNeplatna volba");
            }
        } while (end);
    }

    private static void displayMenu() {
        System.out.println("Vítejte ve výběru projektů:");
        System.out.println("1. Vánoční projekt (Projekt s vánočním dárkem)");
        System.out.println("2. Další projekt");
        System.out.println("0. Konec");
    }

    private static void ChristmasPresent() {
        getSize();
        checkSize();
        getIntColor();
        checkColor();
        String sColor = getColor();
        Present(size, sColor);
    }

    private static void getSize() {
        System.out.println("Zadejte velikost vánočního dárku v rozmezí od 10-50");
        size = sc.nextInt();
    }

    private static void checkSize() {
        if (size < 10 || size > 50) {
            System.out.println("Zadali jste špatnou hodnotu!");
            getSize();
            checkSize();
        }
    }

    private static void checkColor() {
        if (color < 1 || color > 6) {
            System.out.println("Zadali jste špatnou hodnotu!");
            getIntColor();
            checkColor();
        }
    }

    private static void getIntColor() {
        System.out.println("Vyberte barvu stuhy na dárek:");
        System.out.println("1. \u001B[34mModrá\u001B[30m");
        System.out.println("2. \u001B[31mČervená\u001B[30m");
        System.out.println("3. \u001B[32mZelená\u001B[30m");
        System.out.println("4. \u001B[33mŽlutá\u001B[30m");
        System.out.println("5. \u001B[35mFialová\u001B[30m");
        System.out.println("6. \u001B[36mTyrkysová\u001B[30m");
        color = sc.nextInt();
    }

    private static String getColor() {
        String Scolor = "";
        switch (color) {
            case 1:
                Scolor = "\u001B[34m";
                break;
            case 2:
                Scolor = "\u001B[31m";
                break;
            case 3:
                Scolor = "\u001B[32m";
                break;
            case 4:
                Scolor = "\u001B[33m";
                break;
            case 5:
                Scolor = "\u001B[35m";
                break;
            case 6:
                Scolor = "\u001B[36m";
                break;
        }
        return Scolor;
    }

    public static void Present(int size, String sColor) {
        int rowRibbon = (size / 2) - 3;
        int body = (size / 2) + 1;
        
        String present = presentRibbon(size, 4, rowRibbon, sColor);
        
        //Get body of present
        for (int i = 1; i != body + 1; i++) {
            if (i == 1) {
                for (int y = 0; y != size; y++) {
                    present += "-";
                }
                present += "\n";
            } else if (i == body) {
                for (int y = 0; y != size; y++) {
                    present += "-";
                }
                present += "\n";
            }

            if (i == (body / 2) + 1 || body % 2 == 0 && i == body / 2) {
                for (int y = 1; y != size + 1; y++) {
                    if (y == 1 || y == size) {
                        present += "|";
                    } else if (y == size / 2 && size % 2 == 0 || y == (size / 2) + 1) {
                        present += sColor + "|" + resetColor;
                    } else {
                        present += sColor + "~" + resetColor;
                    }
                }
                present += "\n";
            } else if (i != 2 && i != body) {
                for (int y = 1; y != size + 1; y++) {
                    if (y == 1 || y == size) {
                        present += "|";
                    } else if (y == size / 2 && size % 2 == 0 || y == (size / 2) + 1){
                        present += sColor + "|" + resetColor;
                    } else {
                        present += "*";
                    }
                }
                present += "\n";
            }
        }

        System.out.printf(present);
    }

   
    private static String presentRibbon(int size, int spacesStart, int rowRibbon, String sColor) {
        String ribbon = "";
        int spacesMiddle = (size - 10) + 2;
        for (int i = 1; i != rowRibbon + 1; i++) {
            for (int y = 1; y != 2 + spacesMiddle + spacesStart; y++) {
                if (y == spacesStart) {
                    ribbon += (sColor + "\\" + resetColor);
                } else if (y == spacesMiddle + spacesStart + 1) {
                    ribbon += (sColor + "/" + resetColor);
                } else {
                    ribbon += (" ");
                }
            }
            ribbon += "\n";
            spacesMiddle = spacesMiddle - 2;
            spacesStart++;
        }

        return ribbon;
    }

    private static void NextProject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
