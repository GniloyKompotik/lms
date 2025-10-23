public abstract class Course {
    protected String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void enroll();
    public abstract void start();
    public abstract void deliverContent();
    public abstract void complete();
}
