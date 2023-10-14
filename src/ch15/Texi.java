package ch15;

public class Texi {

    String name;
    int money;

    public Texi(String name) {
        this.name = name;
    }

    public void take(int money){
        this.money+=money;
    }

    public void showTexiInfo(){
        System.out.println(name+"택시 수입은 "+money+"원 입니다.");
    }

}
