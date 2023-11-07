package ch58;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf=new RandomAccessFile("random.txt","rw");

        rf.writeInt(100);
        System.out.println("pos : "+rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("pos : "+rf.getFilePointer());
        rf.writeUTF("여래신장"); // string 는 마지막에 null ( 2 byte ) 이 들어감
        System.out.println("pos : "+rf.getFilePointer());

        rf.seek(0);

        int i=rf.readInt();
        double d=rf.readDouble();
        String str=rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

    }

}
