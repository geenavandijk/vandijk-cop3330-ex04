/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class MadLib {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = input.next ();

        System.out.println("Enter a verb: ");
        String verb = input.next ();

        System.out.println("Enter an adjective: ");
        String adj = input.next ();

        System.out.println("Enter an adverb: ");
        String adv = input.next ();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!%n", verb, adj, noun, adv);

    }//End of method

}//End of class
