public class Notification {
    private final String message;
    private final long timestamp;

    public Notification(String message) {
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Notification [message=" + message + ", timestamp=" + timestamp + "]";
    }
}
