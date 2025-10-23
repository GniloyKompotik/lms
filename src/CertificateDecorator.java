public class CertificateDecorator extends CourseDecorator {

    public CertificateDecorator(Course course) {
        super(course);
    }

    @Override
    public void deliverContent() {
        decoratedCourse.deliverContent();
        addCertificateFeature();
    }

    private void addCertificateFeature() {
        System.out.println("Certificate will be granted upon completion!");
    }
}
