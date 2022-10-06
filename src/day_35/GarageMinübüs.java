package day_35;

public class GarageMinübüs {
    public static void main(String[] args) {
        Minibus minibus = new Minibus();

        minibus.type= "Minübüs";
        minibus.color= "Mavi";
        minibus.seat= 14;
        minibus.sellPriceWithTaxt(50000);

        minibus.using();
        minibus.toString();
    }
}class GarageTruck{
    public static void main(String[] args) {
        Truck truck = new Truck();

        truck.carryingCapasity=16000;
        truck.type="Kamyon";
        truck.color="kırmızı";
        truck.sellPriceWithTaxt(120000);

        truck.carrying();
        truck.toString();
    }


}
