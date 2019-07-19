package advance1Day3.assignment30;

import java.util.*;

public class EmployeeInfo {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmployeeId(11212);
        employee.setEmployeeName("Patel");
        Calendar calendar = new GregorianCalendar(2000,Calendar.JANUARY,25);
        employee.setDateOfBirth(calendar);


        Employee employee2 = new Employee();
        employee.setEmployeeId(112124);
        employee.setEmployeeName("Patel");
        Calendar calendar1 = new GregorianCalendar(2000,Calendar.JANUARY,25);
        employee.setDateOfBirth(calendar);
//
//        Employee employee3 = new Employee();
//        employee.setEmployeeId(11212);
//        employee.setEmployeeName("Patel");
//        Calendar calendar2 = new GregorianCalendar(2000,Calendar.JANUARY,25);
//        employee.setDateOfBirth(calendar);
//
//        Employee employee4 = new Employee();
//        employee.employeeId = (11212);
//        employee.setEmployeeName("Patel");
//        Calendar calendar3 = new GregorianCalendar(2000,Calendar.JANUARY,25);
//        employee.setDateOfBirth(calendar);

        list.add(employee);

        Arrays.asList(list);
//        list.add(employee2);
//        list.add(employee3);
//        list.add(employee4);

//        ListIterator<String > listIterator = list.listIterator();

//        while (listIterator.hasNext()){



//        for (Employee employee3 : list){
//            System.out.println(employee3.employeeId + "\n" +
//                                employee3.employeeName + "\n" +
//                                employee3.getDateOfBirth());



}
}
