public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_BLUE +"You are inside Main Thread");
        AnotherThread anotherThread=new AnotherThread();
        new Thread(){//how to ecxecute Anonymous Thread class
            public void run(){
                System.out.println(ThreadColor.ANSI_CYAN+"Inside anonymous thread class");
            }
        }.start();//Though this is executed right after using .start() depends on system executed at random times
        anotherThread.start();//How to execute the thread we created,this can done only once for a particular instance
        System.out.println(ThreadColor.ANSI_BLUE +"Hi in Main Thread again");
    }
}
