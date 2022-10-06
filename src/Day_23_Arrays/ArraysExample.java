package Day_23_Arrays;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        int[] sayi = new int[3];
        sayi[0] = 10;
        sayi[1] = 8;
        sayi[2] = 6;
//        System.out.println(sayi[0]+50);
//        System.out.println(sayi[1]*15+25);
//        System.out.println(sayi[0]/5*20+300);
        // System.out.println("" +sayi[0]+sayi[1]+sayi[2]);

        for (int i = 0; i < 3; i++) {
          // System.out.println(sayi[i]);
        }

        for (int i = 0; i < 3; i++) {
            //    System.out.println(sayi[i]*sayi[i]);
        }

        String[] gun = new String[7];
        gun[0] = "pazartesi";
        gun[1] = "sali";
        gun[2] = "çarsamba";
        gun[3] = "perşembe";
        gun[4] = "cuma";
        gun[5] = "cumartesi";
        gun[6] = "pazar";
       // System.out.println("bu gün günlerden " + gun[2]);

        if (gun[2].equals("çarşamba")) {
           // System.out.println("haftanın üçüncü günü çarşambadır");
        } else {
           // System.out.println("haftanın üçüncü günü çarşamba değildir");
        }
        for (int i = 0; i <7 ; i++) {
            if(gun[i].equals("cuma")){
              //  System.out.println(true);
                 break;
            }else{
               if(i==6){
                  // System.out.println("false");
               }
            }
        }

       // int [] array3={1,2,3,4,5,6,7,8};
        int [] array3=new int[8];
        array3[0]=1;
        array3[1]=2;
        array3[2]=3;
        array3[3]=4;
        array3[4]=5;
        array3[5]=6;
        array3[6]=7;
        array3[7]=8;

    String [] str= {"pazartesi", "salı", "çarşamba","perşembe", "cuma", "cumartesi", "pazar"};

        String [] isim = new String[5];
        isim [0]="zeynep";
        isim [1]="sevda";
        isim [2]="elif";
        isim [3]="hatice";
        isim [4]="erva";
       // System.out.println("isminiz " +isim [3]+ " bu grupta  vardır");

        String ad="Harun";
        String [] str1={"harun", "mehmet", "ahmet", "can", "ihsan"};
        int count=0;
        for (int i = 0; i < 5; i++) {
            if(str1[i].equalsIgnoreCase(ad)){
              count++;
            }
        }
        if (count>0){
            //System.out.println("isminiz grup içerisinde vardır");
        }
        else{
            //System.out.println("isminiz grup içerisinde yoktur");
        }


        Random random = new Random();
        int [] sayi2 =new int[20];
        for (int i = 0; i < 20; i++) {
            sayi2[i]= random.nextInt(100);
            System.out.println((i)+ " sayi : "+ sayi2[i]);
        }
       // System.out.println("17. indeksteki sayı " + sayi2[17]);

        int tek=0,çift=0;
        for (int i = 0; i < 20; i++) {
            if(sayi2[i]%2==0){
                çift++;
            }
            else{
                tek++;
            }
        }
        System.out.println("tek sayi adedi : "+ tek);
        System.out.println("çift sayi adedi : "+ çift);
    }

}