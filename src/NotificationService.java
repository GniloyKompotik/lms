class NotificationService {
    public void sendWelcomeNotification(Course course) {
        System.out.println("Welcome notification sent!");
    }

    public void sendProgressUpdate(Course course, int progress) {
        System.out.println("Progress update sent: " + progress + "%");
    }

    public void sendCompletionNotification(Course course) {
        System.out.println("Completion notification sent!");
    }
}