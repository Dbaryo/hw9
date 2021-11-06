package com.david;

import java.util.Scanner;

public class StringInString {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your first line: ");
        String string1 = SCANNER.nextLine();
        System.out.println("Please enter your second line: ");
        String string2 = SCANNER.next();
        int j = 0;
        for (int i = 0; i < string1.length() && j < string2.length() ; i++) {
            if ( string1.charAt(i) == string2.charAt(j) ){
                j++;
                } else {
                j = 0;
                     }
            }
        if ( j == string2.length() ) {
            System.out.println("True");
        } else {
            System.out.println("FALSE");
        }
    }

}
