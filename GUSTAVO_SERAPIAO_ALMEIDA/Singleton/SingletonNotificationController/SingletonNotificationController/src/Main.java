public class Main {
    public static void main(String[] args) {
        System.out.println("--- Exemplo Com Singleton ---");

        NotificationController controller1 = NotificationController.getInstance();
        NotificationController controller2 = NotificationController.getInstance();

        System.out.println("Controller 1 é o mesmo que Controller 2? " + (controller1 == controller2));
        System.out.println("ID do Controller 1: " + controller1.getControllerId());
        System.out.println("ID do Controller 2: " + controller2.getControllerId());

        controller1.addNotification("Primeira notificação (via controller1)");
        controller2.addNotification("Segunda notificação (via controller2)");

        controller1.displayNotifications();

        System.out.println("\n--- Demonstração com Threads (Com Singleton) ---");

        Thread thread1 = new Thread(() -> {
            NotificationController c = NotificationController.getInstance();
            c.addNotification("Notificação da Thread 1");
            c.addNotification("Outra Notificação da Thread 1");
        }, "Thread-A");

        Thread thread2 = new Thread(() -> {
            NotificationController c = NotificationController.getInstance();
            c.addNotification("Notificação da Thread 2");
        }, "Thread-B");

        Thread thread3 = new Thread(() -> {
            NotificationController c = NotificationController.getInstance();
            c.addNotification("Notificação da Thread 3");
            c.displayNotifications();
        }, "Thread-C");

        // Inicia as threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Aguarda as threads finalizarem
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrompida: " + e.getMessage());
        }

        System.out.println("\n--- Estado Final do Controlador Único após Threads ---");
        NotificationController finalController = NotificationController.getInstance();
        finalController.displayNotifications();
    }
}
