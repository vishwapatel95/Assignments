package basic.day4.assignment5;

public class DayScholar extends PostGraduateStudent {
    private String residentAddress;

    public DayScholar(int studentId, char studentType, String studentName, int postCourseId, String postCourseName, int postCourse, String residentAddress) {
        super(studentId, studentType, studentName, postCourseId, postCourseName, postCourse);
        this.residentAddress = residentAddress;
    }

    public int calculateFees(){
        postCourseFees = (int) (postCourseFees/6.0);
        return postCourseFees;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fees details : " + calculateFees());
    }
}

