package Day_31_Constructor;

public class Constructor_Main {
    public static void main(String[] args) {

        Flower flower_1= new Flower();
        Flower flower_2= new Flower("kırmızı");
        Flower flower_3= new Flower("sari",56);
        Flower flower_4= new Flower("beyaz",44,true);


//        System.out.print(flower_1.renk);
//        System.out.print(" "+flower_1.boy);
//        System.out.println(" "+flower_1.diken);
//
//        System.out.print(flower_2.renk);
//        System.out.print(" "+flower_2.boy);
//        System.out.println(" "+flower_2.diken);
//
//        System.out.print(flower_3.renk);
//        System.out.print(" "+flower_3.boy);
//        System.out.println(" "+flower_3.diken);
//
//        System.out.print(flower_4.renk);
//        System.out.print(" "+flower_4.boy);
//        System.out.print(" "+flower_4.diken);



        Flower flower=new Flower("sarı",77,true);
       // System.out.println(flower.renk);

        flower.renk="kırmızı";
       // System.out.println(flower.renk);


        Okul yavuzSultanSelimİlkOkulu= new Okul();
        Okul kanuniOrtaOkulu = new Okul("Pembe",550,50);
        Okul keskinIlkOkulu = new Okul("Beyaz",450,45);

        System.out.println(kanuniOrtaOkulu.kapasite);
        kanuniOrtaOkulu.kontrolKapasite();
        System.out.println(keskinIlkOkulu.kapasite);
        keskinIlkOkulu.kontrolKapasite();
        System.out.println(kanuniOrtaOkulu.renk);


    }
}
