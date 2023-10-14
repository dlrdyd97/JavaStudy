package ch15;

public class TexiTest {

    public static void main(String[] args){

        Person personK=new Person("Kim",30000);
        Taxi texihappy=new Taxi("해피");

        personK.takeTaxi(texihappy,10000);

        personK.showPersonInfo();
        texihappy.showTaxiInfo();

    }

}
