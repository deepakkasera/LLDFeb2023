package AdderSubtractorAtomicInteger;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        //Read more about join.
        t1.join();
        //System.out.println("Doing something.... " + count.value);
        t2.join();

        System.out.println(count.value);
    }
}
