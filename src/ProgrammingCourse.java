public class ProgrammingCourse implements Course {
    private String title;

    public ProgrammingCourse(String title) {
        this.title = title;
    }

    @Override
    public void deliverContent() {
        System.out.println("Delivering Programming course: " + title);
        System.out.println("Java, Python, C++...");
    }
}