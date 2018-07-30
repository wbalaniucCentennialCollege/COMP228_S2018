package Week12.Ex4;

import java.security.SecureRandom;

public class Producer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;

    public Producer(Buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    @Override
    public void run() {
        int sum = 0;

        for(int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.blockingPut(count);
                sum += count;
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Produces is done. Terminating thread");
        System.out.println("Sum of all values is: " + sum);
    }
}













