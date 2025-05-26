package com.example.nosingleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotificationController {

    private List<Notification> notifications;
    private String controllerId;

    public NotificationController(String id) {
        this.notifications = Collections.synchronizedList(new ArrayList<>());
        this.controllerId = id;
        System.out.println("Instância criada: " + controllerId);
    }

    public void addNotification(String message) {
        Notification notification = new Notification(message);
        notifications.add(notification);
        // System.out.println("[" + controllerId + "] Notificação adicionada: " + message); // Removido para simplificar
    }

    public void displayNotifications() {
        System.out.println("\n--- Notificações (" + controllerId + ") ---");
        if (notifications.isEmpty()) {
            System.out.println("(Vazio)");
        } else {
            synchronized (notifications) {
                for (Notification notification : notifications) {
                    System.out.println("- " + notification.getMessage());
                }
            }
        }
        System.out.println("-----------------------");
    }

    public String getControllerId() {
        return controllerId;
    }
}

