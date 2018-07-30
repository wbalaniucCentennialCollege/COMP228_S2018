package Week12.Ex1;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {
    public static void main(String[] args) {
        // Declare 3 threads and run them
        PrintTask task1 = new PrintTask("Task1");
        PrintTask task2 = new PrintTask("Task2");
        PrintTask task3 = new PrintTask("Task3");

        System.out.println("Starting executor");

        // Create ExecutorService to manage threads
        ExecutorService exService = Executors.newCachedThreadPool();

        // Start the 3 threads
        exService.execute(task1);
        exService.execute(task2);
        exService.execute(task3);

        exService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}















