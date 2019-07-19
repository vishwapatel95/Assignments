package basic.day4.assignment7;

final class DayScholar extends Student{
    private String residentalAdress;

    public DayScholar() {
    }

    public DayScholar(int studentId, char studentType, String studentName, String residentalAdress) {
        super(studentId, studentType, studentName);
        this.residentalAdress = residentalAdress;
    }

    public void displayDaySDetails(){
        System.out.println("Residental address : " +residentalAdress);
    }
}
