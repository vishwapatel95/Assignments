package basic.day4.assignment2;

import basic.day4.assignment1.Hostelite;

public class CourseManagement {
    public static void main(String[] args) {
        Hostelite hostelite = new Hostelite(1, 'F', "Vishwa", "Patel", "Florida Tech", 208);
        hostelite.setFeesPerMonth(2000);

        System.out.println("Student Id : " + hostelite.getStudentId() + "\n" +
                "Student Name : " + hostelite.getHostelName() + "\n" +
                "Student type : " + hostelite.getStudetnType() + "\n" +
                "Student FeesperMonth : " + hostelite.getFeesPerMonth() + "\n" +
                "Student hostel name : " + hostelite.getHostelName() + "\n" +
                "Student room no : " + hostelite.getRoomNumber());

    }

}
