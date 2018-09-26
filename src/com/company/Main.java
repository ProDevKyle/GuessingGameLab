package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*
            Objective 1
         */
        /*String history = "";
        int num = (int) (Math.random() * 10 + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10!");
        int guess = input.nextInt();
        while (guess != num)
        {
            history = history + guess + ", ";
            System.out.println("Guess again!");
            guess = input.nextInt();
        }
        System.out.println("You guessed the correct number!");
        System.out.println("Guess History: " + history);*/

        /*
            Objective 2
         */
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println("Choose the range you want to play with.");
        System.out.println("Enter 1 for 1-10, 2 for 1-100, 3 for 1-1000, 4 for 1-10000.");
        int user = input.nextInt();
        if (user == 1)
            choice = 10;
        if (user == 2 )
            choice = 100;
        if (user == 3)
            choice = 1000;
        if (user == 4)
            choice = 10000;
        int start = 1;
        int end = choice;
        String history = "";
        System.out.println("Choose a number from 1 to " + end + " and I will guess it!");
        int num = (start+end)/2;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Is your number: " + num);
        String response = input1.nextLine();
        while (response.equals("higher") || response.equals("lower"))
        {
            history = history + num + ", ";
            if (response.equals("higher"))
            {
                start = num+1;
                num = (start+end)/2;
                System.out.println("Is your number: " + num);
                response = input1.nextLine();
            }
            else
            {
                end = num-1;
                num = (start+end)/2;
                System.out.println("Is your number: " + num);
                response = input1.nextLine();
            }
        }
        System.out.println("Yes, I finally guessed your number, " + num);
        System.out.println("Guess History: " + history);
    }
}
