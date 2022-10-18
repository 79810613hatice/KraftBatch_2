package day_48_Collection;

import java.util.Scanner;

public class Collection_Lesson {
    public static void main(String[] args) {
        veriAlVeEkranaYazdır();
    }

    public static void veriAlVeEkranaYazdır(){
        Scanner scan=new Scanner(System.in);
        System.out.print("kaç adet sayi girmek istiyorsunuz:");
        int x= scan.nextInt();
        int[] array=new int[x];
        for (int i = 0; i < array.length; i++) {
            System.out.print("sayi: ");
            array[i]= scan.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}
