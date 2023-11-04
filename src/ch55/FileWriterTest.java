package ch55;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args){

        try(FileWriter fis=new FileWriter("writer.txt")){
            fis.write('A');    // 문자 하나 출력
            char buf[] = {'B','C','D','E','F','G'};

            fis.write(buf); //문자 배열 출력
            fis.write("안녕하세요. 잘 써지네요"); //String 출력
            fis.write(buf, 1, 2); //문자 배열의 일부 출력
            fis.write("65");  //숫자를 그대로 출력


        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
