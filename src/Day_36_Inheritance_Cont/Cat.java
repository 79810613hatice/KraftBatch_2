package Day_36_Inheritance_Cont;

public class Cat extends Animal {

    public void talk() {
        System.out.println(super.ayaksayisi);
        super.speed();
        System.out.println("miyav miyav");
    }

    public int speed() {
        return 20;
    }

    public void catMetod() {
        super.ayaksayisi = 5;
    }
    public void ses() {
    }
  boolean isNankor;

  public Cat(int ayakSayisi, String color, boolean isNankor){
  super(ayakSayisi,color);
  this.isNankor=isNankor;
  }



}