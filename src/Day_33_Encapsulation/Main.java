package Day_33_Encapsulation;

public class Main {
    public static void main(String[] args) {


        Dog karabas=new Dog();
        Dog dog=new Dog();

        karabas.setName("Karabaş");
        System.out.println(karabas.getName());
        karabas.setName("Boncuk");
        System.out.println(karabas.getName());
        dog.setName("Minnoş");
        System.out.println(dog.getName());

        System.out.println(dog.getName());
        System.out.println(dog.isBlack);
        dog.isBlack=true;
        System.out.println(dog.isBlack);


        dog.setBreed("Sivas");
        System.out.println(dog.getBreed());

        System.out.println(dog.getAge());
        dog.setAge(15);
        System.out.println(dog.getAge());

        dog.setSpeed(100);
        System.out.println(dog.getSpeed());


        Circle circle_1=new Circle(5);
        System.out.println( Math.PI * Math.pow(circle_1.getRadius(), 2) );
        System.out.println(circle_1.getRadius());
        System.out.println(circle_1.circleArea());

        Dog.foot=5;
        System.out.println(Dog.foot);

        Dog kangal=new Dog();
        System.out.println(kangal.foot);
        kangal.foot=10;
        Dog karabas_1=new Dog();
        System.out.println(karabas_1.foot);
        System.out.println(Dog.foot);




        KraftBankCustomer enes=new KraftBankCustomer(1254,"Enes Yılmaz", false);
        System.out.println(enes.getCustomerToken());
        enes.setCustomerFullName("1254En12", "Enes Şen");
        System.out.println(enes.getCustomerFullName());
        enes.addMoney(500);
        enes.setisSms(true);


    }
}
