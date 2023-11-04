package ch56;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {

    public static void main(String[] args){

        long millisecond =0; // 걸린시간 기록

        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("fdzz.zip"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.zip"))){

            millisecond = System.currentTimeMillis();

            int i;
            while ((i=bis.read())!=-1){
                bos.write(i);
            }

            millisecond=System.currentTimeMillis() - millisecond;

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(millisecond+" 소요되었습니다.");
        System.out.println("end");

        Socket socket=new Socket();
        try {
            BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
