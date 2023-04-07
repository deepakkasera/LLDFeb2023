package AdderSubtractorSync;

public class Adder implements Runnable {
    private Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            //synchronized block will acquire the lock on Count object.
            //that is only thread will be able to access the count variable at any given point of time.
            //MUTEX over count object.
            synchronized (count) { //lock is on the count object.
                count.value += i;
            } //release the lock over count.
        }
    }
}
