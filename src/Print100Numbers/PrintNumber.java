package Print100Numbers;

public class PrintNumber implements Runnable {
    int numberToPrint;

    PrintNumber(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint + " Printed by : " + Thread.currentThread().getName());
    }
}