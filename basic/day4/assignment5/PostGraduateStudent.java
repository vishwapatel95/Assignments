package basic.day4.assignment5;

public class PostGraduateStudent extends Student{
    protected int postCourseId;
    protected String postCourseName;
    protected int postCourseFees;

    public PostGraduateStudent(int studentId, char studentType, String studentName, int postCourseId, String postCourseName, int postCourseFees) {
        super(studentId, studentType, studentName);
        this.postCourseId = postCourseId;
        this.postCourseName = postCourseName;
        this.postCourseFees = postCourseFees;
    }

    public int getPostCourseId() {
        return postCourseId;
    }

    public String getPostCourseName() {
        return postCourseName;
    }

    public void displayDetails(){
        System.out.println("Student Id : " + studentId + "\n" +
                            "Student Name : " +studentName + "\n" +
                            "Student type : " +studentType + "\n" +
                            "Student postCourseId : " + getPostCourseId() + "\n" +
                            "Student postCourse Name : " + getPostCourseName() + "\n" +
                            "Student postCourse Fees : " +postCourseFees);
    }

}
