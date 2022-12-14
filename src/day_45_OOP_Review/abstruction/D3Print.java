package day_45_OOP_Review.abstruction;

public abstract class D3Print {

    String model;
    String fileFormat;
    static int counterModel;


    public D3Print(String model, String fileFormat) {
        this.model = model;
        this.fileFormat = fileFormat;
    }

    public abstract void extrude();
    public abstract void polish();
    public static int counter(){
        counterModel++;
        return counterModel;
    }

    public String fileFormatChack(){
        if(fileFormat.equals("OBJ")){
            return "file format is suitable for polishing";
        }else{
            return "file format is not suitable for polishing";
        }
    }

}
