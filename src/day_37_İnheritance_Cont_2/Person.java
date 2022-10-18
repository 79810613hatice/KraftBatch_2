package day_37_İnheritance_Cont_2;

import java.util.Random;

public class Person {

    String name;
    String  surName;
    int id;
    double salary;

    public void creatId(){
        Random random=new Random();
        this.id= random.nextInt();

    }

}
