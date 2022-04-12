public class MyThread extends Thread {
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("スレッド" + threadName);
    }
}
