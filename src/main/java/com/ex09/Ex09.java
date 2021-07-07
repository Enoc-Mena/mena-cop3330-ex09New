/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex09;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        double length, width;

        System.out.print("One gallon of paint covers 350 square feet.");
        System.out.println("");

        //Gets length
        Scanner lengthOne = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = lengthOne.nextDouble();

        //Gets width
        Scanner widthOne = new Scanner(System.in);
        System.out.print("Enter length: ");
        width = widthOne.nextDouble();

        double total = length * width;

        //Divide into 350 to get decimal that will be converted to nearest whole number
        double gallonsNeeded = total / 350;

        System.out.print("You will need " + Math.ceil(gallonsNeeded) + " gallons to cover " + total + " feet.");

    }

}
