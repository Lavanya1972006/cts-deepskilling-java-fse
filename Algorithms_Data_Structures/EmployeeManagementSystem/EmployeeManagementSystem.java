public class EmployeeManagementSystem {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    // Add Employee
    public static void addEmployee(Employee employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee Added Successfully.");
        } else {
            System.out.println("Employee Array is Full.");
        }
    }

    // Search Employee
    public static Employee searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    public static void traverseEmployees() {

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public static void deleteEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Rahul", "Developer", 50000));
        addEmployee(new Employee(102, "Anita", "Tester", 45000));
        addEmployee(new Employee(103, "Karan", "Manager", 70000));

        System.out.println("\nEmployee Records:");
        traverseEmployees();

        System.out.println("\nSearching Employee ID 102:");
        Employee employee = searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee Not Found.");
        }

        System.out.println("\nDeleting Employee ID 102:");
        deleteEmployee(102);

        System.out.println("\nEmployee Records After Deletion:");
        traverseEmployees();
    }
}