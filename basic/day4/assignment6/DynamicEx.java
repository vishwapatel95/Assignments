package basic.day4.assignment6;

public class DynamicEx {
    public static void main(String args[]){
        DayScholar dayScholar=new DayScholar();
        dayScholar.setStudentId(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Thomas");
        dayScholar.setResidentialAddress("Irving");
        dayScholar.getDetails();
    }
}
