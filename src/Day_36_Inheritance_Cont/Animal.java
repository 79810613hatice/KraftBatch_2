package Day_36_Inheritance_Cont;

public class Animal {

    int ayaksayisi;
    public void talk(){

        System.out.println("animal is talking");
    }
    public int speed(){
        return 50;
    }
    public void ses(){

    }

    int ayakSayisi;
    String color;

    public Animal(int ayakSayisi,String color){
        this.ayakSayisi=ayakSayisi;
        this.color=color;
    }




}
