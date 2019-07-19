package basic.day2.assignment4;

public class CourseManagement {

    public static void main(String[] args){
        int studentId1 = 002;
        char studentTyp = 'F';

        Student student = new Student();
        student.setStudentId(studentId1);
        student.setStudentType(studentTyp);

        System.out.println("Student id is : " + student.getStudentId());
        System.out.println("Student type is : " + student.getStudentType());

    }
	
}
