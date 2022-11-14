package christmas;
import java.util.Scanner;
/*
@author Ronald.Ch.Siddall - ALG1 - 2022 - Vánoční úloha
*/
public class RonaldChristopherSiddall {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 70; i++) {
            System.out.print("❆");
        }
        System.out.println("");
        for (int j = 0; j < 30; j++) {
            System.out.print(" ");
        }
        System.out.println("VÍTEJTE V PŘÍPRAVNĚ VÁNOČNÍCH SVÍČEK!");
        for (int k = 0; k < 70; k++) {
            System.out.print("❆");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("✔ Chcete si pomocí programu vytvořit svoji vlastní vánoční svíčku? Ano?");
        System.out.println("✔ Tak zde si můžete, milý uživateli, přizpůsobit svoji svíčku, a to přesně dle svých představ!");
        System.out.println("✔ Kromě velikosti a zbarvení si můžete i zvolit, zda chcete svoji svíčku nakonec zapálit!");
        System.out.println("");
        System.out.println("🌠️️ Skvělé že? Tak pojďme začít! 🌠️️");

        int choiceStartMenu;
        boolean end = false;
        do {
            displayStartMenu();
            choiceStartMenu = sc.nextInt();
            switch (choiceStartMenu) {
                case 1:smallCandle();break;
                case 2:largeCandle();break;
                case 0:System.out.println("");System.out.println("✨✨✨ Moc Vám děkujeme za použití přípravny! ✨✨✨");end = true;break;
                default:System.out.println("Neplatná volba, neboť jste stiskli jinou klávesu. Zkuste to znovu!");
            }
        } while (!end);
    }

    private static void displayStartMenu() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("▶▶▶ Zde si můžete zvolit velikost své svíčky ◀◀◀");
        System.out.println("Možnosti jsou následující:");
        System.out.println("1. Přeji si malou svíčku. ");
        System.out.println("2. Přeji si velkou svíčku.");
        System.out.println("0. Chci opustit přípravnu, tj. ukončit program.");
    }

    private static void smallCandle() {
        int choiceColourSmall;
        boolean end = false;
        do {
            displayColourMenuSmall();
            choiceColourSmall = sc.nextInt();
            switch (choiceColourSmall) {
                case 1:darkerColourSmall();break;
                case 2:lighterColourSmall();break;
                case 0:end = true;break;
                default:System.out.println("Neplatná volba, neboť jste stiskli jinou klávesu. Zkuste to znovu!");
            }
        } while (!end);
    }

    private static void displayColourMenuSmall() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("▶▶▶ Zde si můžete zvolit barvu své malé svíčky ◀◀◀");
        System.out.println("Možnosti jsou následující:");
        System.out.println("1. Přeji si malou tmavší svíčku. ");
        System.out.println("2. Přeji si malou světlejší svíčku.");
        System.out.println("0. Chci se vrátit na předchozí volbu.");
    }

    private static void darkerColourSmall() {
        int choiceFlameDark;
        boolean end = false;
        do {
            displayFlameMenuDarkSmall();
            choiceFlameDark = sc.nextInt();
            switch (choiceFlameDark) {
                case 1:smallDarkWithFlame();break;
                case 2:smallDarkNoFlame();break;
                case 0:end = true;break;
                default:System.out.println("Neplatná volba, neboť jste stiskli jinou klávesu. Zkuste to znovu!");
            }
        } while (!end);
    }

    private static void displayFlameMenuDarkSmall() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("▶▶▶ Chcete svoji malou tmavší svíčku zapálit? ◀◀◀");
        System.out.println("Možnosti jsou následující:");
        System.out.println("1. Ano, přeji si svou malou tmavší svíčku zapálit. ");
        System.out.println("2. Ne, přeji si svou malou tmavší svíčku nechat.");
        System.out.println("0. Chci se vrátit na předchozí volbu.");
    }

    private static void smallDarkWithFlame() {
        int SIZECONSTANT = 5;
        for (int i = 0; i < SIZECONSTANT; i++) {
            System.out.print(" ");
        }
        System.out.println("⎛");      
        for (int j = 0; j < SIZECONSTANT-1; j++) {
            System.out.print(" ");
        }      
        for (int k = 0; k < SIZECONSTANT-2; k++) {
            System.out.print("⎛");
        }
        for (int l = 0; l < SIZECONSTANT-2; l++) {
            System.out.print(" ");
        }
        System.out.println("");
        
        for (int m = 0; m < SIZECONSTANT-2; m++) {
            System.out.print(" ");
        }
        for (int n = 0; n < SIZECONSTANT; n++) {
            System.out.print("⎛");
        }
        System.out.println("");
        
        for (int p = 0; p < SIZECONSTANT+1; p++) { 
            for (int q = 0; q < SIZECONSTANT+1; q++) {
                System.out.print("▩");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }

    private static void smallDarkNoFlame() {
                int SIZECONSTANT = 3;

        for (int i = 1; i <= SIZECONSTANT; i++) {
            if (i != 1) {
                System.out.println(" ▎");
            }
            if (i != SIZECONSTANT) {
                for (int j = 0; j < SIZECONSTANT; j++) {
                    System.out.print(" ");
                }
            }
        }

        for (int k = 0; k < 2*SIZECONSTANT; k++) { 
            for (int l = 0; l < 2*SIZECONSTANT; l++) {
                System.out.print("▩");
            }
        System.out.println("");
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }

    private static void lighterColourSmall() {
        int choiceFlameLight;
        boolean end = false;
        
        do {
            displayFlameMenuLightSmall();
            choiceFlameLight = sc.nextInt();
            switch (choiceFlameLight) {
                case 1:smallLightWithFlame();break;
                case 2:smallLightNoFlame();break;
                case 0:end = true;break;
                default:System.out.println("Neplatná volba, neboť jste stiskli jinou klávesu, než jste měli. Zkuste to znovu!");
            }
        } while (!end);
    }

    private static void displayFlameMenuLightSmall() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("▶▶▶ Chcete svoji malou světlejší svíčku zapálit? ◀◀◀");
        System.out.println("Možnosti jsou následující:");
        System.out.println("1. Ano, přeji si svou malou světlejší svíčku zapálit. ");
        System.out.println("2. Ne, přeji si svou malou světlejší svíčku nechat.");
        System.out.println("0. Chci se vrátit na předchozí volbu.");
    }

    private static void smallLightWithFlame() {
        int SIZECONSTANT =5;
        for (int i = 0; i < SIZECONSTANT; i++) {
            System.out.print(" ");
        }
        System.out.println("⎛");      
        for (int j = 0; j < SIZECONSTANT-1; j++) {
            System.out.print(" ");
        }      
        for (int k = 0; k < SIZECONSTANT-2; k++) {
            System.out.print("⎛");
        }
        for (int l = 0; l < SIZECONSTANT-2; l++) {
            System.out.print(" ");
        }
        System.out.println("");
        
        for (int m = 0; m < SIZECONSTANT-2; m++) {
            System.out.print(" ");
        }
        for (int n = 0; n < SIZECONSTANT; n++) {
            System.out.print("⎛");
        }
        System.out.println("");
        
        for (int p = 0; p < SIZECONSTANT+1; p++) { 
            for (int q = 0; q < SIZECONSTANT+1; q++) {
                System.out.print("⬜");
            }
        System.out.println("");
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }

    private static void smallLightNoFlame() {
        int SIZECONSTANT = 3;
        for (int i = 1; i <= SIZECONSTANT; i++) {
            if (i != 1) {
                System.out.println(" ▏");
            }
            if (i != SIZECONSTANT) {
                for (int j = 0; j < SIZECONSTANT; j++) {
                    System.out.print(" ");
                }
            }
        }
        for (int k = 0; k < 2*SIZECONSTANT; k++) {
            for (int l = 0; l < 2*SIZECONSTANT; l++) {
                System.out.print("⬜");
            }
        System.out.println("");
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }

    private static void largeCandle() {
        int choiceColourLarge;
        boolean end = false;
        do {
            displayMenuColourLarge();
            choiceColourLarge = sc.nextInt();
            switch (choiceColourLarge) {
                case 1:darkerColourLarge();break;
                case 2:lighterColourLarge();break;
                case 0:end = true;break;
                default:System.out.println("Neplatná volba, neboť jste stiskli jinou klávesu, než jste měli. Zkuste to znovu!");
            }
        } while (!end);
    }

    private static void displayMenuColourLarge() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("▶▶▶ Zde si můžete zvolit barvu své velké svíčky ◀◀◀");
        System.out.println("Možnosti jsou následující:");
        System.out.println("1. Přeji si tmavší velkou svíčku. ");
        System.out.println("2. Přeji si světlejší velkou svíčku.");
        System.out.println("0. Chci se vrátit na předchozí volbu.");
    }

    private static void darkerColourLarge() {
        int choiceFlameDarkLarge;
        boolean end = false;
        do {
            displayFlameMenuLargeDark();
            choiceFlameDarkLarge = sc.nextInt();
            switch (choiceFlameDarkLarge) {
                case 1:largeDarkWithFlame();break;
                case 2:largeDarkNoFlame();break;
                case 0:end = true;break;
                default:System.out.println("Neplatná volba, neboť jste stiskli jinou klávesu, než jste měli. Zkuste to znovu!");
            }
        } while (!end);
    }

    private static void displayFlameMenuLargeDark() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("▶▶▶ Chcete svoji velkou tmavší svíčku zapálit? ◀◀◀");
        System.out.println("Možnosti jsou následující:");
        System.out.println("1. Ano, přeji si svou velkou tmavší svíčku zapálit. ");
        System.out.println("2. Ne, přeji si svou velkou tmavší svíčku nechat.");
        System.out.println("0. Chci se vrátit na předchozí volbu.");
    }

    private static void largeDarkWithFlame() {
        int SIZECONSTANT = 7;
        for (int i = 0; i < SIZECONSTANT; i++) {
            System.out.print(" ");
        }
        System.out.println("⎛");
        for (int j = 0; j < SIZECONSTANT - 1; j++) {
            System.out.print(" ");

        }
        for (int k = 0; k < SIZECONSTANT - 4; k++) {
            System.out.print("⎛");
        }
        for (int l = 0; l < SIZECONSTANT - 1; l++) {
            System.out.print(" ");
        }
        System.out.println("");
        for (int m = 0; m < SIZECONSTANT - 2; m++) {
            System.out.print(" ");
        }
        for (int n = 0; n < SIZECONSTANT - 2; n++) {
            System.out.print("⎛");
        }
        System.out.println("");
        for (int p = 0; p < SIZECONSTANT - 3; p++) {
            System.out.print(" ");
        }
        for (int q = 0; q < SIZECONSTANT; q++) {
            System.out.print("⎛");
        }
        System.out.println("");

        for (int r = 0; r < SIZECONSTANT + 2; r++) {
            for (int s = 0; s < SIZECONSTANT + 2; s++) {
                System.out.print("▩");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }

    private static void largeDarkNoFlame() {
                int SIZECONSTANT = 5;

        for (int i = 1; i <= SIZECONSTANT; i++) {
            if (i != 1) {
                System.out.println(" ▎");
            }
            if (i != SIZECONSTANT) {
                for (int j = 0; j < SIZECONSTANT; j++) {
                    System.out.print(" ");
                }
            }
        }

        for (int k = 0; k < 2*SIZECONSTANT - 1; k++) {
            for (int l = 0; l < 2*SIZECONSTANT - 1; l++) {
                System.out.print("▩");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }

    private static void lighterColourLarge() {
        int choiceFlameLightLarge;
        boolean end = false;
        do {
            displayFlameMenuLargeLight();
            choiceFlameLightLarge = sc.nextInt();
            switch (choiceFlameLightLarge) {
                case 1:largeLightWithFlame();break;
                case 2:largeLightNoFlame();break;
                case 0:end = true;break;
                default:System.out.println("Neplatná volba");
            }
        } while (!end);

    }

    private static void displayFlameMenuLargeLight() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("▶▶▶ Chcete svoji velkou světlejší svíčku zapálit? ◀◀◀");
        System.out.println("Možnosti jsou následující:");
        System.out.println("1. Ano, přeji si svou velkou světlejší svíčku zapálit. ");
        System.out.println("2. Ne, přeji si svou velkou světlejší svíčku nechat.");
        System.out.println("0. Chci se vrátit na předchozí volbu.");
    }

    private static void largeLightWithFlame() {
        int SIZECONSTANT = 8;
        for (int i = 0; i < SIZECONSTANT; i++) {
            System.out.print(" ");
        }
        System.out.println("⎛");
        
        for (int j = 0; j < SIZECONSTANT-1; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < SIZECONSTANT-5; k++) {
            System.out.print("⎛");
        }
        for (int l = 0; l < SIZECONSTANT-1; l++) {
            System.out.print(" ");
        }
        System.out.println("");
        
        for (int m = 0; m < SIZECONSTANT-2; m++) {
            System.out.print(" ");
        }
        for (int n = 0; n < SIZECONSTANT-3; n++) {
            System.out.print("⎛");
        }
        System.out.println("");
        
        for (int p = 0; p < SIZECONSTANT-3; p++) {
            System.out.print(" ");
        }
        for (int q = 0; q < SIZECONSTANT-1; q++) {
            System.out.print("⎛");
        }
        System.out.println("");

        for (int r = 0; r < SIZECONSTANT+1; r++) {
            for (int s = 0; s < SIZECONSTANT+1; s++) {
                System.out.print("⬜");
            }
            System.out.println("");
        
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }

    private static void largeLightNoFlame() {
                int SIZECONSTANT = 5;

        for (int i = 1; i <= SIZECONSTANT; i++) {
            if (i != 1) {
                System.out.println(" ▎");
            }
            if (i != SIZECONSTANT) {
                for (int j = 0; j < SIZECONSTANT; j++) {
                    System.out.print(" ");
                }
            }
        }

        for (int k = 0; k < 2*SIZECONSTANT - 1; k++) {
            for (int l = 0; l < 2*SIZECONSTANT - 1; l++) {
                System.out.print("⬜");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Zde je vaše finální vánoční svíčka přesně tak, jak jste si přáli!");
        System.out.println("Moc Vám děkujeme za používání našich služeb!");
        System.out.println("");
        System.out.println("Nyní Vás vrátíme do posledního Menu, kde jste skončil:");
    }
}