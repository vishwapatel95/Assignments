package basic.day4.assignment7;

public class Main {
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(1,'F',"Patel","Irving");
        dayScholar.setStudentId(12413);
        dayScholar.setStudentName("Vishwa","Patel");
        dayScholar.setStudentType('F');
        dayScholar.calculateFees();
        dayScholar.displayDetails();
        dayScholar.displayDaySDetails();
    }
}
