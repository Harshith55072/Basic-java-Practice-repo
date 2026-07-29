

class Notification
{
    String message=" Default Notification";
}
class PushNotification extends Notification
{
    String message="Push Notification";

    void showNotification()
    {
        System.out.println("Child message :" +message);
        System.out.println("Parent message : "+super.message);
    }
}

