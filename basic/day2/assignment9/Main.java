package basic.day2.assignment9;

public class Main {
    public static void main(String[] args) {

        Student studentOne = new Student('D',"Bony","Thomas");
        studentOne.displayDetails(studentOne);

        System.out.println();
        Student studentTwo = new Student('H',"Dinil","Bose");
        studentTwo.displayDetails(studentOne);
    }


}
