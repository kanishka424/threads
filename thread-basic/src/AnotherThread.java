public class AnotherThread extends  Thread{//Thread is a class

    @Override
    public void run() {//Inside run() we should write what to do
        System.out.println(ThreadColor.ANSI_RED+"Inside AnotherThread Instance");
    }
}
