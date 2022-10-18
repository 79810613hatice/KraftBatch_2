package bootCamp;

import java.util.Scanner;

public class B3_Loops {
    public static void main(String[] args) {


        String message = "Welcome to bootcamp";
        String reverse = "";
        int i = message.length()-1;

        for ( i = i; i >=0 ; i--) {
            if(message.charAt(i)==' '){break;}
            if(message.charAt(i)!=' '){
               reverse+= message.charAt(i);
            }
        }
        System.out.println("reverse = " + reverse);
        System.out.println("reverse.length() = " + reverse.length());



        // break and continue

        //kullanıcıdan bir sayı aralığı alın
        //1- 7 ye tam bölünen sayıya kadar azalan şekilde yazdıralım
        //2- 7 ye tam bölünenleri yazdırmadan artan şekilde yazdırın

        Scanner scan = new Scanner(System.in);
        int i1=scan.nextInt();
        int i2=scan.nextInt();


        for (int j = Integer.max(i1,i2); j >=Integer.min(i1,i2) ; j--) {
            if(j%7==0)break;
        }
    }




}
