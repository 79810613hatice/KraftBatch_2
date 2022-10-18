package day_46_Exception;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("program başladı");

        try{     // hata alınması beklenen kod bloğu
            System.out.println("try bloğunun içi");
            int x=5/0;
            System.out.println("try bloğunun içi hata sonrası");

        }catch (Exception e){   // hata alındıktan sonra yapılan işlem
            System.out.println("catch bloğunun içi");

        }
        System.out.println("program sonlandı");




    }





}
