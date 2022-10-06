package day_45_OOP_Review.hidingCont.abstruction;

public class Mod1 extends D3Print{

    public Mod1(String model, String fileFormat) {
        super(model, fileFormat);
        extrude();
        System.out.println(fileFormatChack());
        if(fileFormat.equals("OBJ")){
            polish();
        }else{
            fileFormatChack();
        }
        System.out.println(counter());
    }

    @Override
    public void extrude() {
        System.out.println("printing a "+model+ " with "+fileFormat);
        System.out.println("30 cm filament kullanıldı");
    }

    @Override
    public void polish() {
        System.out.println(model+" is polishing");
    }
}
