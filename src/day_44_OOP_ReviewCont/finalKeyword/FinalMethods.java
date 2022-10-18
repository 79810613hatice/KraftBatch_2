package day_44_OOP_ReviewCont.finalKeyword;

public class FinalMethods {



    public final void method(){
        System.out.println("method");
        String str="a";
        str="b";
    }

}
class drived extends FinalMethods{

//    public void method(){}  // final methodlar overrite olmaz.


}