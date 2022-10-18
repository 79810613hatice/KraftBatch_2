package day_44_OOP_ReviewCont.finalKeyword;

public class FinalKeyword {

    static final int f = 10;  // 1
    final int n;
    final int l;
    static final int sl;

    public FinalKeyword() {
        n=20;   //2
        System.out.println("from constructor " +n);

    }

    {
        l=30;   //3
        System.out.println("from init block " +l);
    }
    static {
        sl=40;
        System.out.println("static block run");
    }
}
class run{
    public static void main(String[] args) {

        FinalKeyword finalKeyword=new FinalKeyword();
        System.out.println("------------------");
        FinalKeyword finalKeyword2=new FinalKeyword();


    }
}