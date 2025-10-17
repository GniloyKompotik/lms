public class StudentPortalFacade {
    private ProgressTracker progressTracker;
    private NotificationService notificationService;

    public StudentPortalFacade() {
        this.progressTracker = new ProgressTracker();
        this.notificationService = new NotificationService();
    }

    public void enrollInCourse(Course course) {
        System.out.println("\n=== ENROLLING IN COURSE ===");
        course.deliverContent();
        progressTracker.trackEnrollment(course);
        notificationService.sendWelcomeNotification(course);
        System.out.println("Enrollment successful!\n");
    }

    public void startLearning(Course course) {
        System.out.println("\n=== STARTING LEARNING ===");
        System.out.println("Beginning your learning journey...");
        progressTracker.trackProgress(course, 25);
        notificationService.sendProgressUpdate(course, 25);
        System.out.println("Course content loaded and ready!\n");
    }

    public void completeCourse(Course course) {
        System.out.println("\n=== COMPLETING COURSE ===");
        System.out.println("Congratulations on completing the course!");
        progressTracker.trackProgress(course, 100);
        notificationService.sendCompletionNotification(course);
        progressTracker.issueCertificate(course);
        System.out.println("Course completed successfully!\n");
    }
}