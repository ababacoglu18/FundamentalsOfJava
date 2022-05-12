package com.car2;

public class style {




    private String colorPrivate;
    private String engineTypePrivate;       //******************************************************************************************************\\
    private int    numberOfDoorsPrivate;  //Üzerine sağ tıklayıp Refactor>Encapsulate Fields yaparsan otomatik olarak aşağıya kapsül metodlarını kendi yazar.
    private String modelPrivate = "520i";


    public void setModel1(String modelPrivate){

        this.modelPrivate = modelPrivate;  //modelPrivate isimleri her ikisinde de aynı olduğu için .this kullanıp bu objenin olduğunu belirtmek zorundayız.

    }                                       //Setter & Getter Methods.
    public String getModelPrivate(){

        return this.modelPrivate;       //Private alanlara metodlar sayesinde erişebiliyoruz.
    }                                     //Encapsulation.

    public int getNumberOfDoorsPrivate() {          //Artık carFunction içinde private'ler çağırılabilir.
        return numberOfDoorsPrivate;
    }

    public void setNumberOfDoorsPrivate(int numberOfDoorsPrivate) {
        this.numberOfDoorsPrivate = numberOfDoorsPrivate;

        if (numberOfDoorsPrivate <0 ){

            System.out.println("Number of doors cannot be less than 0. Please Change it. ");                //UWAGA!!!
        }else {                                                                                                //This method and if block prevent us from a mistake.

            this.numberOfDoorsPrivate = numberOfDoorsPrivate;
        }
    }



}
