package ch49;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=null;
        try {
            fis=new FileInputStream("a.txt");
            System.out.println("read");
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return; // 리턴이 존재해도 finally는 항상 실행됨
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }
            }
            System.out.println("항상 수행 됩니다.");
        }
        System.out.println("여기도 수행됩니다");

//        try(FileInputStream fis=new FileInputStream("a.txt")) {
//            System.out.println("read");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        System.out.println("end");

    }

}
