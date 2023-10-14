package ch14;

public class TakeTransTest {

    public static void main(String[] args){

        Student studentK=new Student("Kim",5000);
        Student studentH=new Student("Ham",10000);

        Bus bus100=new Bus(100);
        Subway subway99=new Subway(99);

        studentK.takeBus(bus100);
        studentH.takeSubway(subway99);

        studentK.showInfo();
        bus100.showBusInfo();

        studentH.showInfo();
        subway99.showSubwayInfo();

    }

}
