import java.util.Scanner;

public class LMSDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO DIYAR'S LEARNING MANAGEMENT SYSTEM!\n");

        StudentPortalFacade studentPortal = new StudentPortalFacade();

        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();

        System.out.println("\nHello, " + studentName + "!");
        System.out.println("Available courses:");
        System.out.println("1. Math (Advanced Calculus)");
        System.out.println("2. Programming (Java Masterclass)");
        System.out.println("3. Ultimate (Full Stack Development)");
        System.out.print("Choose your course (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Course selectedCourse;

        switch (choice) {
            case 1:
                selectedCourse = new MathCourse("Advanced Calculus");
                selectedCourse = new MentorSupportDecorator(selectedCourse);
                selectedCourse = new CertificateDecorator(selectedCourse);
                break;
            case 2:
                selectedCourse = new ProgrammingCourse("Java Masterclass");
                selectedCourse = new GamificationDecorator(selectedCourse);
                selectedCourse = new CertificateDecorator(selectedCourse);
                break;
            case 3:
                selectedCourse = new ProgrammingCourse("Full Stack Development");
                selectedCourse = new CertificateDecorator(selectedCourse);
                selectedCourse = new MentorSupportDecorator(selectedCourse);
                selectedCourse = new GamificationDecorator(selectedCourse);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Math Course.");
                selectedCourse = new MathCourse("Advanced Calculus");
                selectedCourse = new CertificateDecorator(selectedCourse);
        }

        System.out.println("\nEnrolling " + studentName + " in course: " + selectedCourse.getTitle() + "\n");

        studentPortal.enrollInCourse(selectedCourse);
        studentPortal.startLearning(selectedCourse);
        studentPortal.completeCourse(selectedCourse);

        System.out.println("\nThank you for using DIYAR'S LMS, " + studentName + "!");
        scanner.close();
    }
}
