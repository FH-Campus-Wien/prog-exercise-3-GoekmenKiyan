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

        long m = ((long) Math.pow(2, 31));
        int a = 1103515245;
        int c = 12345;

        long[] randomNumbers = new long[10];

        for (int i = 0; i < 10; i++)
        {
            if (i == 0)
            {
                randomNumbers[i] = (a * seed + c) % m;
            }
            else
            {
                randomNumbers[i] = (a * randomNumbers[i-1] + c) % m;
            }
        }
        return randomNumbers;
    }


        //randomNumbers[0] = (a * seed + c) % m;





    //----------------------------------------------------------

    public static void guessingGame (int numberToGuess){

        //......
        Scanner scan = new Scanner(System.in);

        int guesses = 10;
        int counter = 1;

        for (int i = 0; i < guesses; i++)
        {
            System.out.print("Guess number " + counter + ": ");
            int guess = scan.nextInt();

            if (guess == numberToGuess)
            {
                System.out.println("You won wisenheimer!");
                break;
            }
            else
            {
                if (i + 1 == guesses)   // Letzter Versuch war falsch
                {
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    break;
                }
                if (guess > numberToGuess)   // zu groß
                {
                    System.out.println("The number AI picked is lower than your guess.");
                }
                else {   // zu klein
                    System.out.println("The number AI picked is higher than your guess.");
                }
            }
            counter++;
        }
    }




    //----------------------------------------------------------


    public static int randomNumberBetweenOneAndHundred()
    {
        Random rdm = new Random();

        return rdm.nextInt(100-1+1) + 1;
    }


    //----------------------------------------------------------

    public static boolean swapArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            array1[i]=array1[i]-array2[i];
            array2[i]=array2[i]+array1[i];
            array1[i]=array2[i]-array1[i];
        }
        return true;
    }


    //----------------------------------------------------------

    public static String camelCase(String satz) {
        char[] sentenceChars = satz.toCharArray();
        if (sentenceChars[0] >= 97 && sentenceChars[0] <= 122)
            sentenceChars[0] -= 32;

        for (int i = 0; i < sentenceChars.length; i++) {
            if (i >= 1 && sentenceChars[i-1] == ' ' && sentenceChars[i] >= 97 && sentenceChars[i] <= 122){    // a-z
                sentenceChars[i] -= 32;   // Buchstabe Groß
            }
            if (i >= 1 && sentenceChars[i-1] != ' ' && sentenceChars[i] >= 65 && sentenceChars[i] <= 90){     // A-Z
                sentenceChars[i] += 32;
            }
        }

        for (int i = 0; i < sentenceChars.length; i++) {
            if ((sentenceChars[i] > 0 && sentenceChars[i] <= 64) || (sentenceChars[i] >= 91 && sentenceChars[i] <= 96) || (sentenceChars[i] >= 123 && sentenceChars[i] <= 127)){
                sentenceChars[i] = 32;
            }
        }
        String sol = String.valueOf(sentenceChars).replaceAll(" ","");
        return sol;
    }



    //----------------------------------------------------------

    public static int checkDigit (int[] digitToCheck)
    {
        int result;
        int sum = 0;
        int weighting = 2;

        for (int i = 0; i < digitToCheck.length; i++)
        {
            sum += digitToCheck[i] * (i + weighting);
        }

        int mod = sum % 11;

        result = 11 - mod;

        if (result == 10)
        {
            result = 0;
        }

        if (result == 11)
        {
            result = 5;
        }
        return result;
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