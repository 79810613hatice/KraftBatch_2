package Day_15;

public class MethodReturnType {
    public static void main(String[] args) {

        // System.out.println(lastDijiCheck(124,444));
        //  lastDijiCheck(235,55);

        //  System.out.println(primeNumber(13));
      //  System.out.println(convertToPozitif(-5));
       //  System.out.println(gecmeNotu(55,76,77));
       //  System.out.println(gecmeNotu(90,80,76));

    }

    public static boolean lastDijiCheck(int sayi1, int sayi2) {

        if (sayi1 % 10 == sayi2 % 10) {
            return true;
        }
        return false;
    }


    public static boolean primeNumber(int num) {

        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int convertToPozitif(int a) {

         return Math.abs(a);

    }

    public static char  gecmeNotu(double not1, double not2, double not3){
        double ortalama = (not1+not2+not3)/3;

        if(ortalama>=76 && ortalama<=100){
            return 'A';
        }else if(ortalama>=51 && ortalama<=75){
            return 'B';
        }else if(ortalama>=0 && ortalama<=50){
            return 'C';
        }
    return 'X';
    }



}

