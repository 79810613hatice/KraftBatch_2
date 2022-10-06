package Day_32_Constructor_Cont;

public class Square {
    public int sideLenght;

    // Square adında bir class oluşturun, sideLenght adında field tanımlayın, constructors,
    // calculateArea ve calculatePerimeter metodları oluşturarak main metodunda bu class dan bir obje oluşturun.

    public Square(){

    }
    public Square(int sideLenght){
        this.sideLenght=sideLenght;
    }
    public int calaualteArea(){     //alan hesaplama
        return (int) Math.pow(this.sideLenght,2);
    }
    public double calculateArea(int sideLenght){        // alan hesaplama
        return Math.pow(sideLenght,2);
    }
    public int calculatePerimeter(){        // çevre hesaplama
        return 4*this.sideLenght;
    }
    public double calculatePerimeter(int sideLenght){       // çevre hesaplama
        return 4*sideLenght;
    }




}
