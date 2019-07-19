package advance1.assignment8;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade employeeGrade = new EmployeeGrade();
        employeeGrade.intiazlizeEmployee(208,"Vishwa Patel",5,4,4.5f);
        employeeGrade.calculateAverageFeedBack();
        employeeGrade.calculateGrade();
        employeeGrade.displayInfo();
    }
}
