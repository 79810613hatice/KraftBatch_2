package day_45_OOP_Review.abstruction;

public class Mod2 extends D3Print{

    public Mod2(String model, String fileFormat) {
        super(model, fileFormat);
    }

    @Override
    public void extrude() {
        System.out.println("printing a "+model+" with "+fileFormat);
    }

    @Override
    public void polish() {
        System.out.println(model+" is polishing");
    }
}
