package day_40_İnterface;

public interface Geometric_40 {
    int exponential = 2;
    double PI = 3.14;
    double getArea(double expo);

    default double getPrimeter(double...sides){
        double primeter=0;
        for(double side : sides){
            primeter+=side;
        }
        return primeter;
    }
//    static double getExponential(double d){
//        return exponential+d;
//    }
}
class Square implements Geometric_40{
    double a;

    public Square(double a) {
        this.a = a;
        System.out.println("Area : " +getArea(Geometric_40.exponential));
        System.out.println("Primeter : " +getPrimeter(this.a, this.a, this.a, this.a));
    }

    @Override
    public double getArea(double expo) {
        return Math.pow(a,expo);
    }
}
class run{
    public static void main(String[] args) {
        Square square1 = new Square(2);
        Circle_40 circle1 = new Circle_40(3);
        System.out.println("Circle area : "+circle1.getArea(Geometric_40.exponential));
        System.out.println("Area of square : " + square1.getArea(Geometric_40.exponential));
        double primeter = square1.getPrimeter(2,2,2,2);
        System.out.println("primeter of square = " + primeter);



    }
}












