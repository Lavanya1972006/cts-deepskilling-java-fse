public class TaskManagementSystem {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(101, "Design UI", "Pending");
        taskList.addTask(102, "Develop Backend", "In Progress");
        taskList.addTask(103, "Testing", "Pending");

        System.out.println("\nTask List:");
        taskList.displayTasks();

        taskList.searchTask(102);

        taskList.deleteTask(102);

        System.out.println("\nTask List After Deletion:");
        taskList.displayTasks();
    }
}