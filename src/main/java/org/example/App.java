package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //  Asks user for a noun, verb, adjective, and adverb to output a sentence
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb +"? That's hilarious!");
    }
}
