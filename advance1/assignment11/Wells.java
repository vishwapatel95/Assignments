package advance1.assignment11;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade [] employee = new EmployeeGrade[5];

        for (int i = 0;i<employee.length;i++){
            employee[i] = new EmployeeGrade(1,"Patel",4f,4f,4f);
            employee[i].calculateAverageFeedback();
            employee[i].calculateGrade();
            employee[i].displayInfo();
            System.out.println();
        }

    }
}
