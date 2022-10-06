package day_45_OOP_Review.hidingCont.Interface;

public interface A {
 // public static final int i;   // instance varible olmaz
    public static final int i=10;
                        int j=20;
    public abstract void M1();
    public abstract void M2();
    public abstract void M3();
    public abstract void M4();


    default void M5(){} // java 8
    static void M6(){}  // java 9

 //   private void M7(){}




}
