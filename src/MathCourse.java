public class MathCourse implements Course {
    private String title;

    public MathCourse(String title) {
        this.title = title;
    }

    @Override
    public void deliverContent() {
        System.out.println("Delivering Math course: " + title);
        System.out.println("Algebra, Calculus, Geometry...");
    }
}