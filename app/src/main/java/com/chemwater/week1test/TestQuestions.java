package com.chemwater.week1test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List ;

public class TestQuestions {

    class Question1 {

        public void findDuplicates(List<String> strings) {

            //List<String> ba = new ArrayList<>() ;
            String[] ba = new String[1] ;
            strings.toArray(ba) ;

            for(String ab : strings) {

                for (int i = 0 ; i < ba.length ; i++) {
                    if (ab == ba[i]) {
                        System.out.println("Duplicate Found") ;
                    }
                }


            }

        }
    }


    class Question2 {

        public boolean checkPalindrome(String word) {

            boolean pl = false ;

            String letter = word ;
            int blue = letter.length() ;
            for(int i = 0 ; i < blue ; i++) {
                String[] aa = new String[100] ;
                aa[0] = letter.valueOf(i) ;

                if(aa.equals(letter)) {
                    System.out.println("string are Palindromes") ;
                    pl = true ;
                }
            }


            return pl ;
        }

    }


    class Question3 {

        public void fizzBuzz(int count) {
            int stew = 21 ;
            int crew = 3 ;
            int few = 5 ;
            for(int i = 0 ; i < stew ; i++) {
                if((i / crew) == 0) {
                    System.out.println("fizz") ;
                }

                if((i / few) == 0) {
                    System.out.println("buzz") ;
                }

                if((i / crew) == 0 && (i / few) == 0) {
                    System.out.println("fizzbuzz") ;
                }
            }
        }
    }


    class Question4 {


        public boolean checkAnagrams(String word1, String word2) {
            boolean pl = false ;
            if(word1.contentEquals(word2)) {
                pl = true ;
            }
            return pl ;
        }
    }


    class Question5 {

        public void printTables() {

            int[][] plume = {
                    {1,2,3,4,5,6,7,8,9,10},
                    {2,4,6,8,10,12,14,16,18,20},
                    {3,6,9,12,15,18,21,24,27,30},
                    {4,8,12,16,20,24,28,32,36,40},
                    {5,10,15,20,25,30,35,40,45,50},
                    {6,12,18,24,30,36,42,48,54,60},
                    {7,14,21,28,35,42,49,56,63,70},
                    {8,16,24,32,40,48,56,64,72,80},
                    {9,18,27,36,45,54,63,72,81,90},
                    {10,20,30,40,50,60,70,80,90,100}
            };
            for(int a = 0 ; a < 11 ; a++) {
                for(int b = 0 ; b < 11 ; b++) {
                    System.out.println(plume[a][b]);
                }
            }
        }
    }


    class Question6 {

        public void compare() {
            String[] a = {
                    "a,b,c", "e,a,f", "h,c,k", "q,w,d"
            };
            if (a[0] == a[1] | a[0] == a[2] | a[0] == a[3]) {
                System.out.println("A duplicate has been found");
            }
            if (a[1] == a[0] | a[1] == a[2] | a[1] == a[3]) {
                System.out.println("A duplicate has been found");
            }
            if (a[2] == a[0] | a[2] == a[1] | a[2] == a[3]) {
                System.out.println("A duplicate has been found");
            }
            if (a[3] == a[0] | a[3] == a[1] | a[3] == a[2]) {
                System.out.println("A duplicate has been found");
            }

        }
    }

}
