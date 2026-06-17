public class TaskLinkedList {

    Task head;

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {

            Task current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newTask;
        }

        System.out.println("Task Added");
    }

    // Search Task
    public void searchTask(int id) {

        Task current = head;

        while (current != null) {

            if (current.taskId == id) {

                System.out.println("\nTask Found:");
                System.out.println("ID: " + current.taskId +
                        ", Name: " + current.taskName +
                        ", Status: " + current.status);
                return;
            }

            current = current.next;
        }

        System.out.println("Task Not Found");
    }

    // Display Tasks
    public void displayTasks() {

        Task current = head;

        while (current != null) {

            System.out.println("ID: " + current.taskId +
                    ", Name: " + current.taskName +
                    ", Status: " + current.status);

            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("\nTask Deleted");
            return;
        }

        Task current = head;

        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("\nTask Deleted");
        } else {
            System.out.println("Task Not Found");
        }
    }
}