

class Payment1
{
    void process()
    {
        System.out.println("Processing payment using Standard gateway");
    }
}

class Gpay extends Payment1
{
    void process()
    {
        System.out.println("Processsing payment via Google pay");
    }

    void CompleteTransaction()
    {
        super.process();
        process();
    }
}


