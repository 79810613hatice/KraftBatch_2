package Day_17_Class_And_Object;

public class Main {
    public static void main(String[] args){

      /*  Person ogrenci_1=new Person();
        ogrenci_1.isim="Harun";
        ogrenci_1.cinsiyet="Erkek";
        ogrenci_1.yas=18;

        Person ogrenci_2=new Person();
        ogrenci_2.isim="Ayşe";
        ogrenci_2.cinsiyet="Bayan";
        ogrenci_2.yas=16;
        System.out.println(ogrenci_1.isim +" ile " + ogrenci_2.isim +" arkadaştır ");
        System.out.println(ogrenci_2.isim +" yasi " + ogrenci_2.yas);


    Dog dog_1=new Dog();
    dog_1.isim="Karabas";
    dog_1.cins="Sivas kangalı";
    dog_1.renk="Siyah beyaz";
    System.out.println(dog_1.isim+" adlı köpeğin rengi "+dog_1.renk);
    dog_1.uyu();
    dog_1.yemek();
    dog_1.havla();
    System.out.println(dog_1.renk);


        Car tesla_1=new Car();
        tesla_1.hiz=360;
        tesla_1.renk="sari";
        tesla_1.marka="Tesla";
        tesla_1.model="Model 3";
        tesla_1.calistir();
        tesla_1.hizlan();
        tesla_1.dur();
        System.out.println("tesla_1 model: " + tesla_1.model);



       Daire daire_1=new Daire();
        daire_1.yariCap=4;
        System.out.println("daire_1.alanHesapla() = " + daire_1.alanHesapla());
        Daire daire_2=new Daire();
        daire_2.yariCap=7;
        System.out.println("daire_2.cevreHesapla() = " + daire_2.cevreHesapla());


        System.out.println("Math2.pow(2,3) = " + Math2.pow(2, 3)); */





        Banka person_1=new Banka();
        person_1.hesaapAc();
        person_1.mobilBankacilikOnay();
        person_1.paraYatir(50);
        person_1.paraYatir(50);
        person_1.hesapOzeti();
        person_1.paraYatir(100);
        person_1.hesapOzeti();

        Banka person_2=new Banka();
        person_2.hesaapAc();
        person_2.mobilBankacilikOnay();
        person_2.paraYatir(188);
        person_2.hesapOzeti();
    }

}
