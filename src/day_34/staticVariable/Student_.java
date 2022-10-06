package day_34.staticVariable;

public class Student_ {

    int number;
    String name;

    String schoolName = "KRAFT";
  //  static int counter;


    public Student_(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getInfo(){
        return "Student_{" +
                "number=" + number +
                ", name= ' " +'\'' +
                ", schoolName='" + schoolName +'\'' +
                '}';

    }


}
