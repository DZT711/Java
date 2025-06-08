//Method 1
public class threadEx extends Thread {

    public void run() {
        System.out.println("This message is running in a thread");
    }
    public static void main(String[] args) {
        threadEx obj = new threadEx();
        obj.start();
        System.out.println("This message is running outside the thread");
    }
}
//Method 2
class threadEx2 implements Runnable {
    public void run() {
        System.out.println("This message is running in a thread");
    }
    public static void main(String[] args) {
        threadEx2 obj = new threadEx2();
        Thread t = new Thread(obj);
        t.start();
        System.out.println("This message is running outside the thread");
    }
}

class isAlive implements Runnable {
    static int amount=0;
    public void run() {
        amount++;
    }
    public static void main(String[] args) {
        isAlive obj = new isAlive();
        Thread t = new Thread(obj);
        t.start();
        while (t.isAlive()) {//alive de tranh luồng chính và luồng phụ đều thay đổi nó. 
            System.out.println("Waiting...");
        } // Check if the thread is alive
        System.out.println(amount);
        amount++;
        System.out.println(amount);
        
    }
}