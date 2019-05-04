package app.fachinformatiker.threads;

public class implementsRunnable implements Runnable{
    public void run(){
        System.out.println("running Thread");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new implementsRunnable());
        t.start();
    }
}
