package markdown;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("Alen",250);
        staff[1]=new Employee("Sonja",350);
        staff[2]=new Employee("Robert",450);
        for(Employee e: staff){
            e.raiseSallary(5);
        }
        for (Employee e: staff){
            System.out.println("Employee name is " + e.getEmployeeName() + " Employee salery is " + e.getEmployeeSalary());
        }
    }
}
