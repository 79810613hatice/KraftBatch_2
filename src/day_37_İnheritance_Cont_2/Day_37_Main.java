package day_37_İnheritance_Cont_2;

public class Day_37_Main {

    public static void main(String[] args) {
    Fabrika sekerFabrikası=new Fabrika("harun", false);
        System.out.println(sekerFabrikası.personelAdi);
        sekerFabrikası.setNum(5);
        System.out.println(sekerFabrikası.getNum());
        Fabrika unFabrikası=new Fabrika("mehmet", true);
        unFabrikası.setNum(40);
        System.out.println(unFabrikası.getNum());
            negative();

    }
    public int sum(int a, int b){
        negative();
        return a+b;
    }
    public static int negative(){
        return -1;
    }
    Depo depo_1=new Depo("harun");

    Tester enes=new Tester();
    Developer alparslan=new Developer();
    ProjectOwner salih=new ProjectOwner();

//  tüm sınıflara istediğiniz kadar constructor tanımlanacak
//  süper ve this keywordu kullanılacak
//  SoftweareDevelopment sınıfa 2 farklı metot yazılacak (Daily time, Sprint day)
//  tüm sınıfların getter/setter metotları olacak
//  bazı sınıflarda değişkenler için default/protected/private kullanılacak
//  2 adet sınıfta static metot kullanın( metotları size bırakıyorum)
//  metot overriding yapılacak
}
