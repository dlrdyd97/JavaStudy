package ch16;

public class EmployeeTest {

    public static void main(String[] args){

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Kim");


        Employee employeeKang = new Employee();
        employeeKang.setEmployeeName("강태혁");

        System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId());
        System.out.println(employeeKang.getEmployeeName()+"님의 사번은 "+employeeKang.getEmployeeId());
    }

}
