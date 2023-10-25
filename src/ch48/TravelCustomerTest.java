package ch48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TravelCustomerTest {

    public static void main(String[] args){

        TravelCustomer kim=new TravelCustomer("김익환",27,10000);
        TravelCustomer ham=new TravelCustomer("함형우",27,20000);
        TravelCustomer kang=new TravelCustomer("강태혁",27,30000);

        List<TravelCustomer> customerList=new ArrayList<>();
        customerList.add(kim);
        customerList.add(ham);
        customerList.add(kang);

        System.out.println("고객 명단 출력");
        customerList.stream().map(s->s.getName()).forEach(n-> System.out.println(n));
//        customerList.stream().forEach(s-> System.out.println(s.getName()));

        System.out.println("여행비용");
        System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("20세 이상 고객");
        customerList.stream().filter(s->s.getAge()>=20).map(l->l.getName()).sorted().forEach(n-> System.out.println(n));

    }

}
