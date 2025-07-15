public class RunnableMultithreading implements Runnable{

    private final String text;

    RunnableMultithreading(String text){
        this.text = text;
    }
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
               // System.out.println(Thread.currentThread().getName()+ " "+ i);
                System.out.println(text);
            }
            catch(InterruptedException e) {
                System.out.println("thread was interrupted");
            }


        }
    }
}
