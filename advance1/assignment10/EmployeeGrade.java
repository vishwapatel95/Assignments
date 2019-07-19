package advance1.assignment10;

public class EmployeeGrade {
    private int employeeNo;
    private String employeeName;
    private float customer1FeedBack;
    private float customer2FeedBack;
    private float customer3FeedBack;
    private float averageFeedBack;
    private char grade;

    public EmployeeGrade() {
        this.employeeNo = 101;
        this.employeeName = "Ram";
        this.customer1FeedBack = 4.3f;
        this.customer2FeedBack = 4.1f;
        this.customer3FeedBack = 4.0f;
    }

    //    public void intializeEmployee(int employeeNo, String employeeName,float customer1FeedBack, float customer2FeedBack, float customer3FeedBack){
//        this.employeeNo = employeeNo;
//        this.employeeName = employeeName;
//        this.customer1FeedBack = customer1FeedBack;
//        this.customer2FeedBack = customer2FeedBack;
//        this.customer3FeedBack = customer3FeedBack;
//    }

//    public void intializeEmployee(int employeeNo, String employeeName, float customer1FeedBack, float customer2FeedBack){
//        this.employeeNo = employeeNo;
//        this.employeeName = employeeName;
//        this.customer1FeedBack = customer1FeedBack;
//        this.customer2FeedBack = customer2FeedBack;
//    }

    public void calculateAverageFeedback(){
        averageFeedBack = (customer1FeedBack + customer2FeedBack + customer3FeedBack) / 3;
    }

    public void calculateGrade(){
        if (averageFeedBack > 4){
            grade = 'A';
        }else if (averageFeedBack > 3 || averageFeedBack<4){
            grade = 'B';
        }else{
            grade = 'C';
        }
    }

    public void displayInfo(){
        System.out.println("Employee id : " +employeeNo + "\n" +
                "Employee Name : " +employeeName + "\n" +
                "Employee average : " + averageFeedBack + "\n" +
                "Employee grade : " + grade);

    }
}
