package day_39_Abstraction;

public class Cat_39 extends Animal_39 {         // concrete

    public Cat_39(String name){
        super(name);
    }


    public void eat(){
        System.out.println("kediler çok şeyi yer");
    }

    public void move(){
        System.out.println("kediler iyi koşucudurlar");

    }

}
