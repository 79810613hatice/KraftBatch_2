package day_39_Abstraction;

public class Bird_39 extends Animal_39 {

    public Bird_39 (String name){
        super((name));
    }

    public void eat(){
        System.out.println("kuşlar böcekleri yerler");
    }

    public void move(){
        System.out.println("kuşlar uçarlar");

    }
}
class parrot extends Bird_39{

    public parrot(String name) {
        super(name);
    }
}