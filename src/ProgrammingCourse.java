public class ProgrammingCourse extends Course {

    public ProgrammingCourse(String title) {
        super(title);
    }

    @Override
    public void enroll() {
        System.out.println("Enrolled in programming course: " + title);
    }

    @Override
    public void start() {
        System.out.println("Starting programming course: " + title);
    }

    @Override
    public void deliverContent() {
        System.out.println("Delivering coding lessons and hands-on projects for: " + title);
    }

    @Override
    public void complete() {
        System.out.println("Completed programming course: " + title);
    }
}
