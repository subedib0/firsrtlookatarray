package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random rnd = new Random();
        int randomInt;
        //Declear array to hold 10 test scores
        int scores[] = new int[10];

        //initialize elements of an array
        for (int i = 0; i < 10; i++) {
            randomInt = 1 + rnd.nextInt(100);//creates a random number between 1 and 100
            scores[i] = randomInt;
//            System.out.printf("Element # %d value is %d\n",i, scores[4]);

        }

        //print the eliments of an array
        for (int i = 0; i < 10; i++) {
            System.out.printf("Element # %d value is %d\n", i, scores[i]);

        }
        //print the fifth element
        for (int i = 0; i < 10; i++) {
            System.out.printf("The fifth value is:\n" + scores[4]);

        }
        //print every other element
        for (int i = 0; i < 10; i += 2) {
            System.out.printf("Element  %s is %d\n", i, scores[i]);
        }
        //print the number of elements
        System.out.println("The array length is " + scores.length);
        //change an element
        scores[0] = 100;
        System.out.println("the First Element now is 100");
        //this line will not generate the ArrayindexOutOfBondsException
        //we'll learn more about Exception (error)handling soon
        try {
            System.out.println(scores[10]);


        } catch (Exception e) {
            System.out.println("We cought the ArrayIndexOutOfBondsException error");

        }
        //this line will generate an arrayIndexOutOfBondsException
        //since we did not wrap in the try..catch for error handling
//        System.out.println(scores[10]);
    }
}