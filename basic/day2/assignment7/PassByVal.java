package basic.day2.assignment7;

public class PassByVal {
    public static void main (String args[]){
        int sId = 25;
        PassByVal val = new PassByVal();
        System.out.println(sId);

        Student stu= new Student();
        val.passTheValueMethod(stu,5);
    }


    public void passTheValueMethod(Student student, int sId)
    {
        student.setStudentId(sId);
        System.out.println("The sId are " + sId);
    }
}
