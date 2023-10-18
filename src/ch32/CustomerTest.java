package ch32;

public class CustomerTest {

    public static void main(String[] args){

        Customer customer=new Customer();
        customer.buy();
        customer.sell();
        customer.sayHello();

        Buy buyer=customer; // 업 캐스팅
        buyer.buy();

        Sell seller=customer; // 업 캐스팅
        seller.sell();

        buyer.order();
        seller.order();


    }

}
