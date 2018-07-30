package Week12.Ex2;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String[] args) {
        SimpleArray sharedSimpleArray = new SimpleArray(6);

        // Create tasks for writing to array
        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

        // Execute threads
        ExecutorService exService = Executors.newCachedThreadPool();
        exService.execute(writer1);
        exService.execute(writer2);

        exService.shutdown();

        // Safety net for when these threads do not stop executes
        try {
            boolean tasksEnded = exService.awaitTermination(1, TimeUnit.MINUTES);

            if(tasksEnded) {
                System.out.printf("%nContents of SimpleArray:%n");
                System.out.println(sharedSimpleArray);
            }
            else {
                System.out.println("Timed out while waiting for tasks to finish");
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}















