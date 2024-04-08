package com.itacademy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car ("Ferrari",380);
        Car car2 = new Car ("Ferrari", 380);
        System.out.println(car.toString()); // .toString() можно не писать
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car.equals(car2));
         myGarage();
        myGarageInfo();
    }

    static int Mycars = 2;
    static void myGarage ()
    {
        System.out.println("number of my cars- "+ Mycars);
    }

    public static void myGarageInfo ()
    {
        for (myCars tachki: myCars.values())
        {
            System.out.println("Car model- "+ tachki.getCarmodel());
            System.out.println("Car Max Speed- " + tachki.getMaxCarSpeed());
        }
    }

}
