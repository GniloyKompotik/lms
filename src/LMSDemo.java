public class LMSDemo {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE DIYAR'S LEARNING MANAGEMENT SYSTEM!\n");

        StudentPortalFacade studentPortal = new StudentPortalFacade();

        System.out.println("========== STUDENT 1: MATH COURSE ==========");
        Course mathCourse = new MathCourse("Advanced Calculus");
        mathCourse = new MentorSupportDecorator(mathCourse);
        mathCourse = new CertificateDecorator(mathCourse);

        studentPortal.enrollInCourse(mathCourse);
        studentPortal.startLearning(mathCourse);
        studentPortal.completeCourse(mathCourse);

        System.out.println("========== STUDENT 2: PROGRAMMING COURSE ==========");
        Course programmingCourse = new ProgrammingCourse("Java Masterclass");
        programmingCourse = new GamificationDecorator(programmingCourse);
        programmingCourse = new CertificateDecorator(programmingCourse);

        studentPortal.enrollInCourse(programmingCourse);
        studentPortal.startLearning(programmingCourse);
        studentPortal.completeCourse(programmingCourse);

        System.out.println("========== STUDENT 3: ULTIMATE COURSE ==========");
        Course ultimateCourse = new ProgrammingCourse("Full Stack Development");
        ultimateCourse = new CertificateDecorator(ultimateCourse);
        ultimateCourse = new MentorSupportDecorator(ultimateCourse);
        ultimateCourse = new GamificationDecorator(ultimateCourse);

        studentPortal.enrollInCourse(ultimateCourse);
        studentPortal.startLearning(ultimateCourse);
        studentPortal.completeCourse(ultimateCourse);
    }
}