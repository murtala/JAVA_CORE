package example9_2;

class Counter extends Thread {

    private int currentValue;

    public Counter(String threadName) {
        super(threadName);                       // (1) Initialize thread.
        currentValue = 0;
        System.out.println(this);
        start();                                 // (2) Start this thread.
    }

    public int getValue() { return currentValue; }
    public void run() {                          // (3) Override from superclass.
        try {
        	System.out.println("run()");
            while (currentValue < 5) {
                System.out.println(getName() + ": " + (currentValue++));
                Thread.sleep(250);               // (4) Current thread sleeps.
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println("Exit from thread: " + getName());
    }
}

public class Client {
    public static void main(String[] args) {

        System.out.println("Method main() runs in thread " +
                Thread.currentThread().getName());   // (5) Current thread

        Counter counterA = new Counter("job A"); // (6) Create a thread.
        Counter counterB = new Counter("job B"); // (7) Create a thread.

        System.out.println("Exit from main() method.");
    }
}
