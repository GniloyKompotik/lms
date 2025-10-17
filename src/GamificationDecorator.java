public class GamificationDecorator extends CourseDecorator {
    public GamificationDecorator(Course course) {
        super(course);
    }

    @Override
    public void deliverContent() {
        super.deliverContent();
        addGamification();
    }

    private void addGamification() {
        System.out.println("Gamification enabled: Points, Badges, Leaderboard!");
        System.out.println("Compete with friends and earn rewards!");
    }
}