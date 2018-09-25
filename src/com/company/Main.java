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
       /*System.out.println("Choose a number from 1 to 100 and I will guess it!");
        String history = "";
        int num = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Is your number: " + num);
        String response = input.nextLine();
        while (response.equals("higher") || response.equals("lower"))
        {
            history = history + num + ", ";
            System.out.println("Guess History: " + history);
            if (response.equals("higher"))
            {
                num = (int) (Math.random() * 100 + num);
                System.out.println("Is your number: " + num);
                response = input.nextLine();
            }
            else
            {
                num = (int) (Math.random() * num + 1);
                System.out.println("Is your number: " + num);
                response = input.nextLine();
            }
        }
        System.out.println("Yes, I finally guessed your number " + num);*/
    }
}
