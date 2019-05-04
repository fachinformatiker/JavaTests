package app.fachinformatiker.threads;

public class extendsThread extends Thread {
    public void run(){
        System.out.println("running Thread");
    }
    public static void main(String[] args) {
        extendsThread obj = new extendsThread();
        obj.start();
    }
}
