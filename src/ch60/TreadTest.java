package ch60;

public class TreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        Mythread th1=new Mythread();
        th1.start();

        Mythread th2=new Mythread();
        th2.start();

    }

}
