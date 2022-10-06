package Day_31_Constructor;

public class Okul {

   // Okul adında bir sınıf oluşturun fields: renk; kapasite; sınıfAdedi;
   // methods: kapasite>500 kapasite aşılmıştır.
   // ikazı versin min 3 adet constructors yazınız.
    public String renk;
    public int kapasite;
    public int sinifAdedi;


    public Okul(){
        System.out.println("parametresiz constructor çalışıyor");
    }
    public Okul(String renk){
        System.out.println("1 parametreli cunstructor çalışıyor");
        this.renk=renk;
    }
    public Okul(String renk, int kapasite){
        this(renk);
        System.out.println("2 parametreli constructor çalışıyor");
        this.kapasite=kapasite;

    }
    public Okul(String renk, int kapasite, int sinifAdedi){;
        this.renk=renk;
        this.kapasite=kapasite;
        this.sinifAdedi=sinifAdedi;
    }
    public void kontrolKapasite(){
        if(this.kapasite>500){
 //           System.out.println("kapasite aşılmıştır.");
        }else{
  //          System.out.println("kapasite aşılmassına "+(500-this.kapasite) + " kişi kalmıştır");
        }

    }








}
