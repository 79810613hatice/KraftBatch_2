package Day_9;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

      /* int hız=10;
        boolean isMoving=true;

        if(isMoving){
            hız++;


        }
        System.out.println("hız =" + hız);
        System.out.println("-----------------------------");


        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("lütfen sayıları giriniz");
        a=sc.nextInt();
        b=sc.nextInt();

        if((a-b)%2==0){
            System.out.println("bu bir çift sayıdır");

        }else{
            System.out.println("bu bir tek sayıdır");

        }

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number > 5) {
            System.out.println("sayi 5 den buyuktur");
            if (number > 25) {
                System.out.println("sayi 25 den buyuktur");
                if (number > 50) {
                    System.out.println("sayi 50 den buyuktur");

                } else {
                    System.out.println("sayi 50 den kücüktür");

                }
            } else {
                System.out.println("sayi 25 den ve 50 den küçüktür");
            }
        } else {
            System.out.println("sayi 5 den 25 den ve 50 den küçüktür");

        }

        Scanner scan=new Scanner(System.in);
        int a=40;
        int b=50;
        int c=80;
        System.out.println("lütfen açı ölçülerini giriniz");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        if(a+b+c==180){
            System.out.println("bu bir üçgendir çünkü açılar toplamı " +(a+b+c) + " olduğu için");
        }else{
            System.out.println("bu bir üçgen değildir");
        }

        int a=5;
        int b=6;
        int c=3;
        if((a>b) || (c>b) || (a>c) || (b>c)){
            System.out.println("en büyük sayıdir");

        }else{
            System.out.println("en küçük sayıdır");
        }
*/

        Scanner scan=new Scanner(System.in);
        int sayi=15;
        int tahmin;


        if(12<sayi){
            System.out.println("tahmininiz sayiya yakın");
            if(3<sayi){
                System.out.println("tahmininiz sayıdan çok küçük");
                if(18>sayi){
                    System.out.println("tahmininiz sayıdan büyük");
                    if(15==sayi){
                        System.out.println("tahmininiz sayıya eşit, tebrikler");
                    }
                }else{
                    System.out.println("tahmininiz sayıyı aştı");
                }
            }else{
                System.out.println("tahmininiz sayıdan çok uzaklaştı");
            }
        }else{
            System.out.println("tahmininiz sayıya uzak" );
        }

    }

}
