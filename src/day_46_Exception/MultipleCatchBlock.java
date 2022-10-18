package day_46_Exception;

public class MultipleCatchBlock {

    public static void main(String[] args) {

//        int arr[]=new int [4];
//        System.out.println("program başladı");
//        try{
//            System.out.println(arr[5]);
//        }catch(Exception e){
//            System.out.println("exception yakalandı");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("program sonlandı");
        //  }


        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("exception yakalandı");
        } finally {
            System.out.println("finally bloğu çalıştı");
        }

    }
}