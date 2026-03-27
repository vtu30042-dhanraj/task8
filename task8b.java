public class ThreadLifecycle {
 public static void main(String[] args) throws InterruptedException {
 Thread thread = new Thread(() -> {
 try {
 System.out.println("Inside thread - State: RUNNING");
 Thread.sleep(500);
 System.out.println("After sleep - State: RUNNING (resumed)");
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 });
 System.out.println("1. State after creation : " + thread.getState());
 thread.start();
 System.out.println("2. State after start() : " + thread.getState());
 Thread.sleep(100);
 System.out.println("3. State during sleep() : " + thread.getState());
 thread.join();
 System.out.println("4. State after finish : " + thread.getState());
 }
}
