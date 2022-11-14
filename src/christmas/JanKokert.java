package christmas;

import java.util.Scanner;

public class JanKokert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mood, buttons, answer;
        boolean end = false;
        
        while (!end) {
        do {
            System.out.println("Jakou má perníkový panáček náladu?");
            System.out.println("-1: špatnou, 0: neutrální, 1: skvělou");
            mood = sc.nextInt();
        } while (mood < -1 || mood > 1);
        
        do {
            System.out.println("Kolik má mít perníkový panáček knoflíků?");
            System.out.println("Vyber celé číslo v rozsahu 0 až 4");
            buttons = sc.nextInt();
        } while (buttons < 0 || buttons > 4);
        
            switch (mood) {
                case 1:
                case 0:
                case -1:
                    switch (buttons) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            int i,
                             j;
                            for (i = 1; i <= 31; i++) {
                                System.out.print("* ");
                                if (i == 1) {
                                    for (j = 1; j <= 29; j++) {
                                        System.out.print("* ");
                                    }
                                }
                                if (i == 2) {
                                    for (j = 1; j <= 29; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i >= 3 && i <= 6) {
                                    for (j = i; j < 26; j++) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i >= 20 && i <= 26) {
                                    for (j = i; j < 39; j++) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i >= 27 && i <= 29) {
                                    for (j = i; j > 14; j--) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i == 30) {
                                    for (j = 1; j <= 29; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i == 31) {
                                    for (j = 1; j <= 29; j++) {
                                        System.out.print("* ");
                                    }
                                }
                                if (i == 3) {
                                    for (j = 1; j <= 5; j++) {
                                        System.out.print("* ");
                                    }
                                }

                                switch (mood) {
                                    case 1:
                                        // switch mood - RUKA (case 1)
                                        if (i >= 7 && i <= 14) {
                                            for (j = i; j > 1; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 15 && i <= 18) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i >= 7 && i <= 14) {
                                            System.out.print("* ");
                                        }
                                        if (i == 7 || i == 14) {
                                            for (j = 1; j <= 3; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i >= 8 && i <= 11) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i >= 8 && i <= 11) {
                                            System.out.print("* ");
                                        }
                                        if (i >= 8 && i <= 10) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 7) {
                                            for (j = 1; j <= 5; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 3; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 5; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 12) {
                                            for (j = 1; j <= 16; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 13) {
                                            for (j = 1; j <= 13; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i == 19) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        // END switch mood - RUKA (case 1)
                                        break;
                                    case 0:
                                        // switch mood RUKA (case 0)
                                        if (i == 7) {
                                            for (j = 1; j <= 19; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 8 && i <= 10) {
                                            for (j = i; j > -11; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 11 && i <= 12) {
                                            for (j = i; j < 18; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 13 && i <= 14) {
                                            for (j = i; j > 7; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 9; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i >= 12 && i <= 13) {
                                            System.out.print("* ");
                                        }
                                        if (i == 14) {
                                            for (j = 1; j <= 7; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 4; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 12) {
                                            for (j = 1; j <= 21; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 13) {
                                            for (j = 1; j <= 19; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 15 && i <= 19) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        //END switch mood ruka (case 0)
                                        break;
                                    case -1:
                                        // switch mood - RUKA (case -1)
                                        if (i == 7) {
                                            for (j = 1; j <= 19; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 8 && i <= 10) {
                                            for (j = i; j > -11; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 11 && i <= 18) {
                                            for (j = i; j < 25; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i == 19) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i >= 11 && i <= 18) {
                                            System.out.print("* ");
                                        }
                                        if (i == 18) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i >= 14 && i <= 17) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i >= 14 && i <= 18) {
                                            System.out.print("* ");
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 4; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 5; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 14) {
                                            System.out.print("* ");
                                        }
                                        if (i >= 15 && i <= 18) {
                                            for (j = i; j > 13; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i == 12) {
                                            for (j = 1; j <= 14; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 13) {
                                            for (j = 1; j <= 13; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        // END switch mood - RUKA (case -1)
                                        break;
                                }
                                if (i >= 3 && i <= 6) {
                                    System.out.print("* ");
                                }
                                if (i >= 19 && i <= 29) {
                                    System.out.print("* ");
                                }
                                if (i >= 15 && i <= 18) {
                                    System.out.print("* ");
                                }
                                if (i == 29) {
                                    for (j = 1; j <= 2; j++) {
                                        System.out.print("* ");
                                    }
                                }
                                if (i == 4) {
                                    for (j = 1; j <= 5; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i == 5 || i == 6) {
                                    for (j = i; j >= 4; j--) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i == 14) {
                                    for (j = 1; j <= 8; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if ((i == 15) || (i == 17) || (i == 19)) {
                                    for (j = 1; j <= 5; j++) {
                                        System.out.print(" ");
                                    }
                                }
                                if ((i == 16) || (i == 18)) {
                                    for (j = 1; j <= 7; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i == 20 || i == 21) {
                                    for (j = i; j > 12; j--) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i >= 22 && i <= 26) {
                                    for (j = 1; j <= 4; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i == 27 || i == 28) {
                                    for (j = 2 * i; j <= 60; j++) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i == 5 || i == 6) {
                                    System.out.print("**");
                                }
                                if ((i >= 7 && i <= 10) || (i >= 22 && i <= 28)) {
                                    System.out.print("* ");
                                }
                                if (i == 5 || i == 6) {
                                    System.out.print("   ");
                                }
                                if (i == 5 || i == 6) {
                                    System.out.print("**");
                                }
                                if (i == 5 || i == 6) {
                                    for (j = i; j > 2; j--) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i == 7) {
                                    for (j = 1; j <= 8; j++) {
                                        System.out.print("  ");
                                    }
                                }

                                switch (mood) {
                                    case 1:
                                        //switch mood - PUSA (case 1)
                                        if (i == 8 || i == 9) {
                                            for (j = 1; j <= 3; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i == 10) {
                                            for (j = 1; j <= 6; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 8) {
                                            System.out.print("* ");
                                            for (j = 1; j <= 3; j++) {
                                                System.out.print("  ");
                                            }
                                            System.out.print("* ");
                                        }
                                        if (i == 9) {
                                            for (j = 1; j <= 4; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i == 8 || i == 9) {
                                            System.out.print("   ");
                                        }
                                        // END mood - PUSA (case 1)
                                        break;
                                    case 0:
                                        //switch mood - PUSA (case 0)
                                        if (i == 8) {
                                            for (j = 1; j <= 8; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 9) {
                                            System.out.print("  ");
                                            for (j = 1; j <= 5; j++) {
                                                System.out.print("* ");
                                            }
                                            System.out.print("  ");
                                        }
                                        if (i == 10) {
                                            for (j = 1; j <= 6; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        // END mood - PUSA (case 0)
                                        break;
                                    case -1:
                                        //switch mood - PUSA (case -1)
                                        if (i == 8) {
                                            for (j = 1; j <= 8; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 9) {
                                            System.out.print("   ");
                                            for (j = 1; j <= 4; j++) {
                                                System.out.print("* ");
                                            }
                                            System.out.print("   ");
                                        }
                                        if (i == 10) {
                                            System.out.print(" *");
                                            for (j = 1; j <= 7; j++) {
                                                System.out.print(" ");
                                            }
                                            System.out.print("*  ");
                                        }
                                        // END mood - PUSA (case -1)
                                        break;
                                }

                                if (i >= 4 && i <= 10) {
                                    System.out.print("* ");
                                }
                                if (i >= 3 && i <= 6) {
                                    for (j = i; j < 26; j++) {
                                        System.out.print(" ");
                                    }
                                }

                                switch (buttons) {
                                    case 0:
                                        //switch buttons (case 0)
                                        if (i == 13 || i == 15 || i == 17 || i == 19) {
                                            System.out.print("   ");
                                        }
                                        //END switch buttons (case 0)
                                        break;
                                    case 1:
                                        //switch buttons (case 1)
                                        if (i == 13 || i == 15 || i == 17) {
                                            System.out.print("   ");
                                        }
                                        if (i == 19) {
                                            System.out.print("***");
                                        }
                                        //END switch buttons (case 1)
                                        break;
                                    case 2:
                                        //switch buttons (case 2)
                                        if (i == 13 || i == 15) {
                                            System.out.print("   ");
                                        }
                                        if (i == 17 || i == 19) {
                                            System.out.print("***");
                                        }
                                        //END switch buttons (case 2)
                                        break;
                                    case 3:
                                        //switch buttons (case 3)
                                        if (i == 13) {
                                            System.out.print("   ");
                                        }
                                        if (i == 15 || i == 17 || i == 19) {
                                            System.out.print("***");
                                        }
                                        break;
                                        //END switch buttons (case 3)
                                    case 4:
                                        //switch buttons (case 4)
                                        if (i == 13 || i == 15 || i == 17 || i == 19) {
                                            System.out.print("***");
                                        }
                                        //END switch buttons (case 4)
                                        break;
                                }

                                if (i == 15 || i == 17 || i == 19) {
                                    for (j = 1; j <= 3; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i >= 23 && i <= 28) {
                                    for (j = i; j > 22; j--) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i == 29) {
                                    for (j = 1; j <= 8; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i >= 22 && i <= 28) {
                                    System.out.print("* ");
                                }
                                if (i == 29) {
                                    for (j = 1; j <= 3; j++) {
                                        System.out.print("* ");
                                    }
                                }
                                if (i >= 22 && i <= 26) {
                                    for (j = 1; j <= 4; j++) {
                                        System.out.print("  ");
                                    }
                                }
                                if (i == 27 || i == 28) {
                                    for (j = 2 * i; j <= 60; j++) {
                                        System.out.print(" ");
                                    }
                                }
                                if ((i >= 15 && i <= 21) || (i >= 22 && i <= 28)) {
                                    System.out.print("* ");
                                }

                                switch (mood) {
                                    case 1:
                                        //switch mood - RUKA (case 1)
                                        if (i == 13) {
                                            for (j = 1; j <= 7; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 7) {
                                            for (j = 1; j <= 5; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 8 && i <= 10) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 4; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i >= 7 && i <= 10) {
                                            System.out.print("* ");
                                        }
                                        if (i == 7) {
                                            for (j = 1; j <= 3; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i >= 8 && i <= 11) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i >= 8 && i <= 13) {
                                            System.out.print("* ");
                                        }
                                        if (i == 14) {
                                            for (j = 1; j <= 4; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i >= 7 && i <= 14) {
                                            for (j = i; j > 1; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 15 && i <= 19) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        //END switch mood - RUKA (case 1)
                                        break;
                                    case 0:
                                        //switch mood - RUKA (case 0)
                                        if (i == 7) {
                                            for (j = 1; j <= 19; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 8 && i <= 10) {
                                            for (j = i; j > -11; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 15 && i <= 19) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 9; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if (i == 13) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if ((i >= 12) && (i <= 13)) {
                                            System.out.print("* ");
                                        }
                                        if (i == 14) {
                                            for (j = 1; j <= 7; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if ((i >= 11) && (i <= 12)) {
                                            for (j = i; j < 18; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if ((i >= 13) && (i <= 14)) {
                                            for (j = i; j > 7; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        //END switch mood - RUKA (case 0)
                                        break;
                                    case -1:
                                        //switch mood - RUKA (case -1)
                                        if (i == 19) {
                                            for (j = 1; j <= 10; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 14) {
                                            System.out.print("* ");
                                        }
                                        if (i == 11) {
                                            for (j = 1; j <= 4; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if ((i >= 15) && (i <= 18)) {
                                            for (j = i; j > 13; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if ((i >= 14) && (i <= 18)) {
                                            System.out.print("* ");
                                        }
                                        if (i == 18) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("* ");
                                            }
                                        }
                                        if ((i >= 14) && (i <= 17)) {
                                            for (j = 1; j <= 2; j++) {
                                                System.out.print("  ");
                                            }
                                        }
                                        if (i == 13) {
                                            for (j = 1; j <= 14; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if ((i >= 11) && (i <= 18)) {
                                            System.out.print("* ");
                                        }
                                        if (i == 7) {
                                            for (j = 1; j <= 19; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if (i >= 8 && i <= 10) {
                                            for (j = i; j > -11; j--) {
                                                System.out.print(" ");
                                            }
                                        }
                                        if ((i >= 11) && (i <= 18)) {
                                            for (j = i; j < 25; j++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        //END switch mood - RUKA (case -1)
                                        break;
                                }

                                if (i >= 20 && i <= 26) {
                                    for (j = i; j < 39; j++) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i >= 27 && i <= 29) {
                                    for (j = i; j > 14; j--) {
                                        System.out.print(" ");
                                    }
                                }
                                if (i >= 1 && i <= 31) {
                                    System.out.print("*");
                                }

                                System.out.println();
                            }
                            break;
                    }

                    break;
            }
            
            do {
            System.out.println("Chceš ukončit program?");
            System.out.println("0: ne, 1: ano");
            answer = sc.nextInt();
            } while (answer < 0 || answer > 1);
            
            if (answer == 1) {
                end = true;
            }
        }
    }
}
