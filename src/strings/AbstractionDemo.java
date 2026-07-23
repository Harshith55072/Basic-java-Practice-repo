

public class AbstractionDemo {

    public static void main(String[] args) {
        MaheshDemo obj=new Ramesh();
        obj.calling();
        obj.aiIntegration();
        obj.healthMonitoring();
        obj.satelliteComm();

    }

}
abstract class MaheshDemo //2024
{
    void calling()
    {
        System.out.println("Phone is having calling feature");
    }
    abstract void aiIntegration();
    abstract void satelliteComm();
    abstract void healthMonitoring();

}
abstract class Suresh extends MaheshDemo //2025
{
    @Override
    void aiIntegration() {
        System.out.println("Phone is integrated with AIIntegration");
    }
    @Override
    abstract void satelliteComm() ;

    @Override
    abstract void healthMonitoring();

}
class Ramesh  extends Suresh  //2026
{
    @Override
    void satelliteComm() {
        System.out.println("Phone is integrated with satelliteComm");
    }

    @Override
    void healthMonitoring() {
        System.out.println("Phone is integrated with healthMonitoring");
    }

}