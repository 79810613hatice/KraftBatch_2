package day_40_İnterface;

public class Circle_40 extends Square implements Geometric_40{
    public Circle_40(double a) {
        super(a);
    }

    @Override
    public double getArea(double expo) {
        return Math.PI*Math.pow(a,expo);
    }
}
