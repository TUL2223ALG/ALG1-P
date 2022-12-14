package christmas;
//Cerhova Tereza M2200141
import java.util.Scanner;

public class TerezaCerhova {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        boolean end = false;
        
        do{
            displayMenu();
            choice = sc.nextInt();

            switch (choice){
                case 1 -> plna();
                case 2 -> obrys();
                case 0 -> end = true;
                default -> System.out.println("Neplatna volba");
            }
        } while(!end); //end == false
    }
    
    private static void displayMenu(){
        System.out.println("");
        System.out.println("* X * ~ * X * ~ * X *");
        System.out.println("*~  Vesele Vanoce  ~*");
        System.out.println("* X * ~ * X * ~ * X *\n");
        System.out.println("Zadej volbu:");
        System.out.println("1. Plna ozdoba");
        System.out.println("2. Obrys ozdoby");
        System.out.println("0. Uz nechces dalsi ozdoby");
    }

  private static void plna() {
        		//deklarace promennych
                int prumer, smerX, smerY, polomer, bod, opakovaniObrys;

                
                Scanner scOpakovaniPlna = new Scanner(System.in);
		System.out.print("Zadej kolik chces ozdob: ");
		opakovaniObrys = scOpakovaniPlna.nextInt();
                
		//uzivatel zada pomer
		Scanner scPrumer = new Scanner(System.in);
		System.out.print("Zadej jak chces velkou ozdobu (4 a vetsi): ");
		prumer = scPrumer.nextInt();

		//najde prumer ozdoby
		polomer = prumer/2;

                for(int i = 0; opakovaniObrys > i ; i++){
                    //vykresleni odzoby
                    for (int radek = 0; radek <= prumer; radek++) {
                            for (int sloupec = 0; sloupec <= prumer; sloupec++) {
                                //definice smeru
                                       smerX = polomer - radek;
                                    smerY = polomer - sloupec;

                                    bod = smerX * smerX + smerY * smerY;
                                    //zjisti jestli je bod uvnitr smeruX a smeruY nebo ne
                                    if (bod <= polomer * polomer + 1) {
                                            System.out.print("X^");
                                    }else{
                                            System.out.print("  ");
                                    }
                            }
                            //novy radek
                            System.out.println();
                    }
                }
    }

    private static void obrys() {
       		// deklarace promennych
		double prazdno;
		int polomer;
                int opakovaniObrys;
                
		//uzivatel zada kolik chce ozdob
                Scanner scOpakovani = new Scanner(System.in);
		System.out.print("Zadej kolik chces ozdob: ");
		opakovaniObrys = scOpakovani.nextInt();
                
                //uzivatel zada prumer
		Scanner scPolomer = new Scanner(System.in);
		System.out.print("Zadej jak chces velkou ozdobu: ");
		polomer = scPolomer.nextInt();
                
                //for pro opakovani podle uzivatele
                for(int i = 0; opakovaniObrys > i; i++){
		//for pro radu
                    for (int rada = 0; rada <= 2 * polomer; rada++) {
			//for pro sloupec
                            for (int sloupec = 0; sloupec <= 2 * polomer; sloupec++) {
                                    prazdno = Math.sqrt((rada - polomer) * (rada - polomer) + (sloupec - polomer) * (sloupec - polomer));
                                    //vykresleni obrysu ozdoby
                                    if (prazdno > polomer - 0.5 && prazdno < polomer + 0.5)
                                            System.out.print("X ");
                                    else
                                            System.out.print("  ");
			}
			System.out.println();
		}
                } 
    }
}
