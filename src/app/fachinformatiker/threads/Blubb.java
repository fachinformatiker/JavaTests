package app.fachinformatiker.threads;

public class Blubb {
    boolean flag = false;

    public synchronized void first() {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ich bin der erste");
        flag = true;
        notify();
    }

    public synchronized void second() {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ich bin der zweite");
        flag = false;
        notify();
    }
}
