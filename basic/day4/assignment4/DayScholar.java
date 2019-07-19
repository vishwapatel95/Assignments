package basic.day4.assignment4;

public class DayScholar extends Student {
    private String residentialAddress;

    public DayScholar(int studentId) {
        super(studentId);
    }

    public DayScholar(int studentId, char studentType, String studentName, int semesterFees, String residentialAddress) {
        super(studentId, studentType, studentName, semesterFees);
        this.residentialAddress = residentialAddress;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Residental Address : " + residentialAddress);

    }
}
