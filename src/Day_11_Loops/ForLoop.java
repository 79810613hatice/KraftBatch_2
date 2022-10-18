package Day_11_Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

//        System.out.println("giriş");
//
//        for(int i=0; i<10; i++){
//
//            System.out.println(i+"-Harun");
//        }
//
//        System.out.println("çıkış");
//
//        System.out.println("merhaba dünya");


//        TASK
//        1- ekrana 20 adet alt alta «merhaba dünya» yazdırın.

//        for (int i = 0; i <20 ; i++) {
//            System.out.println(i+"-merhaba dünya");
//        }
//
////        2- 0 dan 100 e kadar olan sayıları ekrana yazdırın.
//        for (int i = 0; i < 100; i++) {
//            System.out.print(i+" ");
//        }
//
////        3- 15 den 100 e kadar olan sayıları ekrana yazdırın.
//        for (int i = 15; i < 100; i++) {
//            System.out.print(i+" ");
//        }
//
////        4- 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99 98 97 vs)
//        for (int i = 100; i >=0 ; i--) {
//            System.out.print(i);
//        }

//        5-  0 dan 100 e kadar olan çift sayıları ekrana yazdırın.
//        for (int i = 0; i <= 100 ; i+=2) {   veya
//                                   i++    if(i%2==0) şeklinde  veya (ifi%2!=1) şeklinde de yapabiliriz
//            System.out.print(i+" ");
//        }

//        6- 0 dan 100 e kadar olan tek sayıları ekrana yazdırın.
/*        for (int i = 0; i <=100 ; i++) {
            if(i%2==1) {
                System.out.print(i+" ");
            }

        }

//        7-  10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları ekrana yazdırın.
        for (int i = 10; i <= 1000; i+=10) {
            System.out.print(i+" ");
        }

//        8- 6 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)
//        int sonuc = 1;
//        for (int i = 6; i > 0 ; i--) {
//            sonuc*=i;
//        }
//        System.out.println("6! = " + sonuc);

//       9-  Örnek: 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana yazdırın.
//        0 0
//        1 1
//        2 8
//        3 27
//        4 vs
            for (int i = 0; i <= 20 ; i++) {
//            int sonuc=1;
//            sonuc=i*i*i;
//            System.out.println(i+ " nin küpü: " +sonuc);
//            veya
            double sonuc=1;
            sonuc=Math.pow(i,3);
            System.out.println(i+ " nin küpü: " +sonuc);  // şeklinde de yapabiliriz

        }

//      10- 23 derece ile 50 derece arasında olan tüm Fahrenheit değerlerini ekrana yazdırın. (C=(F-32) / 1.8)
        for (int i = 24; i < 50; i++) {
            double fahrenheit = (i*1.8)+32;  //(c=(f-32) / 1.8)   c*1.8+32=f
            System.out.println(i+" C= "+fahrenheit+ " F dır");
        }  // veya
        for(int i=24; i<50; i++){
            int fahrenheit=(int)(i*1.8)+32;
            System.out.println(i+" c= "+fahrenheit+" F dır");  // int olarak da yapabiliriz
        }

//      11-  Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini sorun . Kullanıcıdan aldığınız
//         kelimeyi kullanıcının istediği kadar ekrana yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir kelime yazınız ");
        String kelime=scan.nextLine();
        System.out.print("kaç defa ekrana yazdırmak istiyorsunuz ");
        int tekrarSayisi=scan.nextInt();

        for(int i=0; i<tekrarSayisi; i++){
            System.out.println(kelime);
        }

//       12- Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın girdiği sayı dahil . 0 dan başlayarak
//       kullanıcının girdiği sayıya kadar olan tamsayıların toplamını ekrana yazdıran programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("0 ile 1000 arasında bir sayı giriniz ");
       int sayi=scan.nextInt();
       int sonuc=0;
         for (int i=0; i<sayi; i++){
           sonuc+=i;  //sonuc=sonuc+i
         }
        System.out.println(sayi+ " kadar olan sayı toplamı: " + sonuc);
*/

//      13- Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın girdiği sayı dahil.0 dan başlayarak
//       kullanıcının girdiği sayıya kadar tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 0 ile 1000 arasında bir sayı giriniz");
        int sayi=scan.nextInt();
        int tekSayi=0;
        int ciftSayi=0;
        for(int i=0; i<=sayi; i++){
            if(i%2==0){
                ciftSayi+=i;
                }
                else{
                    tekSayi+=i;
                }
            }
            System.out.println("tek sayılar toplamı : " +tekSayi);
            System.out.println("çift sayılar toplamı : " +ciftSayi);
        }

//      14- Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu yazdıran programı yazdırınız. (2 üzeri 4 =16)

 //       Scanner scan=new Scanner(System.in);
 /*       System.out.print("taban giriniz: ");
        int taban=scan.nextInt();
        System.out.println("üs giriniz: ");
        int us=scan.nextInt();

        int sonuc=1;
        for(int i=0; i<us; i++){
            sonuc*=taban;
        }

        System.out.println(sonuc);


        ödev_1_

       for(char c='a'; c<='z'; c++ ){
           System.out.print(c+ " ");
        }

        //ödev_
        int sonuc;
        for (int i=1; i<=10; i++){
                System.out.println("9*"+i+" = " + (i*9) );

        }

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üç defa sifre girin");
*/





    }

