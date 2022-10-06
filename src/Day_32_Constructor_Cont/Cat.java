package Day_32_Constructor_Cont;

public class Cat {

    //   Cat adında bir class oluşturun, eyeColor, breed, isFat, isPet adında fields tanımlayın,
    //   constructors (5 adet), sleep, food, run metodları oluşturarak main metodunda bu class dan
    //   bir obje oluşturun.

    public String eyeColor;
    public String bread;
    public boolean isFat;
    public boolean isPet;


    public Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }


    public Cat(String eyeColor, String bread, boolean isFat, boolean isPet) {
        this.eyeColor=eyeColor;
        this.bread = bread;
        this.isFat = isFat;
        this.isPet = isPet;
    }
    public void sleep(){
        System.out.println("uyuyorum");
    }
    public String food(){
        return "yemek yiyorum";
    }
    public String run(){
        return "koşuyorum";
    }


}
