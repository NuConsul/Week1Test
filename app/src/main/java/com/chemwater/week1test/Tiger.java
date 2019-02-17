package com.chemwater.week1test;



public class Tiger extends Animals {

    public static int NUM_OF_TIGER = 0 ;

    public Tiger() {
        NUM_OF_TIGER = NUM_OF_TIGER + 1;
        energy = 50 ;
    }

    @Override
    public void setFoodEaten() {
        meat = meat - 1 ;
        fish = fish - 1 ;
        bugs = bugs - 1 ;
    }


    @Override
    public void setSoundChanged() {
        energy = energy -3 ;
        String roar = "Rooaahaa" ;
        System.out.println(roar) ;
    }



}

