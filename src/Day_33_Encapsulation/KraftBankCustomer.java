package Day_33_Encapsulation;

//   KraftBank adında bir class oluşturun, customerId, customerFullName, isSms, customerAccount, customerToken,
//   adında fields tanımlayın,
//   1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
//   2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
//   3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in ilk iki harfi+1000-9999 rasında
//     random bir sayı ile otomatik oluşturulacak.
//   4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması için class içerisinde addMoney
//     adında bir metot yazılacak.
//   5-Dışardan isSms dışındaki verilere sadece okuma yetkisi verilecek, isSms okuma ve yazma yetkisi verilebilecek.
//   6- customerFullName’in değiştirilmesi için token zorunlu kılınacak,hatalı token girilirse uyarı verilecek.


import java.util.Random;

public class KraftBankCustomer {
    private int customerId;                              // 5. madde gereği bunlar puplicti private yapıyoruz
    private String customerFullName;
    private boolean isSms;
    private double customerAccount;
    private String customerToken;

    public KraftBankCustomer(int customerId, String customerFullName, boolean isSms) {  //(1)
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
  //      Random random=new Random();  //(3)
        this.customerToken=customerId+customerFullName.substring(0,2)+12; // substring(0,2)+(random.nextInt(8999)+1000)
    }

    public int getCustomerId() {                    // get metodu 5. maddeden dolayı getirilidi
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }
    public void setCustomerFullName(String customerToken, String customerFullName ){
        if(customerToken.equals(this.customerToken)){
        this.customerFullName=customerFullName;
        }
        else{
            System.out.println("Not Authorize");
        }
    }
    public boolean getIsSms() {                     // 5. madde isSms get ve set yapıldı
        return isSms;
    }

    public void setisSms(boolean sms) {
        isSms = sms;
    }

    public double getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerToken() {
        return customerToken;
    }

    public void addMoney(double money){ //  (4)
        this.customerAccount+=money;
    }








}
