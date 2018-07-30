package Week12.Ex4;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {

    private final ArrayBlockingQueue<Integer> buffer;

    public BlockingBuffer() {
        buffer = new ArrayBlockingQueue<Integer>(1);
    }

    @Override
    public void blockingPut(int value) throws InterruptedException {
        buffer.put(value); // Places a value in our buffer
        System.out.printf("%s%2d\t%s%d%n", "Produce writes ", value, "Buffer cells occupied: ", buffer.size());
    }

    @Override
    public int blockingGet() throws InterruptedException {
        int readValue = buffer.take();
        System.out.printf("%s %2d\t%s%d%n", "Consume reads ", readValue, "Buffer cells occupied: ", buffer.size());

        return readValue;
    }
}
