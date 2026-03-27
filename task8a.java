class ExtendThread extends Thread {
 public void run() {
 for (int i = 1; i <= 5; i++) {
 System.out.println("Thread (extends): "
 + Thread.currentThread().getName() + " - Iteration " + i);
 }
 }
}
class ImplRunnable implements Runnable {
 public void run() {
 for (int i = 1; i <= 5; i++) {
 System.out.println("Thread (runnable): "
 + Thread.currentThread().getName() + " - Iteration " + i);
 }
 }
}
public class CreateThreads {
 public static void main(String[] args) {
 ExtendThread t1 = new ExtendThread();
 t1.setName("Thread-Extend");
 t1.start();
   Thread t2 = new Thread(new ImplRunnable());
 t2.setName("Thread-Runnable");
 t2.start();
 }
}
