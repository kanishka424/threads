public class AnotherThread extends  Thread{//Thread is a class

    @Override
    public void run() {//Inside run() we should write what to do
        System.out.println(ThreadColor.ANSI_RED+"Inside AnotherThread Instance");
        try{
        Thread.sleep(3000);
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
        System.out.println(ThreadColor.ANSI_RED+"Im back after 3 seconds");
    }
    }

