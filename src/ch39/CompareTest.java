package ch39;

import java.util.Arrays;
import java.util.Collection;

public class CompareTest {

    public static void main(String[] args){


        Collection<Integer> list = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
        System.out.println(Compare.max(list)); // 91

        Collection<String> list2 = Arrays.asList("1","2","3");
        System.out.println(Compare.max(list2)); // ! Error - Number 추상 메서드는 Comparable를 구현하지않았기 때문에 불가능




    }




}
