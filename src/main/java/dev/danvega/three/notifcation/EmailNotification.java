package dev.danvega.three.notifcation;

public class EmailNotification implements NotificationService {

    @Override
    public void send() {
        System.out.println("Sending email notification");
    }

}
