/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

public class PaintCalculator {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is the length of the room in feet?" );
        int length = input.nextInt();

        System.out.print( "What is the width of the room in feet?" );
        int width = input.nextInt();

        int area = length * width;
        int gallonamount = area / 350;

        if (area % 350 == 0){
            System.out.printf( "You will need to purchase %d gallons of paint to cover %d square feet",  gallonamount, area );
        }
        else {
            System.out.printf( "You will need to purchase %d gallons of paint to cover %d square feet",  gallonamount + 1, area );
        }


    }
}