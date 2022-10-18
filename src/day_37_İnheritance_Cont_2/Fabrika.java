package day_37_İnheritance_Cont_2;

public class Fabrika {

    String personelAdi;
    boolean isActive;
    private int num;

    public Fabrika(){
    }
    public Fabrika(String personelAdi){
        this.personelAdi =personelAdi;
    }
    public Fabrika(String personelAdi,boolean isActive){
        this.personelAdi =personelAdi;
        this.isActive=isActive;
    }
    public void setNum(int num){
        if(num<0){
            System.out.println("lütfen pozitif bir sayı girin");
        }
        else{
            this.num=num*10;
        }
    }
    public int getNum(){
        return num;
    }

    public void firstMetot(){
        System.out.println("first metot");
    }
//  protected static String personelAdi;


     public String defaultMetot(){
         return personelAdi;

     }
    public static void staticDefaultMetot(){
        System.out.println("metot çalıştı");
    }


}
