public class PaymentTest {

    public static void main(String[] args) {
        Payment payment; //reference parent class

        payment=new UpiPayment();
        payment.makePayment();

        payment=new CardPayment();
        payment.makePayment();


        payment=new WalletPayment();
        payment.makePayment();



    }

}
