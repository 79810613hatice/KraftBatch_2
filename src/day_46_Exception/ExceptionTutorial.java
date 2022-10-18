package day_46_Exception;

import java.util.Scanner;

public class ExceptionTutorial {
    public static void main(String[] args) {


//        System.out.println("program başladı");
//        int arr[]=new int[3];
//        System.out.println(arr[3]);
//        System.out.println("program bitti");
        Scanner scan = new Scanner(System.in);
        System.out.println("program başladı");
        for (int i = 0; i < 5; i++) {
            System.out.print(" sayı :");
            int x = scan.nextInt();
            System.out.print("bölüm : ");
            int y = scan.nextInt();
            if (y != 0) {
                System.out.println("sonuç : " + (x / y));
            } else {
                System.out.println("bölüm sıfır olamaz");
            }
        }

        System.out.println("program bitti");

    }
}
