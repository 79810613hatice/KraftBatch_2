package Day_11_Loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args){
  /*int i=1;
   for(;i<5; i++){
       System.out.println("harun");
   }

        for(int i=0; i<=20; i++){

                System.out.println("merhaba dünya");
        }
            for(char c='a'; c<='z'; c++){
                System.out.print(c+" ");
            }
            for (int i=0; i<6; i++){
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
                    System.out.println();
            }
              int k=0;
            for(int i=1; i<6; i++){
                for(int j=1; j<=i; j++){
                    k++;
                    System.out.print(k);
                }
                System.out.println();
            }
        int i=0;
        while(i<100){
            System.out.print(i+" ");
            i++;
        }

        int i=99;
        while(i>0){
            System.out.print(i+" ");
            i--;
        }
         int i=0;
while(i<=1000){
    System.out.print(i+" ");
    i+=10;
}
        int i=3, sonuc=1;
        while(i<20){
            sonuc=i*i*i;
            i+=3;
            System.out.println(sonuc);
        }
*/
           Scanner scan=new Scanner(System.in);

           do{
               System.out.println("toplam 0 ise programdan çıkış işlemi yapılacaktır");
                System.out.print("1. sayi");
                int a=scan.nextInt();
                System.out.print("2. sayi");
                int b=scan.nextInt();
                System.out.println("toplam="+(a+b));
                if(a+b==0){
                    break;
                }

           }while(true);





    }

}
