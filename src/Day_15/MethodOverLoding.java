package Day_15;

public class MethodOverLoding {
    public static void main(String[] args){

       // calculateArea(5,4);
       // calculateArea(3);
    }
    public static void calculateArea(int a, int b){
        System.out.println(a*b);
    }
    public static void calculateArea(int b){
        int r;
        double PI=3.14;
        r=b;
        System.out.println(PI*r*r);
    }
    public static void concat(int i, String str, boolean bl){

    }



}
