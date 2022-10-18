package Day_33_Encapsulation;

public class Dog {
    private String name;
    public String breed;
    public boolean isBlack;
    private int age=10;
    private int speed;
    public static int foot=2;

    public Dog() {
    }
 //   public String getName(){
 //       return this.name;
 //   }
    public void setName(String name){
        this.name=name;
    }

    public Dog(String name){
        this.name = name;
    }


    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getSpeed(){
        return this.speed*1.6;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

}
