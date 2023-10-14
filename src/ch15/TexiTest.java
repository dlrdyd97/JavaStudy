package ch15;

public class TexiTest {

    public static void main(String[] args){

        Person personK=new Person("Kim",30000);
        Taxi taxihappy=new Taxi("해피");

        personK.takeTaxi(taxihappy,10000);

        personK.showPersonInfo();
        taxihappy.showTaxiInfo();

    }

}
