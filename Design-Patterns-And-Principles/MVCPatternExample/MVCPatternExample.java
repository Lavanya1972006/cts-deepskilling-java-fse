public class MVCPatternExample {

    public static void main(String[] args) {

        Student student = new Student("Lavanya", "101", "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        controller.setStudentName("Lavanya M");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}