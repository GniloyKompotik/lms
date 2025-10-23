public class MentorSupportDecorator extends CourseDecorator {

    public MentorSupportDecorator(Course decoratedCourse) {
        super(decoratedCourse);
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
    public void deliverContent() {
        decoratedCourse.deliverContent();
        System.out.println("Mentor is providing additional support for: " + decoratedCourse.getTitle());
    }

    @Override
    public void complete() {
        decoratedCourse.complete();
    }
}
