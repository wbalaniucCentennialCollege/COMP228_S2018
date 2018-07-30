package Week12.Ex1;

import java.security.SecureRandom;

public class PrintTask implements Runnable {

    private final static SecureRandom generator = new SecureRandom(); // Help generate a random number
    private final int sleepTime; // Random sleep time for the thread
    private final String taskName; // name of the task

    public PrintTask(String taskName) {
        this.taskName = taskName;

        // Pick a random sleep time between 0 and 5 seconds
        sleepTime = generator.nextInt(5000); // milliseconds
    }

    // The code that is executed when the thread is running
    @Override
    public void run() {
        try {
            System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.printf("%s done sleeping%n", taskName);
    }
}











