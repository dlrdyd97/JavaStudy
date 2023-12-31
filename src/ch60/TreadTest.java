package ch60;

public class TreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread()+"start");

        Mythread runnable=new Mythread();

        Thread th1=new Thread(runnable);
        Thread th2=new Thread(runnable);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread()+"end");

        Runnable run=new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };

        run.run();
    }

}
