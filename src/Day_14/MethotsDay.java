package Day_14;

import java.util.Scanner;

public class MethotsDay {
    public static void main(String[] args){

   // message3();
   // message3();
    //    message();

   // aritmetik();

    //    bigOfTwo();
    //    kiloToOkka();
     //   message4(5);



    }
    public static void message(){
    message2();
    }
    public static void message2(){
    message3();
    }
    public static void message3(){
        System.out.println("message 3 den hello world");
    }


    public static void aritmetik(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ortalama için 3 sayı girin");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        System.out.println("girmiş olduğunuz sayıların ortalaması " + (sayi3+sayi2+sayi1)/3 + " dir ");
    }

    public static void bigOfTwo() {
        Scanner scan=new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
       // int sonuc=sayi1>sayi2 ? sayi1 : sayi2 ;
        System.out.println(sayi1>sayi2 ? sayi1 :sayi2);

    }

    public static void kiloToOkka(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kilogram girin");
        double kilogram=scan.nextInt();
        System.out.println(kilogram/1.282);
    }

    public static void message4(int num){
        System.out.println(num + " burada");
        System.out.println(num + 3);
    }









}

