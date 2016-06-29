package example9_5;

public class MyClass extends Thread {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    static volatile int i1, i2, j1, j2, k1, k2;

    public void run() { while (true) { doit(); check(); } }

    void doit() {
        synchronized(lock1) { i1++; }
        j1++;
        synchronized(lock2) { k1++; k2++; }
        j2++;
        synchronized(lock1) { i2++; }
    }

    void check() {
    	int x =i1;   	int y =i2; int q=j1; int w=j2; int g = k1; int r=k2;
    	
        if (i1 != i2) System.out.println("i");
        if (j1 != j2) System.out.println("j");
        if (k1 != k2) System.out.println("k");
    }

    public static void main(String[] args) {
        new MyClass().start();
        new MyClass().start();
    }
}
