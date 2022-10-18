package day_39_Abstraction;

public abstract class Animal_39 {

    String name;

    public Animal_39(String name) {
        this.name=name;
    }

    public abstract void eat();
    public abstract void move();

}
class AnimalTest{
    public static void main(String[] args) {
 //       Animal_39 animal_39= new Animal_39("behlül"); Abstract class dan instantiace yapılamaz
    }
}