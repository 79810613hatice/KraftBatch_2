package day_42_OOP_Review;

public class StaticÇalışma {
    public static int x=5;      // static bir değişken
    public int y=10;


    public void normalMethod(){
        System.out.println(x*10);
        System.out.println(y);
    }
    public static void staticMethod(){      // static bir method
        System.out.println(x);

    }
}
