package ch41;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args){

        HashSet<String> hs=new HashSet<>();
        hs.add("함형우");
        hs.add("강태혁");
        hs.add("김윤수");
        hs.add("최준수");
        hs.add("강태혁");

        System.out.println(hs);

    }

}
