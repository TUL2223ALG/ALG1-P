/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week07_sequence;

import java.util.Scanner;

/**
 *
 * @author jana.vitvarova
 */
public class Sequence {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        searchMax(); //volani metody
        boolean result = isSorted2();
        System.out.println("Number sequence " + ((result) ? "is " : "isn't ") + "sorted");

    }

    private static void searchMax() { //deklarace metody
        System.out.println("Zadejte pocet cisel.");
        int length = sc.nextInt();
        if (length >= 1) { //osetreni limitnych pripadu
            int max = Integer.MIN_VALUE;

            int countMax = 0;
            int number;
            System.out.println("Zadejte cisla:");
            for (int i = 0; i < length; i++) {
                number = sc.nextInt();
                if (number > max) {
                    max = number;
                    countMax = 1;
                } else if (number == max) {
                    countMax++;
                }
            }
            System.out.println("Nejvyssi cislo je: " + max);
            System.out.println("Pocet: " + countMax);
        } else {
            System.out.println("Nelze zjistit.");
        }
    }

    private static boolean isSorted2() {
        int num = 0, lastNum = 0;
        System.out.print("Enter the number: ");
        while ((num = sc.nextInt()) > 0) {
            if (num < lastNum) {
                return false;
            }
            lastNum = num;
        }
        return true;
    }
}
