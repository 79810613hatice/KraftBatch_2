package day_38_finalAndHiding;

public class Parent {
    protected int num=100;

    public void run(){        // final yapsak hata verir çünkü metotlar final ile tanımlanırsa overridden yapılamıyor
        System.out.println("Parent runs");
    }

}
