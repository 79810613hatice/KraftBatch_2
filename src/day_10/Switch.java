package day_10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);

 /*       System.out.println("Kaçıncı ay");
        int numOfMonth = scan.nextInt();

        switch (numOfMonth) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziren");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("girdiğiniz sayı bir ay ile eşleşmiyor");


        }

//        Task  (switch)
//        Order Days
//        1 Monday
//        2 Tuesday
//        3 Wednesday
//        4 Thursday
//        5 Friday
//        6 Saturday
//        7 Sunday

        System.out.println("hangi gün");
        int numOfDay=scan.nextInt();

        switch (numOfDay){
            case 1 :
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("frayday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("girdiğiniz sayı haftanın günleri ile uyuşmuyor");

        }
*/

//        2- Bir program yazın switch yapısını kullanın. Şu beden numaralarını :
//        small(38-40-42), medium(44-46-48), large(50-52-54) yakalasın. Aşağıdaki şekilde çıktı alın.
//        Example output: 50 numara bir large bedendir.

//        System.out.println("hangi beden istiyorsunuz");
//        int beden = scan.nextInt();
//
//        switch (beden){
//            case (38):
//                System.out.println("38-40-42 numara bir small bedendir");
//                break;
//            case(44):
//                System.out.println("44-46-48 numara bir medium bedendir");
//                break;
//            case(50):
//                System.out.println("50-52-54 numara bir large bedendir");
//                break;
//            default:
//                System.out.println("girmiş olduğunuz numarada beden bulunmamaktadır");
//
//        }
//    3- Switch yapısını kullanarak basit bir hesap makinesi yapın. Mümkünse değerleri console den alın
//    Reminder: 2 int değer belirleyin ve 4 işlem için 4 case olsun.

//        System.out.println("hesap makinesi hazır");
//
//        int num1=scan.nextInt();
//        scan.nextLine();
//        String aritmetik=scan.nextLine();
//        int num2=scan.nextInt();
//        int sonuç=0;
//
//        switch (aritmetik){
//            case "+":
//                sonuç=num1+num2;
//                System.out.println("sonuç = " + sonuç);
//                break;
//            case "-":
//                sonuç=num1-num2;
//                System.out.println("sonuç = " + sonuç);
//                break;
//            case "*":
//                sonuç=num1*num2;
//                System.out.println("sonuç = " + sonuç);
//                break;
//            case "/":
//                sonuç=num1/num2;
//                System.out.println("sonuç = " + sonuç);
//                break;
//            default:
//                System.out.println("girdiğiniz matematiksel işaret yanlıştır");
//        }


//        Task - 4 -
//        3 katlı bir motel in
//        1.katında Resepsion, Güvenlik ve Oda hizmetleri var.
//        2 katında Yemekhane, Dinlenme salonu ve Room1,Room2
//        3.katında ise Room3,Room4,Room5,Room6 vardır.
//          Bir switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım alacagınız bir program(nested
//        switch) yazın. Tanıtım bilgileri için aşağıdakileri kullanabilirsiniz.
//        message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.
//        message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
//        2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
//        3.kat : Room3-Room4-Room5-Room6
//        Resepsion : tüm işlemleriniz için bekleriz
//        Güvenlik : profosyonel bir hizmettir
//        Oda hizmetleri : temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz
//        Yemekhane : Kahvaltı 08-11
//        Öğle yemeği 12-15
//        Akşam yemeği 18-21
//        Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
//        Room1,Room2 : ekonomik oda
//        Room3,Room4 : standart oda
//        Room5,Room6 : özel oda

        System.out.println(" lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.");
        System.out.println(" 1.kat : Resepsion-Güvenlik-Oda hizmetleri \n 2.kat : Yemekhane-Dinlenme salonu-Room1-Room2 \n 3.kat : Room3-Room4-Room5-Room6");

        Scanner scan = new Scanner(System.in);
        int kat = scan.nextInt();
        scan.nextLine();
        String secim = scan.nextLine();

        switch (kat){
            case 1:
                switch (secim){
                    case "Resepsion":
                        System.out.println("tüm işlemleriniz için bekleriz");
                        break;
                    case "Güvenlik":
                        System.out.println("profosyonel bir hizmettir");
                        break;
                    case "Oda hizmetleri":
                        System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");
                }

                break;
            case 2:
                switch (secim){
                    case "Yemekhane" :
                        System.out.println("Kahvaltı 08-11\nÖğle yemeği 12-15\nAkşam yemeği 18-21 ");
                        break;
                    case "Dinlenme salonu" :
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case "Room1-Room2" :
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");
                }

                break;
            case 3:
                switch (secim){
                    case "Room3-Room4" :
                        System.out.println("standart oda");
                        break;
                    case "Room5-Room6" :
                        System.out.println("özel oda");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");
                }

                break;
            default:
                System.out.println("otelimiz 3 katlıdır");
        }

    }

}
