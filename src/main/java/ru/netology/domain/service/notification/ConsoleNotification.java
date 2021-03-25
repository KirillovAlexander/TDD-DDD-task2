package ru.netology.domain.service.notification;

public class ConsoleNotification implements Notification{
    private static ConsoleNotification instance;

    @Override
    public void notifyUser(String msg) {
        System.out.println(msg);
    }

    public static ConsoleNotification getInstance() {
        if (instance == null) {
            instance = new ConsoleNotification();
        }
        return instance;
    }
}
