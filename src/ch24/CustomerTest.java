package ch24;

public class CustomerTest {

    public static void main(String[] args){

        Customer customerK=new Customer(10001,"김해피");
        customerK.bonusPoint=1000;
        System.out.println(customerK.showCustomerInfo());

        VIPCustomer customerH=new VIPCustomer(10002,"함행복");
        customerH.bonusPoint=10000;
        System.out.println(customerH.showCustomerInfo());

        Customer vc=new VIPCustomer(123,"test"); // 업 캐스팅

    }

}
