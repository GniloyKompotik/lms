public class GamificationDecorator extends CourseDecorator {

    public GamificationDecorator(Course decoratedCourse) {
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
        System.out.println("Gamification: Points, badges, and leaderboards added to " + decoratedCourse.getTitle());
    }

    @Override
    public void complete() {
        decoratedCourse.complete();
        System.out.println("Gamification: You earned a special achievement for completing " + decoratedCourse.getTitle() + "!");
    }
}
