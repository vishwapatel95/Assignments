package advance1Day3.assignment31;

import java.util.ArrayList;

public class EmployeeInfo {
    public static void main(String[] args) {
        ArrayList<Integer> employeeId = new ArrayList();
        employeeId.add(1001);
        employeeId.add(1002);

        for (int i = 0;i<employeeId.size();i++){
            int id = employeeId.get(i);
            System.out.println(id);
        }
    }
}
