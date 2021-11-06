package com.david;

import java.util.Scanner;

public class ReversedString {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your line: ");
        String input = SCANNER.nextLine();
        String newString = "";
        for (int i = 1; i <= input.length() ; i++) {
            newString += input.charAt(input.length() - i);
        }
        System.out.println("The reversed string is: " + newString);
    }
}
