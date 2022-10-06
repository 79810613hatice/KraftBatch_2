package day_34.staticClases;

public class Outer {
// outer nesnesi burda
    static class nested{
        public static void message1(){
            System.out.println("selam static class dan");
        }
    }
    class inner{
        // selam nesnesi burda
        public void message2(){
            System.out.println("selam inner class dan");
        }

    }
}
class main{
    public static void main(String[] args) {

        Outer.nested.message1();

        Outer outer = new Outer();
        Outer.inner selam = outer.new inner();

//        Outer.inner selam = new Outer().new inner();

         selam.message2();


    }
}