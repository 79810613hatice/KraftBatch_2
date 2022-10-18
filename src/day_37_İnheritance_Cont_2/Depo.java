package day_37_İnheritance_Cont_2;

public class Depo extends Fabrika {

    public static void main(String[] args) {
        Fabrika fabrika=new Fabrika();
        fabrika.personelAdi ="Harun";
        fabrika.defaultMetot();

    }
 //   static void staticDefaultMetot(){
 //       System.out.println("metot çalıştı");

    int kapasite;

    public Depo(){

    }
    public Depo (String personelAdi){
        super(personelAdi);
    }

}






