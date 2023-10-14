package ch15;

public class Person {

    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTexi(Texi texi,int money){
        texi.take(money);
        this.money-=money;
    }

    public void showPersonInfo(){
        System.out.println(name+"님의 잔액은 "+money+"원 입니다.");
    }

}
