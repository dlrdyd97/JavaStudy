package ch23;

public class CustomerTest {

    public static void main(String[] args){

        Customer customerK=new Customer();
        customerK.setCustomerName("김해피");
        customerK.setCustomerID(10001);
        customerK.bonusPoint=1000;
        System.out.println(customerK.showCustomerInfo());

        VIPCustomer customerH=new VIPCustomer();
        customerH.setCustomerName("함행복");
        customerH.setCustomerID(10002);
        customerH.bonusPoint=10000;
        System.out.println(customerH.showCustomerInfo());

    }

}
