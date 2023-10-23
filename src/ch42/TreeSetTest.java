package ch42;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args){

        TreeSet<String> ts=new TreeSet<>();
        ts.add("함형우");
        ts.add("김윤수");
        ts.add("박태현");

        for(String fd:ts){
            System.out.println(fd);
        }

        System.out.println(ts);

    }

}
