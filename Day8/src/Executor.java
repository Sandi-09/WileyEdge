import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Executor{
	
   public static void main(final String[] arguments) throws InterruptedException {
      ExecutorService executor = Executors.newCachedThreadPool();
      //ExecutorService executorService = Executors.newFixedThreadPool(2);


      // Cast the object to its class type
      ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

      //Stats before tasks execution
      System.out.println("Largest executions: "
         + pool.getLargestPoolSize());
      System.out.println("Maximum allowed threads: "
         + pool.getMaximumPoolSize());
      System.out.println("Current threads in pool: "
         + pool.getPoolSize());
      System.out.println("Currently executing threads: "
         + pool.getActiveCount());
      System.out.println("Total number of threads(ever scheduled): "
         + pool.getTaskCount());

      //here we fire up two threads simultaneously.
      executor.submit(new Task());
      executor.submit(new Task());

      //Stats after tasks execution
      System.out.println("Core threads: " + pool.getCorePoolSize());
      System.out.println("Largest executions: "
         + pool.getLargestPoolSize());
      System.out.println("Maximum allowed threads: "
         + pool.getMaximumPoolSize());
      System.out.println("Current threads in pool: "
         + pool.getPoolSize());
      System.out.println("Currently executing threads: "
         + pool.getActiveCount());
      System.out.println("Total number of threads(ever scheduled): "
         + pool.getTaskCount());
      System.out.println("Before shutdown");
      executor.submit(new Task());
      executor.shutdown();
      //executor.submit(new Task());
      System.out.println("After shutdown");
   }  

   static class Task implements Runnable {

      public void run() {
         
         try {
            Long duration = (long) (Math.random() * 5);
            System.out.println("Running Task! Thread Name: " +
               Thread.currentThread().getName());
               TimeUnit.SECONDS.sleep(duration);
            System.out.println("Task Completed! Thread Name: " +
               Thread.currentThread().getName());
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}