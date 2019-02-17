package com.chemwater.week1test;

public class Snake extends Animals {

    public Snake() {
        NUM_OF_SNAKES = NUM_OF_SNAKES + 1 ;
        energy = 60 ;
    }

    public static int NUM_OF_SNAKES = 0 ;



    @Override
    public void setFoodEaten() {
        meat = meat - 1 ;
        fish = fish - 1 ;
        bugs = bugs - 1 ;
        grain = grain - 1 ;
    }

    @Override
    public void setSoundChanged() {
        energy = energy -3 ;
        String ss = "SSssSs" ;
        System.out.println(ss) ;
    }


}

