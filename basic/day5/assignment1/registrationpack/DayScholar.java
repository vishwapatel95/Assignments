package basic.day5.assignment1.registrationpack;

import basic.day5.assignment1.registrationpack.studentpack.Student;

public class DayScholar extends Student {
    private String residentialAddress;
    public void setResAddress(String resAddress){
        this.residentialAddress=resAddress;
    }
    public void getDetails(){
        System.out.println("Student Id:"+studentId);
        System.out.println("Student Type:"+studentType);
        System.out.println("Student Name:"+studentName);
    }

}
class Registration{

    public static void main(String args[]){
        DayScholar dayScholar=new DayScholar();
        dayScholar.setStudentId(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Dinil");
        dayScholar.getDetails();
    }
}
