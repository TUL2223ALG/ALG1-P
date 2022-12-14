
package christmas;

//Popis:
//Program nakresli vanocni prani. Uzivatel zasava barvu svicky a pocet dni zbyvajicich do Vanoc.
//Pokud je pocet dni vyssi nez 24, program vypise zpravu.
//Pokud je pocet dni mensi nez 24, program zobrazi prani. S ubyvajicim poctem dnu se zmensuje svicka.
//Pokud je pocet dni 0, program zobrazi prani a zmeni text ve spodni casti.

import java.util.Scanner;

public class AdamNyc {
   
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        //promenne
        int pocetDni;
        int barva;
        int vyska;
        int maxDny = 24;
        int plamen = 3;
        final int SIRKA_SVICKA = 11;
        final int SIRKA = SIRKA_SVICKA * 7;
        boolean spatnaVolba;

        //barvy
        String COLOR = "barva";     
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";        
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";        
        String WHITE = "\u001b[0m";
        String YELLOW = "\u001b[33;1m";
        String GREY = "\u001b[30;1m";

        //uvod
        System.out.print(GREEN + "|");
        for (int c = 1; c <= (SIRKA); c++) {
            System.out.print(RED + "-");
        }
        System.out.print(GREEN + "|");
        System.out.println("");
        System.out.print(GREEN + "|");
        for (int a = 1; a <= 31; a++) {
            System.out.print(" ");
        }
        System.out.print(YELLOW + "~VANOCNI PRANI~");
        for (int b = 1; b <= 31; b++) {
            System.out.print(" ");
        }
        System.out.print(GREEN + "|");
        System.out.println("");
        System.out.print(GREEN + "|");
        for (int c = 1; c <= (SIRKA); c++) {
            System.out.print(RED + "-");
        }
        System.out.print(GREEN + "|");
        System.out.println("\n");

        //vstup od uzivatel 1 - barva        
        do {
            spatnaVolba = false;
            System.out.println("Jaka barva svicky by se Vam libila? "
                    + "1 - bila. 2 - cervena, 3 - fialova, 4 - modra");
            barva = sc.nextInt();

            switch (barva) {
                case 1:
                    COLOR = WHITE;
                    break;
                case 2:
                    COLOR = RED;
                    break;
                case 3:
                    COLOR = PURPLE;
                    break;
                case 4:
                    COLOR = BLUE;
                    break;                
                default:
                    System.out.println("Spatna volba.");
                    spatnaVolba = true;
            }

        } while (spatnaVolba == true);

        //vstup uzivatele 2 - pocet dni do Vanoc
        System.out.println("Kolik dni zbyva do Vanoc?");
        pocetDni = sc.nextInt();
        vyska = pocetDni + 6;

        if (pocetDni > 24) {
            System.out.println("\n \n \n");
            System.out.print(GREEN + "|");
            for (int c = 1; c <= (SIRKA); c++) {
                System.out.print(RED + "-");
            }
            System.out.print(GREEN + "|");
            System.out.println("");
            System.out.print(GREEN + "|");
            for (int a = 1; a <= 13; a++) {
                System.out.print(" ");
            }
            System.out.print(YELLOW + "VANOCE JSOU JESTE DALEKO. :("
                    + " Odpocitavame od 1.12.");
            for (int b = 1; b <= 14; b++) {
                System.out.print(" ");
            }
            System.out.print(GREEN + "|");
            System.out.println("");
            System.out.print(GREEN + "|");
            for (int c = 1; c <= (SIRKA); c++) {
                System.out.print(RED + "-");
            }
            System.out.print(GREEN + "|");
            System.out.println("\n\n\n");
        } else {
            System.out.println("\n\n\n");
            //horni ramecek        
            for (int a = 1; a <= 3; a++) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= (SIRKA); b++) {
                    System.out.print(RED + "-");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }
            for (int a = 1; a <= 4; a++) {
                System.out.print(GREEN + "|");
                for (int b = (4 - a); b >= 1; b--) {
                    System.out.print(RED + "-");
                }
                System.out.print(GREEN + "|");
                for (int c = 1; c <= ((SIRKA) - (10 - 2 * a)); c++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                for (int d = 4 - a; d >= 1; d--) {
                    System.out.print(RED + "-");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //mezera nad svickou
            for (int a = 0; a <= (maxDny - pocetDni); a++) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= (SIRKA); b++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //plamen - horni cast
            for (int a = 1; a <= plamen; a++) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= 33; b++) {
                    System.out.print(" ");
                }
                for (int c = (plamen) - a + 3; c >= 1; c--) {
                    System.out.print(" ");
                }

                for (int d = 1; d <= a; d++) {
                    System.out.print(YELLOW + "S ");
                }
                for (int e = 1; e <= 33 + (5 - a); e++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //plamen - spodni cast
            for (int a = (plamen); a >= 1; a--) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= 33; b++) {
                    System.out.print(" ");
                }

                for (int c = 1; c <= ((plamen) - a) + 3; c++) {
                    System.out.print(" ");
                }
                for (int d = a; d >= 1; d--) {
                    if (a == 1) {
                        System.out.print(WHITE + "| ");
                    } else {
                        System.out.print(YELLOW + "S ");
                    }
                }
                for (int e = 1; e <= 33 + (5 - a); e++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //vrchni okraj svicky (zmena barvy)
            for (int a = 2; a >= 1; a--) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= (SIRKA / 2 - 3 - (2 - a)); b++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= (SIRKA_SVICKA - 2 * a); c++) {
                    System.out.print(COLOR + "*");
                }
                for (int d = 1; d <= (SIRKA / 2 - 3 - (2 - a)); d++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //svicka (zmena barvy a velikosti)
            for (int a = 1; a <= vyska; a++) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= (SIRKA / 2) - 5; b++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= 11; c++) {
                    System.out.print(COLOR + "*");
                }
                for (int d = 1; d <= (SIRKA / 2) - 5; d++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //dolni okraj svicky (zmena barvy)
            System.out.print(GREEN + "|");
            for (int a = 1; a <= (SIRKA / 2 - ((SIRKA_SVICKA / 2) - 1)); a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (SIRKA_SVICKA - 2); b++) {
                System.out.print(COLOR + "*");
            }
            for (int c = 1; c <= (SIRKA / 2 - ((SIRKA_SVICKA / 2) - 1)); c++) {
                System.out.print(" ");
            }
            System.out.print(GREEN + "|");
            System.out.println("");

            //horni cast stojanku
            for (int a = 1; a <= 5; a++) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= ((SIRKA / 2) - (SIRKA_SVICKA - 1) / 2) - 3; b++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= a - 1; c++) {
                    System.out.print(" ");
                }
                for (int d = 1; d <= (SIRKA_SVICKA - a - 1); d++) {
                    System.out.print(GREY + "V ");
                }
                for (int e = 1; e <= ((SIRKA / 2) - (SIRKA_SVICKA / 2) - 5 + a); e++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
                if (a == 5) {
                    System.out.print(GREEN + "|");
                    for (int f = 1; f <= ((SIRKA / 2) - (SIRKA_SVICKA - 1) / 2) - 4 + a; f++) {
                        System.out.print(" ");
                    }
                    for (int g = 1; g <= (SIRKA_SVICKA - a - 1); g++) {
                        System.out.print(GREY + "V ");
                    }
                    for (int h = 1; h <= ((SIRKA / 2) - (SIRKA_SVICKA / 2) - 5 + a); h++) {
                        System.out.print(" ");
                    }
                    System.out.print(GREEN + "|");
                    System.out.println("");
                }

            }

            //dolni cast stojanku
            for (int a = 1; a <= 2; a++) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= (SIRKA / 2) - 6; b++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= 7; c++) {
                    System.out.print(GREY + "V ");
                }
                for (int d = 1; d <= (SIRKA / 2) - 7; d++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //spodni ramecek
            for (int a = 4; a >= 1; a--) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= (4 - a); b++) {
                    System.out.print(RED + "-");
                }
                System.out.print(GREEN + "|");
                for (int c = 1; c <= (SIRKA) - 10 + 2 * a; c++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                for (int d = 0; d <= (4 - a) - 1; d++) {
                    System.out.print(RED + "-");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }
            for (int a = 1; a <= 3; a++) {
                System.out.print(GREEN + "|");
                for (int b = 1; b <= (SIRKA); b++) {
                    System.out.print(RED + "-");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }

            //text
            if (pocetDni == 0) {
                System.out.print(GREEN + "|");
                for (int a = 1; a <= 22; a++) {
                    System.out.print(" ");
                }
                System.out.print(YELLOW + "VANOCE JSOU TU! STASTNE A VESELE!");
                for (int b = 1; b <= 22; b++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            } else {
                System.out.print(GREEN + "|");
                for (int a = 1; a <= 29; a++) {
                    System.out.print(" ");
                }
                System.out.print(YELLOW + "VANOCE SE BLIZI...");
                for (int b = 1; b <= 30; b++) {
                    System.out.print(" ");
                }
                System.out.print(GREEN + "|");
                System.out.println("");
            }
            System.out.print(GREEN + "|");
            for (int c = 1; c <= (SIRKA); c++) {
                System.out.print(RED + "-");
            }
            System.out.print(GREEN + "|");
            System.out.println("\n\n\n");            
        }
        
    }
    
}
