package HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World. Printed by: " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        System.out.println("Hello World. Printed by: " + Thread.currentThread().getName());
    }
}
