package ch46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args){

        List<String> ls=new ArrayList<>();
        ls.add("함형우1");
        ls.add("김윤수12");
        ls.add("강태혁123");

        Stream<String> stream=ls.stream();
        stream.forEach(s-> System.out.println(s));

        System.out.println();

        ls.stream().sorted().forEach(s-> System.out.println(s));
        ls.stream().map(s->s.length()).forEach(n-> System.out.println(n));
        ls.stream().filter(s->s.contains("2")).forEach(s-> System.out.println(s));

        List<Integer> ls2=new ArrayList<>();
        ls2.add(1);
        ls2.add(2);
        ls2.add(3);
        ls2.add(4);
        ls2.add(5);

        Stream<Integer> stream1=ls2.stream();
        int sum=ls2.stream().mapToInt(n->n.intValue()).sum();
        System.out.println(sum);
        Double average=ls2.stream().mapToInt(n->n.intValue()).average().orElse(0);
        System.out.println(average);




    }

}
