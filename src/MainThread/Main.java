package MainThread;

public class Main {

    public static void doSomething() {
        System.out.println("Doing something. Printed by : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello world! Printed by : " + Thread.currentThread().getName());
        doSomething();
    }
}