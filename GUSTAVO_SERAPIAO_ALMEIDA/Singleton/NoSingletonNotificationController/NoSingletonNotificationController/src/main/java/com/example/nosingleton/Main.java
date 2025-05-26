package com.example.nosingleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Exemplo Sem Singleton ---");

        // Criamúltiplas instâncias do controlador
        NotificationController controller1 = new NotificationController("Controlador-A");
        NotificationController controller2 = new NotificationController("Controlador-B");

        // Adiciona notificações em cada controlador
        controller1.addNotification("Primeira notificação para A");
        controller2.addNotification("Primeira notificação para B");
        controller1.addNotification("Segunda notificação para A");

        // Exibi notificações (cada controlador tem sua própria lista)
        controller1.displayNotifications();
        controller2.displayNotifications();

        System.out.println("\n--- Demonstração com Threads (Sem Singleton) ---");

        // Cria um novo controlador para o teste com threads
        NotificationController sharedController = new NotificationController("Controlador-Compartilhado-Instancia1");
        NotificationController anotherSharedController = new NotificationController("Controlador-Compartilhado-Instancia2"); // Outra instância!

        Thread thread1 = new Thread(() -> {
            sharedController.addNotification("Notificação da Thread 1 (Instância 1)");
            sharedController.addNotification("Outra Notificação da Thread 1 (Instância 1)");
            sharedController.displayNotifications();
        });

        Thread thread2 = new Thread(() -> {
            anotherSharedController.addNotification("Notificação da Thread 2 (Instância 2)");
            anotherSharedController.displayNotifications();
        });
        
        Thread thread3 = new Thread(() -> {
            sharedController.addNotification("Notificação da Thread 3 (Instância 1)");
            sharedController.displayNotifications();
        });

        thread1.start();
        thread2.start();
        thread3.start();

        // Aguarda as threads terminarem
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrompida: " + e.getMessage());
        }

        System.out.println("\n--- Estado Final dos Controladores Compartilhados ---");
        sharedController.displayNotifications();
        anotherSharedController.displayNotifications();

    }
}

