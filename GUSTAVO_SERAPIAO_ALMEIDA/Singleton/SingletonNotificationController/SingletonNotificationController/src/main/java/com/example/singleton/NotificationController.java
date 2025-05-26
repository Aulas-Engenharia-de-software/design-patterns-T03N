package com.example.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotificationController {

    private static final NotificationController instance = new NotificationController();

    private List<Notification> notifications;
    private String controllerId = "Controlador-Unico-Singleton";

    private NotificationController() {
        this.notifications = Collections.synchronizedList(new ArrayList<>());
        System.out.println("Instância ÚNICA (Singleton) inicializada.");
    }

    public static NotificationController getInstance() {
        return instance;
    }

    public void addNotification(String message) {
        Notification notification = new Notification(message);
        notifications.add(notification);
    }

    public void displayNotifications() {
        System.out.println("\n--- Notificações (Singleton) ---");
        if (notifications.isEmpty()) {
            System.out.println("(Vazio)");
        } else {
            synchronized (notifications) {
                 System.out.println("(Total: " + notifications.size() + ")");
                for (Notification notification : notifications) {
                    System.out.println("- " + notification.getMessage());
                }
            }
        }
        System.out.println("---------------------------");
    }

    public String getControllerId() {
        return controllerId;
    }
}

