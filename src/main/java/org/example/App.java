/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println( "What is your current age?" );
        int age = uInput.nextInt();
        System.out.println( "At what age would you like to retire?" );
        int retire = uInput.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("You have "+(retire-age)+" years left until you can retire.\n" + "Its "+ year +", so you can retire in "+(year+(retire-age)) +"." );
    }
}
