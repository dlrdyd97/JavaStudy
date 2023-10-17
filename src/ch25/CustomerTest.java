package ch25;

public class CustomerTest {

    public static void main(String[] args){

        Customer customerK=new Customer(10001,"김해피");
        customerK.bonusPoint=1000;
        System.out.println(customerK.showCustomerInfo());

        VIPCustomer customerH=new VIPCustomer(10002,"함행복");
        customerH.bonusPoint=10000;
        System.out.println(customerH.showCustomerInfo());

        int priceK=customerK.calcPrice(10000);
        int priceH=customerH.calcPrice(10000);

        System.out.println(customerK.showCustomerInfo()+" 지불금액은 "+priceK+" 원 입니다.");
        System.out.println(customerH.showCustomerInfo()+" 지불금액은 "+priceH+" 원 입니다.");

        Customer test=new VIPCustomer(123,"test");
        test.bonusPoint=10000;
        int priceTest=test.calcPrice(10000);
        System.out.println(test.showCustomerInfo()+" 지불금액은 "+priceTest+"원 입니다.");


    }

}
