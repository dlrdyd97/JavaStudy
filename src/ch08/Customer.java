package ch08;

public class Customer {

    int tall;
    int weight;
    String name;
    int age;
    String gender;

    public Customer(int tall,int weight,String name,int age,String gender){

        this.tall=tall;
        this.weight=weight;
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

    public void showCustomerInfo(){
        System.out.println("키가 "+tall+" 이고 몸무게가 "+weight+" 킬로인 "+gender+
                "이 있습니다. 이름은 "+name+" 이고 나이는 "+age+"세입니다.");
    }

}
