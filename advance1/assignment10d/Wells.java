package advance1.assignment10d;

public class Wells {
    public static void main(String[] args) {
//        EmployeeGrade ram = new EmployeeGrade();
        EmployeeGrade ram = new EmployeeGrade(102,"James",4.2f,4.4f,4.1f);
        ram.calculateAverageFeedback();
//        james.calculateAverageFeedback();
        ram.calculateGrade();
//        james.calculateGrade();
        ram.displayInfo();
        System.out.println();
//        james.displayInfo();
    }
}
