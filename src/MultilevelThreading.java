public class MultilevelThreading {
    public static void main(String[] args) {

     //   RunnableMultithreading runnable = new RunnableMultithreading();
        Thread thread1 = new Thread(new RunnableMultithreading("Ping"));
        Thread thread2 = new Thread(new RunnableMultithreading("pong"));

        System.out.println("game start!");
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted");
        }



        System.out.println("game over");

    }
}
