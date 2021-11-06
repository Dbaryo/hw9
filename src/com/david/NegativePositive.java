package com.david;

import java.util.Scanner;

public class NegativePositive {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the length of the list: ");
        final int[] list = new int[SCANNER.nextInt()];
        int listMaxIndex = ( list.length - 1);
        int listMinIndex = 0;
        for (int i = 0 ; i < list.length ; i++) {
            System.out.println("please enter value number " + (i+1) + " :");
            int temp = SCANNER.nextInt();
            if ( temp < 0) {
                list[listMinIndex] = temp;
                listMinIndex++;
            } else {
                list[listMaxIndex] = temp;
                listMaxIndex--;
            }
        }
        System.out.println("The new list is: ");
        for (int i = 0; i < list.length ; i++) {
            System.out.print( list[i] + " " );
        }
    }

}
