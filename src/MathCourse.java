public class MathCourse extends Course {

    public MathCourse(String title) {
        super(title);
    }

    @Override
    public void enroll() {
        System.out.println("Enrolled in math course: " + title);
    }

    @Override
    public void start() {
        System.out.println("Starting math course: " + title);
    }

    @Override
    public void deliverContent() {
        System.out.println("Delivering math lectures and problem sets for: " + title);
    }

    @Override
    public void complete() {
        System.out.println("Completed math course: " + title);
    }
}
