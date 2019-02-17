package com.chemwater.week1test;

import java.util.ArrayList;
import java.util.List ;
import java.util.Arrays ;

public class Animals {


    public  int meat = 400 ;
    public  int fish = 400 ;
    public  int bugs = 400 ;
    public  int grain = 400 ;

    public int energy ;



    public void makeSound() {
    }

    public void eatFood() {
    }

    public void sleep() {
    }

    public void setSoundChanged() {
        energy = energy - 3 ;

    }

    public void setFoodEaten() {
        energy = energy + 5 ;
    }


    public void setSleepMode() {
        energy = energy + 10 ;
    }






}
