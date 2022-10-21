package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalendar(int numberDays, int startingDay){

        int row = startingDay - 1;


        System.out.print(" ");
        for (int x = 0; x < startingDay*3-3; x++)
            System.out.print(" ");

        int i = 1;
        while (i <= numberDays) {
            while (row < 7 && i <= numberDays) {
                if (i >= 9 || row == 6)
                    System.out.print(i + " ");
                else
                    System.out.print(i + "  ");
                row++;
                i++;
            }
            System.out.println();
            if (i < 10)
                System.out.print(" ");
            row = 0;
        }



    }

    //----------------------------------------------------------

    public static long [] lcg(long seed){

        long[] randomNumbers = new long [10];

        final long m = (long) Math.pow(2, 31);
        final int c = 12345;
        final int a = 1103515245;

        randomNumbers[0] = (a * seed + c) % m;

        // Hier kommen die Berechnungen hin
        for (int i = 1; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
        return randomNumbers;

    }

    //----------------------------------------------------------

    public static void guessingGame (int numberToGuess){

        //......

    }


    //----------------------------------------------------------


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        //oneMonthCalendar(30,3);    =    Code working

        //lcg(2);

    }
}