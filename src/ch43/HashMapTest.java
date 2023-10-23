package ch43;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

    public static void main(String[] args){

        HashMap<String,Integer> hm=new HashMap<>();
        ArrayList<String> al=new ArrayList<>();
        al.add("함형우");
        al.add("김윤수");
        al.add("강태혁");
        al.add("최준수");
        al.add("박태현");
        al.add("박태현");
        al.add("박태현");
        al.add("이재익");
        al.add("이재익");

        for(int i=0;i<al.size();i++){
            hm.put(al.get(i), hm.getOrDefault(al.get(i),0)+1);
        }

        System.out.println(hm);

        for(String fd:hm.keySet()){
            System.out.print(fd);
            System.out.println(hm.get(fd));
        }

        Iterator<String> keys=hm.keySet().iterator();
        while (keys.hasNext()){
            String key=keys.next();
            System.out.println("[Key] : "+key+" [value] : "+hm.get(key));
        }



    }

}
