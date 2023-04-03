package Print100Numbers;

public class Client {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            PrintNumber printNumber = new PrintNumber(i);
            Thread t = new Thread(printNumber);
            t.start();
        }
    }
}

//Numbers from 1 to 100 will be printed in random order.


