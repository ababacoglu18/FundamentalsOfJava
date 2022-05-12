package com.car2;

public class carFunction {


    public static void main(String[] args){

        style car1 = new style();




                //After Encapsulation

        car1.setModel1("T20");

        System.out.println("After Encapsulation Car Model: " + car1.getModelPrivate());


        //******************************************************\\


        car1.setNumberOfDoorsPrivate(-5);               //If Else Block Directly Working.



    }
}
