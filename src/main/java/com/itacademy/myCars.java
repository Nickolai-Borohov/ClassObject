package com.itacademy;

public enum myCars {

    MY_First_Garage ("BMW",200),
    My_Second_Garage ("Volkswagen", 301) ;

    private String carmodel;
    private int maxCarSpeed;


     myCars (String carmodel, int maxCarSpeed)
    {
        this.carmodel=carmodel;
        this.maxCarSpeed=maxCarSpeed;
    }

    public String getCarmodel () {return carmodel;}
    public  int getMaxCarSpeed () {return maxCarSpeed;}
}
