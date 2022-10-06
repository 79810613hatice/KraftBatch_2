package Day_27_Array_Lab_Cont;

import java.util.Arrays;

public class Array_Example_2 {
    public static void main(String[] args) {

    int [] sayilar={6,5,8,7,99,74,85,3,4,29,37,41,36,};
    int [] sayilar2={1,5,2,3,4,85,36};


//        String alinti = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
//                "          dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
//                "          sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
//                "          üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";

        //String alinti2 = "araba ile yola çıktık ancak araba yolda bozuldu";


        // System.out.println(enBüyükİkinciSayi(sayilar));
        // System.out.println(ardArdaUc(sayilar2));
        // System.out.println(Arrays.toString(yalnizSayilar(sayilar)));
        // System.out.println(enCokSayi(sayilar));
          //System.out.println(dublicate(sayilar));
        // System.out.println(findCountLetter(alinti,"o"));
            //System.out.println(dublicateControlString(alinti2));
           // System.out.println(Arrays.toString(enkücükSayiVeSifirAta(sayilar)));
       System.out.println(Arrays.toString(degerAtamaKontrol(sayilar ,5,8,1)));
       // System.out.println(asalSayiBul(sayilar));
       // System.out.println(Arrays.toString(kücüktenBüyügeSirala(sayilar)));

    }
    // Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
    //arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
    //(Array.sort kullanılmayacak)

    public static int enBüyükİkinciSayi(int[] arr){
        int a=arr[0];
        int b=arr[0];
        for (int sayi:arr) {
            if(sayi>a) a=sayi;
        }
        for(int sayi: arr){
            if(sayi>b && sayi<a){
                b=sayi;
            }
        }return b;

    }
        // Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
        // [2,3,3,4,5,6,5,6,3] → true [2,4,5,8,8] → false [1,2,3] → true  [1,2] → false

        public static boolean ardArdaUc(int[] arr){
        if(arr.length<3) {return false;}
        for(int i=0; i<arr.length-2; i++){
            if(arr[i]==arr[i+1]-1 && arr[i]==arr[i+2]-2){
                return true;
            }
        }
            return false;

    }
        // Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
        // yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.) [2,3,3,4,5,6,5,6,3] → 2,4,5,6,3
        //  [2,2,5,8,8] →5  [2,2,3] → 3  [1,2] → 1,2

        public static String[] yalnizSayilar(int[] arr){
        String yalnızSayilar="";
        if(arr.length==1){
            yalnızSayilar+=arr[0]+" ";
            return yalnızSayilar.split(" ");
        }
        if (arr[0]!=arr[1]) yalnızSayilar+=arr[0]+" ";
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1]) yalnızSayilar+=arr[i]+" ";
        if(arr[arr.length-1]!=arr[arr.length-2]) yalnızSayilar+=arr[arr.length-1]+" ";
        }
        return yalnızSayilar.split(" ");

    }
        // Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
        // birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
        // [2,3,3,3,6,6,5,6,3] → 3  [2,4,5,8,8] → 8   [2,4,5,8] → -1

        public static int enCokSayi(int[] arr){
        int enCok =-1;
        int count=0;
        int adet=1;
            for (int i = 0; i < arr.length; i++) {
                count=0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            if(count>adet){
                enCok=arr[i];
                adet=count;
            }
            }
        return enCok;
    }

        //  Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
        //[1,2,8,1] true   [25,89,78,98] false

        public static boolean dublicate(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(i!=j&&arr[i] == arr[j]){
                        return true;
                    }
                }
            }
            return false;
        }



         // Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
         // dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
         // sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
         // üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
         // harfi vardır. (Büyük ve küçük ihmal edilecek)

        public static int findCountLetter(String str, String harf){
           // return str.toLowerCase().split(harf).length-1;   2. çözüm
          // return str.toLowerCase().length()-str.toLowerCase().replace("o", "").length(); 3. çözüm

         str = str.toLowerCase();
         String [] arr= str.split("");
         int count=0;
         for(String harf_1 : arr){
            if(harf_1.equals(harf)){
                count ++;
            }
         }
         return count;
        }

     // Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu yazınız.
     // araba ile yola çıktık fakat araba arıza yaptı true
     // araba ile yola çıktık fakat arıza yaptı false

    public static boolean dublicateControlString (String str){
        String[] strArray=str.toLowerCase().split(" ");
        for (int i = 0; i < strArray.length ; i++) {
            for (int j = 0; j < strArray.length ; j++) {
                if(i!=j&&strArray[i].equals(strArray[j])){
                    return true;
                }
            }
        }
        return false;
    }


     // Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
     // indekslere 0 atayan metodu yazınız.    [5,7,1,9] [1,0,0,0]

    public static int[] enkücükSayiVeSifirAta(int [] arr){
        int enKücükSayi = arr[0];
        for (int sayi : arr){
            if(sayi<enKücükSayi){
                enKücükSayi=sayi;
            }
        }
        int [] yeniArray = new int[arr.length];
        yeniArray[0]=enKücükSayi;
        for (int i = 1; i < yeniArray.length; i++) {
            yeniArray[i]=0;
        }
        return yeniArray;
    }




        // Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
        // [6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]   [5,7,8,5,9] → [5,7,8,5,9]

    public static int[] degerAtamaKontrol(int[] arr, int ilkDeger, int kontrolDegeri, int atanacakSayi){
        int [] yeniArray = new int [arr.length];
        yeniArray[0]=arr[0];
        for (int i = 0; i < yeniArray.length-1; i++) {
            if(arr[i] == ilkDeger && arr[i+1] == kontrolDegeri){
                yeniArray[i+1]=1;
            }
            else{
                yeniArray[i+1]=arr[i+1];
            }
        }
        return yeniArray;
    }


        // Örnek 22:Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
        // [21,7,29,12] ----→ 7 29

    public static String asalSayiBul(int[] arr){
        String result ="";
        fisrtLoop: for(int sayi: arr){
            if(sayi==2){result+=sayi+" ";}
            else if (sayi ==0 || sayi==1){continue fisrtLoop;}
            else{
                for (int i = 2; i <sayi ; i++) {
                    if(sayi%i==0){
                        continue fisrtLoop;
                    }
                }
                result+=sayi+" ";
            }
        }
        return result;
    }


        // Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
        //  [21,7,29,12] ----→ [7,12,21,29]

    public static int[] kücüktenBüyügeSirala(int[] arr){
        int depo=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    depo=arr[i];
                    arr[i]=arr[j];
                    arr[j]=depo;
                }
            }
        }
        return arr;
    }






          // Örnek 24:Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak dublicate olmayan sayıların
         // toplamını veren metodu yazınız.   [1,1,2,3] → 5   [2,5,5,5,9] →11  [5,5,5,5,9] →9 [5,5,5,5,5] →0 [5,1,5,1,5] →17







          // Örnek 25:Array’in içerisindeki sayıların toplamını veren fakat 5 ile 9 dahil arasındaki sayıları
          //toplama dahil etmeyin.[1,5,9,3] → 4 [2,5,28,36,9] →2 [5,3,9,11,9] →20  [5,5,5,5,9] →0 [5,9,5,1,9] →0








           // Örnek 26:Array’in içerisindeki ne kadar 1 var ise hepsini en sağa taşıyan metodu yazınız.
          //  [5,1,9,6,1,4,7,11,25,36] → [5,9,6,4,7,11,25,36,1,1]







}
