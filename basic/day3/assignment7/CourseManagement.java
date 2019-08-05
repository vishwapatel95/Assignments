package basic.day3.assignment7;

public class CourseManagement {
    public static void main(String[] args) {
        int studentId = Integer.parseInt(args[0]);
        String fname = args[1];
        String lname = args[2];
        String residentStatus = args[3];
        long fees = Long.parseLong(args[4]);
        long hostelAdd = Long.parseLong(args[5]);

        Student student = new Student();

        student.setStudentId(studentId);
        student.setStudentName(fname, lname);
        student.setResidentialStatus(residentStatus);
        if (student.getResidentialStatus().equals("F")) {
            student.setFeesPerMonth(fees);
        } else {
            student.setFeesPerMonth(hostelAdd);
        }


        System.out.println("Student Id : " + student.getStudentId() + "\n" +
                "Student Name : " + student.getStudentName() + "\n" +
                "Student Residential Status : " + student.getResidentialStatus() + "\n" +
                "Student fees : " + student.getFeesPerMonth());


    }
}

class Student {
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private long feesPerMonth;

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String fname, String lname) {
        this.studentName = fname + lname;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public long getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(long feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }
}
