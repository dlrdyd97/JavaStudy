package ch60;

public class Mythread implements Runnable{
    @Override
    public void run() {

        for(int i=0;i<200;i++){
            System.out.println(i+"\t");
        }

    }
}
