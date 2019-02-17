package com.chemwater.week1test;

import java.util.ArrayList;
import java.util.List ;

import java.util.ArrayList;
import java.util.List ;

public class Jungle {



    public static void soundOff() {

    }

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger() ;
        Tiger tiger2 = new Tiger() ;
        Tiger tiger3 = new Tiger() ;
        Tiger tiger4 = new Tiger() ;
        Monkey monkey1 = new Monkey() ;
        Monkey monkey2 = new Monkey() ;
        Monkey monkey3 = new Monkey() ;
        Monkey monkey4 = new Monkey() ;
        Snake snake1 = new Snake() ;
        Snake snake2 = new Snake() ;
        Snake snake3 = new Snake() ;
        Snake snake4 = new Snake() ;

        //monkey1.setSoundChanged() ;


        List<Animals> animals = new ArrayList<>() ;
        animals.add(tiger1) ;
        animals.add(tiger2) ;
        animals.add(tiger3) ;
        animals.add(tiger4) ;
        animals.add(monkey1) ;
        animals.add(monkey2) ;
        animals.add(monkey3) ;
        animals.add(monkey4) ;
        animals.add(snake1) ;
        animals.add(snake2) ;
        animals.add(snake3) ;
        animals.add(snake4) ;

        for(Animals ad : animals) {
            ad.setSoundChanged() ;
        }


    }


}

