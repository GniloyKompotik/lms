public abstract class CourseDecorator extends Course {
    protected Course decoratedCourse;

    public CourseDecorator(Course decoratedCourse) {
        super(decoratedCourse.title);
        this.decoratedCourse = decoratedCourse;
    }

    @Override
    public void enroll() {
        decoratedCourse.enroll();
    }

    @Override
    public void start() {
        decoratedCourse.start();
    }

    @Override
    public void complete() {
        decoratedCourse.complete();
    }
}
