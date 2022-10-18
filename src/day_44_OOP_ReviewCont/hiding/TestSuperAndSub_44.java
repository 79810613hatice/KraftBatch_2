package day_44_OOP_ReviewCont.hiding;

public class TestSuperAndSub_44 {
    public static void main(String[] args) {

        Sub_44 sub44 = new Sub_44();
        System.out.println("before increment " +sub44.i);
        sub44.increment();
        System.out.println("after increment "+sub44.i);
        System.out.println("--------------------");
        Super_44 spr = new Super_44();
        System.out.println("before increment " +spr.i);
        spr.increment();
        System.out.println("after increment " +spr.i);

    }
}
