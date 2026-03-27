public class SleepAndJoin {
 public static void main(String[] args) throws InterruptedException {
 Thread t1 = new Thread(() -> {
 for (int i = 1; i <= 5; i++) {
 System.out.println("Thread 1 - Number: " + i);
 try {
 Thread.sleep(1000);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 System.out.println("Thread 1 - Finished.");
 });
 Thread t2 = new Thread(() -> {
 System.out.println("Thread 2 - Started after Thread 1 finished.");
   for (int i = 1; i <= 3; i++) {
 System.out.println("Thread 2 - Step " + i);
 }
 System.out.println("Thread 2 - Finished.");
 });
 t1.start();
 t1.join(); // Wait for t1 to complete before starting t2
 t2.start();
 }
}
