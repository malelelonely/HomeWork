package com.company;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//
        System.out.println("Enter your name : ");
        String text = scanner.nextLine();

        System.out.println("The length of your name is  : "+text.length());
        System.out.println("Upper Case - "+text.toUpperCase(Locale.ROOT));
        System.out.println("Lower Case - "+text.toLowerCase(Locale.ROOT));


        }
    }

