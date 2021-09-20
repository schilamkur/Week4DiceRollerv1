import java.util.Random;
import java.util.Scanner;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        // Dice Roller version 1 - simple single dice

        /*
        Random rand = new Random();
        int theRoll = rand.nextInt(6) + 1; // random number between 1 and 6
        System.out.println(theRoll);
         */

        //version 2 - roll two dice
        /*
        int total = 0;
        Random rand1 = new Random();
        Random rand2 = new Random();
        int die1 = rand1.nextInt(6) + 1;
        int die2 = rand1.nextInt(6) + 1;
        total = die1 + die2;
        System.out.println("You rolled " + die1 + "and " + die2 + "for a total of " + total + "!");
        if(die1 == die2){
            System.out.println("You got doubles!");
        }
         */
        //version 3 - lots of dice
        /*
        int total = 0;
        int[] dice = new int[5];
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }
        String msg = "";
        for (int j = 0; j < dice.length; j++) {
            msg += "You rolled a " + dice[j] + "\n";
            System.out.println(msg);
            total += dice[j];
        }
        System.out.println("Your total is " + total);

         */
        //version 4  - enhanced for loop
        /*
        int total = 0;
        int[] dice = new int[6];
        for (int i = 0; i < 6; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }
        String msg = "";
        //for (int j = 0; j < dice.length; j++) {
        for (int die : dice) {
            msg += "You rolled a " + dice[die] + "\n";
            System.out.println(msg);
            total += dice[die];
        }
        System.out.println("Your total is " + total);
         */

        //version 5 - prompt for the number of sides
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("How many die do you want to roll?");
        int numDie = input.nextInt();
        int total = 0;
        int[] dice = new int[numDie];

        for (int i = 0; i < numDie; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }
        String msg = "";
        for (int die : dice) {
            msg += "You rolled a " + dice[die] + "\n";
            System.out.println(msg);
            total += dice[die];
        }
        System.out.println("Your total is " + total);

         */
        //version 6 - prompt for the number of sides
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides are on the die you want to roll?");
        int numSides = input.nextInt();
        int total = 0;
        //go back to rolling 5 dice
        int[] dice = new int[5];

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
        }
        String msg = "";
        for (int die : dice) {
            msg += "You rolled a " + die + " on a " + numSides + " sided dice\n";
            System.out.println(msg);
            total += die;
        }
        System.out.println("Your total is " + total);

         */

        //challenge (homework) 1: write code to let user set both number of dice and number of sides using XdY syntax
        //i.e. user enters 5d8 - meaning 5 8-sided dice
        //hint: google Java's split() function

        //challenge(homework) 2: write code to use a while() loop to let the user continue to roll dice until they decide to stop
        //You do not need to keep track of all of the rolls

        //these can be done in one project

        String ans = "yes";
        while(ans.equals("yes")){
            Scanner input = new Scanner(System.in);
            System.out.println("How many dice and how many sides are on the dice you want to roll? (Put in XdY format)");
            String str = input.next();
            String[] arrofString = str.split("d", 2);
            int numDie = parseInt(arrofString[0]);
            int numSides = parseInt(arrofString[1]);
            int total = 0;
            int[] dice = new int[numDie];

            for (int i = 0; i < numDie; i++) {
                Random rand = new Random();
                dice[i] = rand.nextInt(numSides) + 1;
            }
            String msg = "";
            for (int die : dice) {
                msg += "You rolled a " + die + " on a " + numSides + " sided dice\n";
                System.out.println(msg);
                total += die;
            }
            System.out.println("Your total is " + total);

            Scanner response = new Scanner(System.in);
            System.out.println("Do you want to input another combination? Type yes or no.");
            ans = response.next();
        }
    }
}