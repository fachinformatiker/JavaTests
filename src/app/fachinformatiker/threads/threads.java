package app.fachinformatiker.threads;

public class threads extends Thread {
    public void run(){
        System.out.println("running Thread");
    }
    public static void main(String[] args) {
        threads obj = new threads();
        obj.start();
    }
}
