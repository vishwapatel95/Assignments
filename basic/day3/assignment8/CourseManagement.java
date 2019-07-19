package basic.day3.assignment8;

public class CourseManagement {
    public static void main(String[] args) {
        Student student;
        student = new Student(4,'F',"Vishwa","Patel");
        student.setResidentalStatus("Hostelite");


        student.setFees(12000);


        System.out.println("Student Id : " + student.getStudentId() + "\n" +
                            "Student Name : " +student.getStudentName() + "\n" +
                            "Student Type : " + student.getStudentType() + "\n" +
                            "Student Residential Status : " + student.getResidentalStatus());

        if (student.getResidentalStatus().equalsIgnoreCase("Day Scholar")){
            student.calculateFees(Double.valueOf(student.getFees()));
        }else{
            student.calculateFees(Double.valueOf(student.getFees()),5000);
        }

    }
}
