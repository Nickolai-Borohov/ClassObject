package com.itacademy;

public class Car{

    private String model;
    public int maxsped;
    public Car (String model, int maxsped)
    {
        this.model=model;
        this.maxsped=maxsped;
    }
    public String getModel() {
        return model;
    }
    @Override
    public String toString ()
    {
        return model + "," + maxsped;
    }

    @Override
    public int hashCode ()
    {
        return this.model.hashCode() + maxsped*15;
    }
    @Override
    public boolean equals (Object object)
    {
        Car carResult = (Car) object;
        if (this.model==carResult.model && this.maxsped== carResult.maxsped)
        {
            return true;
        }
        else
            return false;
    }

}
