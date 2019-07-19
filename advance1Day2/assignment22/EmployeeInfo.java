package advance1Day2.assignment22;

import java.util.Vector;

public class EmployeeInfo {
    public static void main (String[] args) {

        Vector empList = new Vector();
        int empNo=1000;
        for(int count=0;count<5;count++)
        {
            empNo++;
            empList.add(Integer.valueOf(empNo));
        }

        System.out.println("List of Vector data");
        empList.forEach((n) -> System.out.println(n));
    }
}
