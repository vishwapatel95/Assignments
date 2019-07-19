package basic.day4.assignment8;

public class CourseManagement {
    public static void main(String[] args) {
        Student student;
        String residential = args[0];

        if (residential.equalsIgnoreCase("Hostelite")){
            student = new Hostelite(1,'F',"Vishwa","Patel",2000,"Florida Tech",208);
            student.calculateFees(student.getFeesPerMonth());
            student.displayStudentDetails();
        }else if (residential.equalsIgnoreCase("DayScholar")){
            student = new DayScholar(2,'F',"Tirth","Patel",4000,"Irving");
            student.calculateFees(student.getFeesPerMonth());
            student.displayStudentDetails();
        }

    }
}

abstract class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;

    public Student() {
    }

    public Student(int studentId, char studentType, String fname,String lname, double feesPerMonth) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = fname + lname;
        this.feesPerMonth = feesPerMonth;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String fname, String lname) {
        this.studentName = fname + lname;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }

    public abstract void calculateFees(double feesPerMonth);

    public void displayStudentDetails(){
        System.out.println("Student Id : " + studentId + "\n" +
                "Student Name : " + studentName + "\n" +
                "Student Type : " +studentType + "\n" +
                "Student feesPerMonth : " + feesPerMonth);
    }
}


class DayScholar extends Student {
    private String residentalAddress;

    public DayScholar() {
    }

    public DayScholar(int studentId, char studentType, String fname, String lname, double feesPerMonth, String residentalAddress) {
        super(studentId, studentType, fname, lname, feesPerMonth);
        this.residentalAddress = residentalAddress;
    }

    public String getResidentalAddress() {
        return residentalAddress;
    }

    @Override
    public void calculateFees(double semesterFees) {
        feesPerMonth = semesterFees/6.0;

    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Residental address : " + residentalAddress);
    }
}

class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite() {
    }

    public Hostelite(int studentId, char studentType, String fname, String lname, double feesPerMonth, String hostelName, int roomNumber) {
        super(studentId, studentType, fname, lname, feesPerMonth);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void calculateFees(double feesPerMonth) {
        super.feesPerMonth = feesPerMonth/6.0;
        super.feesPerMonth = feesPerMonth + 1200;
    }




    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Student Hostel Name: " + hostelName + "\n" +
                "Student Room Number : " + roomNumber);
    }
}



