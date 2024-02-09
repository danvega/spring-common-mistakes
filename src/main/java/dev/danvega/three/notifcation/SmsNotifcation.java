package dev.danvega.three.notifcation;

public class SmsNotifcation implements NotificationService {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }

}
