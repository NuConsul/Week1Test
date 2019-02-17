package com.chemwater.week1test;

public class Monkey extends Animals implements behaviour {

    public Monkey() {
        NUM_OF_MONKEYS = NUM_OF_MONKEYS + 1 ;
        energy = 40 ;
    }

    public static int NUM_OF_MONKEYS = 0  ;


    @Override
    public void setFoodEaten() {
        energy = energy + 2 ;
        meat = meat - 1 ;
        fish = fish - 1 ;
        bugs = bugs - 1 ;
        grain = grain - 1 ;
    }



    @Override
    public void setSoundChanged() {
        energy = energy -4 ;
        String oo = "OOOooOOooOo" ;
        System.out.println(oo) ;
    }


    public void play() {

        if((energy - 8) < 0) {
            String monkeyTired = "Monkey Is Too Tired" ;
            System.out.println(monkeyTired);
        } else {
            String monkeySound = "Oooo Oooo Oooo";
            System.out.println(monkeySound) ;
            energy = energy - 8;
        }


    }


}


