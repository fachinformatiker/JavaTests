package app.fachinformatiker.threads;

class MyTask{
    void executeTask(){
        for (int doc = 1; doc <= 10; doc++){
            System.out.println("@@ Printing Document #" + doc + " - Printer #2");
        }
    }
}

public class PrinterJob1 {
    public static void main(String[] args) {

        // Job1
        System.out.println("==Application Started==");

        // Job2
        MyTask task = new MyTask();
        task.executeTask();

        // Job3
        for (int doc = 1; doc <= 10; doc++){
            System.out.println("^^ Printing Document #" + doc + " - Printer #1");
        }

        // Job4
        System.out.println("==Application Finisched==");
    }
}
