package app.fachinformatiker.threads;

class myTask2 extends Thread{
    @Override
    public void run(){
        for (int doc = 1; doc <= 10; doc++){
            System.out.println("@@ Printing Document #" + doc + " - Printer #2");
        }
    }
}

public class PrinterJob2 {
        public static void main(String[] args) {

            // Job1
            System.out.println("==Application Started==");

            // Job3
            for (int doc = 1; doc <= 10; doc++) {
                System.out.println("^^ Printing Document #" + doc + " - Printer #1");
            }

            // Job4
            System.out.println("==Application Finisched==");
    }
}
