package ch26;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args){

        ArrayList<Customer> customerList=new ArrayList<>();

        Customer customerK=new Customer(10001,"Kim");
        Customer customerH=new Customer(10002,"Ham");
        Customer customerL=new GoldCustomer(10003,"Lee");
        Customer customerP=new GoldCustomer(10004,"Park");
        Customer customerC=new VIPCustomer(10005,"Choi");

        customerList.add(customerK);
        customerList.add(customerH);
        customerList.add(customerL);
        customerList.add(customerP);
        customerList.add(customerC);

        System.out.println("====== 고객 정보 출력 =====");

        for(Customer customer:customerList){
            System.out.println(customer.showCustomerInfo());
            System.out.println();
        }

        System.out.println("===== 할인율과 보너스 포인트 계산 =====");

        int price=10000;
        for(Customer customer:customerList){
            int cost=customer.calcPrice(price);
            System.out.println(customer.getCustomerName()+" 님이 "+cost+" 원 지불하셨습니다.");
            System.out.println(customer.getCustomerName()+" 님의 현재 보너스 포인트는 "+customer.bonusPoint+"점 입니다.");
            System.out.println();
        }

    }

}
