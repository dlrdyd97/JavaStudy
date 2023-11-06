package ch57;

import java.io.*;

class Person implements Externalizable{
    // implements Serializable
    // 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
    String name;
    String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name+","+job;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeUTF(name);
        out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        name = in.readUTF();
        job=in.readUTF();
    }
}

public class SerializationTest {

    public static void main(String[] args){

        Person personK=new Person("김익환","학생");
        Person personH=new Person("함형우","선생");

        try(FileOutputStream fos=new FileOutputStream("serial.txt")){
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(personK);
            oos.writeObject(personH);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileInputStream fos=new FileInputStream("serial.txt")){
            ObjectInputStream ois=new ObjectInputStream(fos);

            Person pK=(Person)ois.readObject();
            Person pH=(Person)ois.readObject();

            System.out.println(pK);
            System.out.println(pH);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
