package Day_41_Polymorphism;

public class Main_Polymorphism {
    public static void main(String[] args) {

     /*   Dog karabas=new Dog();
        karabas.voice();
        Animal akbas=new Dog();
        akbas.voice();
        akbas.sleep();


        SporCar ferrari=new SporCar();
        ferrari.start();
        ferrari.speed();
        ferrari.stop();
        Car audi=new SporCar();
        audi.start();
        audi.stop();

       IVehicle volvo=new SporCar();
       volvo.start();
       volvo.stop();
       volvo.durmaMesafesi();
        System.out.println(volvo.tekerSayisi());

        System.out.println(volvo.getClass());
        System.out.println(ferrari.getClass().getSimpleName());

        Kus limon=new Kanarya();
        Kus mavis=new Muhabbet();


        System.out.println(limon instanceof Kus);
        System.out.println(mavis instanceof Muhabbet);
        System.out.println(mavis instanceof Kanarya);

        if(limon instanceof Kus){
            System.out.println("limon kanaryanın örneği");
        }
        */

//        Animal animal=new Animal();
        Dog dog=new Dog();
        Animal animal=dog;
        System.out.println(animal.ayakSayisi);

//        Dog dog=(Dog) animal;
//        dog.sleep();

        Animal animal_1=new Dog();
        Dog dog2=(Dog) animal_1;
        System.out.println(dog2.ayakSayisi);
        dog2.sleep();
        dog2.eat();


    }
}
