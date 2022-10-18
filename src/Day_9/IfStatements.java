package Day_9;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        int hız = 10;
        boolean isMoving = true;

        if (isMoving) {
            hız++;


        }
        System.out.println("hız =" + hız);
        System.out.println("-----------------------------");

        //   Task
        // 1- Bir program yazın eğer x in değeri 10 ise y ye 20 atansın.

        int x = 10;
        int y = 0;
        if (x == 10) {
            y = 20;

        }
        System.out.println("y = " + y);

        // 2- Bir program yazın sıcaklık 20 derece ve üstü ise String message; degişkenine butterfly
        //flies(kelebekler uçar) assign edilsin.

        int temp = 20;
        if (temp >= 20) {
            System.out.println("kelebekler uçar");
        } else {
            System.out.println("kelebekler soğukta pek uçmaz");
        }

        // 3- Ayşenin cep harçlığı 5 liradan daha az ise babası ona 10 lira versin.

        int harçlık = 5;
        if (harçlık < 5) {
            harçlık = harçlık + 10;
        } else {
            System.out.println("Ayşe bugün " + harçlık + " tl ile okula gidecek");
        }
        System.out.println("harçlık = " + harçlık);

        // 4- Bir program yazın ve balance(para hesabı) isimli double türünde bir değişkenimiz olsun. Suit(takım) in
        // fiyatı blance deki değerden az ise console takımı satın alabilir şeklinde bir ifade yazdıralım.

//        double balance=2050;
//        double priceOfSuit=2000;
//         if(balance>=priceOfSuit){
//             System.out.println("takım elbise alabilir");
//         }else{
//             System.out.println("yetersiz bakiye");
//         }
//
//         // 5- Write a program; 2 numara kabul etsin numaraların eşit olup olmadığını döndürsün.
//
//          int e = 4;
//          int f = 7;
//          if(e==f){
//              System.out.println("sayılar eşit");
//          }else{
//              System.out.println("sayılar eşit değil");
//          }
//
//          // 6- Bir program yazın 2 tane numara kabul etsin ve büyük olanı versin.
//
//        int c = 8;
//        int d = 9;
//         if(c>d){
//             System.out.println(c+" büyük sayıdır ");
//         }else if(d>c){
//             System.out.println(d+" büyük sayıdır");
//         }else{
//             System.out.println("sayılar eşittir");
//         }

        // 7- Bir program yazın 3 tane numara kabul etsin ve büyük olanı versin.

        Scanner scan = new Scanner(System.in);
//        int k;
//        int l;
//        int m;
//        System.out.println("lütfen bir sayı giriniz");
//        k = scan.nextInt();
//        l = scan.nextInt();
//        m = scan.nextInt();
//
//        if (k > l | k > m) {
//            System.out.println(k + " büyük sayıdır");
//        } else if (l > k | l > m) {
//            System.out.println(l + " büyük sayıdır");
//        } else if (m > k | m > l) {
//            System.out.println(m + " m büyük sayıdır");
//        } else {
//            System.out.println("sayılar birbirine eşittir");
//        }

        // 8- Write a program a,b,c olmak uzere 3 int degişken declare edelim sırasıyla değerler atayalım.
        // a ve b değişkenin  toplamı c den fazla ise a ve b nin farkını c ye atasın

        int a = 9;
        int b = 5;
        int c = 8;

        if (a + b > c) {
            c = a - b;
            System.out.println("c = " + c);
        }


        // 9- Bir sayı declare edin ve bir değer initialize yapın sayı tek mi çift mi console yazdırın.

        int k= 856;
        if(k%2==0){
            System.out.println(k + " çift sayıdır");
        }else{
            System.out.println(k + " tek sayıdır");

        }


        // 10- Bir program yazın 2 sayı kabul etsin sayıların farkı cift mi tekmi döndürsün.

        int m=29;
        int n=14;
        if(m-n%2==0){
            System.out.println("sayı çift sayıdır");
        }else{
            System.out.println("sayı tek sayıdır");
        }


//         11- Bir üçgen için 3 açı kabul etsin eğer açılar toplamı 180 ise bu bir üçgendir mesajı konsola yazdırsın.

 //       System.out.println("lütfen açıları giriniz : ");
//        int e;
//        int f;
//        int g;
//        e =  scan.nextInt();
//        f =  scan.nextInt();
//        g =  scan.nextInt();

 //       if(e+f+g==180){
//            System.out.println("bu bir üçgendir");
//        }else{
//            System.out.println("bu bir üçgen değildir");
//        }


        // 12- Bir program yazın 3 açı kabul etsin açılardan biri 90 ise bu bir dik üçgendir mesajı döndürsün.

//        int A=90;
//        int B=40;
//        int C=50;
//        if(A+B+C==180){
//        if(A == 90 || B == 90 || C == 90){
//            System.out.println("bu bir dik üçgendir");
//        }else {
//            System.out.println("bu bir üçgendir");
//        }
//
//        }else{
//            System.out.println("b bir üçgen değildir");
//        }




    /*  Scanner sc=new Scanner(System.in);
        int a;
        int b;

        System.out.println("lütfen sayıları giriniz");
        a=sc.nextInt();
        b=sc.nextInt();

        if((a-b)%2==0){
            System.out.println("bu bir çift sayıdır");

        }else{
            System.out.println("bu bir tek sayıdır");

        }

      13- Bir sayı için 5 den 25 den ve 50 den büyük olup olmadığını denetimini yapın. Eğer sayı 5 den büyükse 5 den
      büyük olduğunu konsola yazdırın. Sayı 25 den de büyükse hem 5 hem 25 den büyük olduğunu konsola yazdırın.
      Sayı 50 den büyükse sayının hem 5 den hem 25 den hem de 50 den büyük olduğunu konsola yazdırın.

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

      14-   int a=5;
            int b=6;
            int c=3;
            if((a>b) || (c>b) || (a>c) || (b>c)){
            System.out.println("en büyük sayıdir");

             }else{
                 System.out.println("en küçük sayıdır");
        }
 */


//     15- Konsoldan sayı alarak bir sayı tahmin programı yazın. Nested if yapısı kullanın. Tahmin sayıdan küçük ama
//        yakınsa(sayının yarı değerinden daha yakın) veya çok küçükse uygun bir mesaj versin. Tahmin sayıdan büyük,
//        ancak yakın veya uzak ise buna uygun mesajlar versin. Elbette isabetli tahmin de bir tebrik mesajı yazdırın

//      Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz");
        int sayi=20;
        int tahmin = scan.nextInt();

        if(tahmin<sayi) {
            System.out.println("tahmininiz sayıdan küçük");
            if(tahmin>sayi/2){
                System.out.println(" yaklaştın biraz daha büyük bir sayı söyle");
            }else if(tahmin<sayi/2){
                System.out.println("yakın değilsin daha büyük bir sayı söyle");
            }else{
                System.out.println("pek yakın sayılmazsın");
            }
        } else if (tahmin>sayi) {
            if(tahmin<sayi+sayi/2){
                System.out.println("tahmininiz yakın ancak daha küçük bir sayı söylemelisiniz");
            }else if(tahmin>sayi+sayi/2){
                System.out.println("çok büyük bir sayı söyledin daha küçük bir tahminde bulun");
            }else{
                System.out.println("pek yakın değilsin daha küçük bir tahminde bulun");
            }
        }else{
            System.out.println("Tahmininiz doğru TEBRİKLER");
        }

    }

}
