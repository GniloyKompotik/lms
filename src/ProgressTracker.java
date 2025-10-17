class ProgressTracker {
    public void trackEnrollment(Course course) {
        System.out.println("Tracking enrollment for course...");
    }

    public void trackProgress(Course course, int progress) {
        System.out.println("Progress updated: " + progress + "% completed");
    }

    public void issueCertificate(Course course) {
        System.out.println("Certificate issued for course completion!");
    }
}