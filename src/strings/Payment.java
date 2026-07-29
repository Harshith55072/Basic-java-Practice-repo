

class Payment
{
    void makePayment()
    {
        System.out.println("Processing payment using generic method");
    }
}
class UpiPayment extends Payment
{
    void makePayment()
    {
        System.out.println("Payment is done using UPI");
    }
}

class CardPayment extends Payment
{
    void makePayment()
    {
        System.out.println("Payment made using credit/debit card");
    }
}
class WalletPayment extends Payment
{
    void makePayment()
    {
        System.out.println("Payment is done via Wallet");
    }
}


