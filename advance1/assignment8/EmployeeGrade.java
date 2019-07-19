package advance1.assignment8;

public class EmployeeGrade {
    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grade;

    public void intiazlizeEmployee(int employeeNo,String employeeName,float customer1Feedback, float customer2Feedback, float customer3Feedback){
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
    }

    public void calculateAverageFeedBack(){
//        double average = 0;
        averageFeedback = (customer1Feedback + customer2Feedback + customer3Feedback ) / 3;
    }

    public void calculateGrade(){
        if (averageFeedback > 4){
            grade = 'A';
        }else if (averageFeedback >3 || averageFeedback < 4){
            grade = 'B';
        }else {
            grade = 'C';
        }
    }

    public void displayInfo(){
        System.out.println("Employee No : " + employeeNo + "\n" +
                            "Employee Name : " +employeeName + "\n" +
                            "Employee Average : " +averageFeedback + "\n" +
                            "Employee Grade : " +grade);
    }
}
