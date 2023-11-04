package ch54;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

    public static void main(String[] args){

//        FileOutputStream fos=new FileOutputStream("output.txt",true) // true는 append 여부

        try(FileOutputStream fos=new FileOutputStream("output.txt")){

            fos.write(65);
            fos.write(66);
            fos.write(67);
        }catch (IOException e){
            e.printStackTrace();;
        }
        System.out.println("end");

    }

}
