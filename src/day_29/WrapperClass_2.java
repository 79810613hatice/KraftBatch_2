package day_29;

public class WrapperClass_2 {
    public static void main(String[] args) {
//          typeValue
        Integer I = 10;
        int i = I.intValue();
        System.out.println("i = " + i);

        Byte B = 100;
        byte b = B.byteValue();
        System.out.println("b = " +b);

        Boolean Bl = true;
        boolean bl = Bl.booleanValue();
        System.out.println("bl = " + bl);

        System.out.println("Integer.MAX_VALUE = "+ Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Integer.sum810,20) = " + Integer.sum(10,20));



    }
}
