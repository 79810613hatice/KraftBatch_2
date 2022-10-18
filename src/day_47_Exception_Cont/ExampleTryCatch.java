package day_47_Exception_Cont;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {
/*
        //  integer değişken kabul eden bir metot yazın, kullanıcından tek bir giriş sağlayın kullanıcı
        //  integer dışında bir değer girerse "Lütfen tekrar deneyin" hata mesajı verin, kullanıcı doğru
        //  girişi yapana  kadar kullanıcıdan veri almaya devam edin

//        boolean devam=true;
//    while(devam){
//
//        try{
//            Scanner scan=new Scanner(System.in);
//            System.out.print("sayı : ");
//        int x=scan.nextInt();
//        }catch (Exception e){
//            System.out.println("lütfen tekrar deneyiniz");
//            continue;
//        }
//        System.out.println("programdan çıkış yapılıyor");
//        devam = false;
//   }

        // 2 int sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın 2 adet catch bloğu kullanın
        // sonunda finally bloğunu kullanın

        //       int x=45;
        //       int y=5;  // y nin 0 olabileceğini değerlendirin.
        boolean devam = true;

        while (devam) {
            Scanner scan = new Scanner(System.in);

            try {
                System.out.print("Sayi : ");
                int x = scan.nextInt();
                System.out.print("Bölüm : ");
                int y = scan.nextInt();
                System.out.println("sonuç : " + (x / y));
            } catch (ArithmeticException a) {
                System.out.println("aritmetik bir hata mevcut tekrar deneyiniz");
                continue;
            } catch (Exception e) {
                System.out.println("hata alındı tekrar deneyiniz");
                continue;
            }finally {
                System.out.println("(finally block uyarıyor) Daha dikkatli olun ");
            }
            devam = false;
//            int arr[]={111,125,36};
//            System.out.println(checkArrayId(arr));
        }


//  personel idlerini tutan bir array tanımlayın ve içerisine 5 adet integer türünde id gönderin (arr[]={}) bu idlerin
//  içerisinde 0 var ise IllegalArgumentException hata döndürün bunu bir checkArrayId metodunun içerisinde yapın.
//  true veya false döndürebilirsiniz ya da 0 veya 1 döndürebilirsiniz.

        int arr[]={111,125,126,0,36};
        try{
            System.out.println(checkArrayId(arr));
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("uygun olmayan personel ID tespit edildi");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("bilinmeyen bir hata tespit edildi");
        }
        System.out.println("programa devam ediliyor");

    }
    public static boolean checkArrayId(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                throw new IllegalArgumentException("Personel ID sıfır olamaz");
            }
        }
        return true;
 */


        // array içerisinde en büyük sayının index numarasını getiren methodu yazınız,
       // eğer en büyük sayıdan 2 ya da daha fazla var ise new exception throw edin.


    } // [1,2,5,3,5,6]     [1,2,3,5,5,6]
    public static int maxNumberIndex(int[] array) throws Exception{
        int[] arr=array;
        int indexNumber=0;

         Arrays.sort(arr);
         int x=arr[arr.length-1];
         if(arr[arr.length-2]==x){
             throw new Exception("en büyük sayıdan 2 adet vardır");
         }
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==x){
                indexNumber=i;
            }
        }
        return indexNumber;
    }


    public static int maxNumber(int[] arr){

        Arrays.sort(arr);
        int min=arr[0];
//        int max=[arr.length-1];



        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}




