

class Device
{
    void deviceType()
    {
        System.out.println("I am an electronic device");
    }
}
class Phone extends Device
{
    void brand()
    {
        System.out.println("Brand : samsung");
    }
}
class SmartPhone extends Phone
{
    void feature()
    {
        System.out.println("Features, Touchscreen,Camera, Internet");
    }
}


 class MultiLevelInheritanceDemo {

    public static void main(String[] args) {
        SmartPhone smart=new SmartPhone();
        smart.deviceType();
        smart.brand();
        smart.feature();

    }

}
