package Week12.Ex4;

import java.util.concurrent.*;

public class BlockingBufferTest {
    public static void main(String[] args) throws InterruptedException {
        // Create thread pool
        ExecutorService exService = Executors.newCachedThreadPool();

        // Create our blocking buffer object
        Buffer sharedLocation = new BlockingBuffer();

        // Execute threads
        exService.execute(new Producer(sharedLocation));
        exService.execute(new Consumer(sharedLocation));

        exService.shutdown();
        exService.awaitTermination(1, TimeUnit.MINUTES);
    }

}

