package day_46_Exception;

public class ThrowClause {

    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(3000); // !!!  ya da declare edeceksin !!!
      /*  int x=0;

        try{
            if(x==0){
                throw new ArithmeticException("aritmetik exception hatasi");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        // kullanıcıdan bir sayı alın ve bu sayının faktöriyelini alaraak ekrana sonucu yazdırın



        System.out.println("merhaba");
        try{
            Thread.sleep(3000);  //  !!! ya handle edeceksin  !!!
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("dünya");

       */

        throwMetot(3);
    }
    public static void throwMetot(int x){
        System.out.println("program başladı");

            if(x==0){
                throw new RuntimeException("x sıfır olamaz");    // kod bloğu
            }
            System.out.println("program devam ediyor");

        }


    }

