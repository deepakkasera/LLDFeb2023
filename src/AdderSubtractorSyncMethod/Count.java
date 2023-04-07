package AdderSubtractorSyncMethod;

public class Count {
    private int value = 0;

    //Only one thread can execute the synchronized method at any given point of time.
    public synchronized void incValue(int offSet) {
        value += offSet;
    }

    public int getValue() {
        return value;
    }
}
