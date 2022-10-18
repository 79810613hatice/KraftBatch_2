package day_38_finalAndHiding;

public class Main_FinalAndHiding {

//    public void start(){
//        Parent parent = new Parent();
//        System.out.println(parent.num);


    public static void main(String[] args) {
        Parent harun=new Parent();
        System.out.println(harun.num);
        Child yiğit=new Child();
        System.out.println(yiğit.num);


//       Parent Harun=new Parent();
//       Harun.run();                 //metot overridding yaptık
//
//        Child Yiğit=new Child();
//        Yiğit.run();




/*
//   array lerde final
      final int ARRAY[]=new int[5];
        ARRAY[0]=5;
        ARRAY[1]=510;
        int[] array_2=new int[5];
//   ARRAY=array_2; hata verir, ARRAYin referansını değiştiremem ama ARRAY in içersini istediğimiz gibi değiştirebiliriz
//   ARRAY e final atanmasa idi hata vermez
        array_2=ARRAY; //   atama yı yapabiliriz array_2 final olmadğı içn referansını değiştirebiliyoruz */
    }
//    //  "local değişkenlerde final"
//    public int method_A(){
//        final int Y;   // Y e burda da atama yapabiliriz (Y=5)
//        Y=5;          // method içinde tanımladığımız değişkenler lokal değişkenlerdir.
//        return Y;
//    }



}
