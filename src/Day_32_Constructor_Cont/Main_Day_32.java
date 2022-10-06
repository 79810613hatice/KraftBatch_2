package Day_32_Constructor_Cont;

public class Main_Day_32 {
    public static void main(String[] args) {
       /* Square square_1=new Square();
        square_1.sideLenght=5;
        System.out.println(square_1.calculateArea(5));
        System.out.println(square_1.calculatePerimeter());


        Square square_2=new Square(8);
        System.out.println(square_2.calculatePerimeter());
        System.out.println(square_2.calaualteArea());


        Pencil benimkalemim=new Pencil("sari",7,false);
        System.out.println(benimkalemim.lenght);
        System.out.println(benimkalemim.color);
        System.out.println(benimkalemim.haveEraser);
        benimkalemim.write();
        benimkalemim.delete();



        Cat efe = new Cat("yeşil","sokak kedisi",true,false);
        Cat minnos = new Cat("yeşil", "sokak kedisi", false, true);
        Cat pamuk = new Cat("yeşil - mavi", "van kedisi", false, true);

        System.out.println(pamuk.eyeColor);
        System.out.println(pamuk.food());
        System.out.println(minnos.food());  */


        KraftBankCustomer customer_1=new KraftBankCustomer(1525,"Ali Şen", true);
        System.out.println(customer_1.customerToken);

        KraftBankCustomer enes=new KraftBankCustomer(152324525,"Enes Yaman",true);
        System.out.println(enes.customerToken);
        System.out.println(enes.customerAccount);
        enes.addMoney(500);
        System.out.println(enes.customerAccount);
        enes.addMoney(250);
        System.out.println(enes.customerAccount);
        System.out.println(enes.customerFullName);
        enes.addMoney(3500);
        System.out.println(enes.customerAccount);

    }


}
