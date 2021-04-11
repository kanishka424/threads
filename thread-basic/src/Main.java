public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_BLUE +"You are inside Main Thread");
        AnotherThread anotherThread=new AnotherThread();
        anotherThread.setName("++Another++");
        new Thread(){//how to ecxecute Anonymous Thread class
            public void run(){
                System.out.println(ThreadColor.ANSI_CYAN+"Inside anonymous thread class");
            }
        }.start();//Though this is executed right after using .start() depends on system executed at random times
        anotherThread.start();//How to execute the thread we created,this can done only once for a particular instance
        Thread anonymousRunnableThread=new Thread(
            new  MyRunnable(){
                @Override
                public void run(){
                    System.out.println(ThreadColor.ANSI_PURPLE+"Inside anonymouss runnable thread");
                }
            }
        );

                Thread runnableThread=new Thread(anonymousRunnableThread);
        runnableThread.start();
//        MyRunnable myRunnable=new MyRunnable();//how to pass a runnable instance to a thread and start the thread
//        Thread runnableThread=new Thread(myRunnable);
//        runnableThread.start();
        System.out.println(ThreadColor.ANSI_BLUE +"Hi in Main Thread again");
    }
}
