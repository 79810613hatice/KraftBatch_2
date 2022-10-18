package day_45_OOP_Review.hidingCont;

import day_45_OOP_Review.hidingCont.MyCar;

public class YourCar extends MyCar {
    public static boolean haveSunroof(){
        return true;
    }
    public void getYourCarSunroofStatus(){
        System.out.println("Your car have sunroof status: "+haveSunroof());
    }
}
