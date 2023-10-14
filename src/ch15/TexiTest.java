package ch15;

public class TexiTest {

    public static void main(String[] args){

        Person personK=new Person("Kim",30000);
        Texi texihappy=new Texi("해피");

        personK.takeTexi(texihappy,10000);

        personK.showPersonInfo();
        texihappy.showTexiInfo();

    }

}
