package day_34.staticVariable;

public class Counter {

   static int counter;

    public Counter(){
        counter++;
        System.out.println(counter);
    }
}
class main{
    public static void main(String[] args) {
        Counter ct1 = new Counter();
        Counter ct2 = new Counter();
        Counter ct3 = new Counter();
        Counter ct4 = new Counter();
        Counter ct5 = new Counter();
        Counter ct6 = new Counter();
        Counter ct7 = new Counter();
        Counter ct8 = new Counter();
    }
}