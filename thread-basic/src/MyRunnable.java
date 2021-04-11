public class MyRunnable implements Runnable{//in video 3.runnable and Thread,how to create runnable classes for threads
    @Override
    public void run(){
        System.out.println(ThreadColor.ANSI_PURPLE+"Inside MyRunnable");
    }
}
