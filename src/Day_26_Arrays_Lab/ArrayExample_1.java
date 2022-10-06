package Day_26_Arrays_Lab;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample_1 {
    public static void main(String[] args) {

       int [] sayilar = {1,3,6,9,88,3,78};
       int [] sayilar2 = {5,34,78,9,-34,43,234};

          //System.out.println(toplam(sayilar));
          //System.out.println(toplamCift(sayilar));
          //System.out.println(toplamUc(sayilar));
          //System.out.println(maxMinFark(sayilar));
          //System.out.println(Arrays.toString(enkucukSayiIleDoldur(sayilar)));
          // System.out.println(Arrays.toString(araSayilariAta(5, 9)));
          //System.out.println(Arrays.toString(arraybirlestir(sayilar, sayilar2)));
          //System.out.println(arrayControl(sayilar, sayilar2));
          // System.out.println(Arrays.toString(tersArray(sayilar)));
          //System.out.println(Arrays.toString(rastgeleArray(15)));
          // System.out.println(Arrays.toString(rastgeleArrayÜretElli(15)));
          // System.out.println(rastgeleArray125Control(5000));


    }

        // Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız.
    public static int toplam(int [] arr){
        int result=0;
        for( int sayi:arr){
            result+=sayi;
        }
        return result;
    }

        //Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız
    public static int toplamCift(int [] arr){
       int result = 0;
        for (int sayi:arr ) {
            if(sayi%2==0){
                result+=sayi;
            }

        }
        return result;
    }

        // Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız. [2,3,3,6,5,4,3] →9
    public static int toplamUc(int[] arr){
        int result=0;
        for (int sayi:arr ) {
            if(sayi==3){
                result+=sayi;
            }
        }
        return result;

    }
        // Örnek 4: Array’in içerisindeki en büyük ve en küçük sayı arasındaki farkı  bulan metodu yazınız.
        //(Arrays.sort kullanılmayacak)
    public static int maxMinFark(int[] arr){
        int max = arr[0], min=arr[0];
        for (int sayi:arr) {
             if(sayi>max){
                 max=sayi;
             }
            if(sayi<min){
                min=sayi;
             }
        }return max-min;

    }
        // Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
        // Arrays.fill kullanılmayacak) [1,2,-8,-9] [-9,-9,-9,-9]
        public static int [] enkucukSayiIleDoldur(int[] arr){
        int[] yeniArray=new int[arr.length];
        int min=arr[0];
             for (int i = 0; i < yeniArray.length ; i++) {
                 yeniArray[i]=min;
             }
             return yeniArray;
    }

        // Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
        // createArray(8,15) → [8,9,10,11,12,13,14,15]
        public static int[] araSayilariAta(int a, int b){
        int max=Math.max(a,b);
        if(max==a){
            int[] yeniArray=new int[(a-b+1)];
            for (int i = 0; i < yeniArray.length ; i++) {
                yeniArray[i]=b+i;
            }
        return yeniArray;
        }
        else{
            int[] yeniArray=new int[(b-a+1)];
            for (int i = 0; i < yeniArray.length ; i++) {
                yeniArray[i]=a+i;
            }
            return yeniArray;
        }

    }

        // Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
        //oluşturan metodu yazınız.[1,2,-8,-9] [-1,0,-7,11] -------→ [1,2,-8,-9,-1,0,-7,11]
        public static int[] arraybirlestir(int[] a, int[] b){
        int[] result=new int[a.length+b.length];
            for (int i = 0, j=0; i < result.length; i++) {
                if(i<a.length){
                    result[i] = a[i];
                }
                if(i>a.length-1){
                    result[i]= b[j];
                    j++;
                }
            }
            return result;
        }
        //Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
        //yer almıyorsa false yazdıran metodu yazınız.[5,4,3,2,1] , [1,2,3,4,5,7,9] true  [5,4,3,2,1,7,5] , [1,2,3,4,5] false

        public static boolean arrayControl(int[] a, int[] b){

            firstLoop: for (int i = 0; i < a.length ; i++) {
            secondLoop: for (int j = 0; j < b.length ; j++) {
                if(a[i] == b[j]){
                    continue firstLoop;
                }
                continue secondLoop;
            }
            return false;
        }
        return true;

        }
        // Örnek 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız
        //  [5,4,3,2,1] -----------> [1,2,3,4,5]
        public static int[] tersArray(int[] arr){
        int[] yeniArray=new int[arr.length];
            for (int i = arr.length-1,j=0; j < yeniArray.length; i--,j++) {
                yeniArray[j]=arr[i];
            }
            return yeniArray;
        }

            // Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
            // rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.
        public static int[] rastgeleArray(int boyut){
            Random random=new Random();
            int [] yeniArray=new int[boyut];
            for (int i = 0; i < boyut; i++) {
                yeniArray[i] = random.nextInt(100);
            }
            return yeniArray;
        }

            // Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
            // arasında rasgele sayılar atayın.
        public static int[] rastgeleArrayÜretElli(int boyut){
             Random random=new Random();
             int[] yeniArray=new int[boyut];
            for (int i = 0; i < boyut; i++) {
                yeniArray[i]=random.nextInt(30)+50;
            }
            return yeniArray;
        }

            // Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
            // arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?
         public static int rastgeleArray125Control(int boyut){
            Random random=new Random();
             int[] yeniArray=new int[boyut];
             int count=0;
            for (int i = 0; i < boyut; i++) {
                yeniArray[i]=random.nextInt(20)+120;
            if(yeniArray[i]==125){
                count++;
            }
            }
            return count;
        }

            // Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
            // arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
            // (Array.sort kullanılmayacak)






}
