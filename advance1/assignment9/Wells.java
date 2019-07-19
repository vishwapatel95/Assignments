package advance1.assignment9;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade Elvis = new EmployeeGrade();
        Elvis.intializeEmployee(2,"Patel",4.5f,4.8f,3f);
        Elvis.calculateAverageFeedback();
        Elvis.calculateGrade();
        Elvis.displayInfo();

        System.out.println();
        EmployeeGrade martha = new EmployeeGrade();
        martha.intializeEmployee(5,"Patel",3.8f,3.6f);
        martha.calculateAverageFeedback();
        martha.calculateGrade();
        martha.displayInfo();
    }
}
