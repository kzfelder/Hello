package com.example.practice;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // record user's name
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = sc.next();

	    // output welcome message
        System.out.println("Welcome " + name);
    }
}
