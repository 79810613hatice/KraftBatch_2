package day_35;

public class Minibus extends Vehicle {
//  Minibüs is a Vehicle
    int seat;

    public void using(){
        System.out.println(color+" "+type+" "+seat+" yolcu taşır");
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}