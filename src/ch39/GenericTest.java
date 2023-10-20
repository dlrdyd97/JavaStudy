package ch39;

import java.util.ArrayList;

public class GenericTest {

    public static void main(String[] args){

        Apple[] arr={
                new Apple(),
                new Apple()
        };

        FruitBox<Apple> box=new FruitBox<>(arr);

        Apple apple=box.getFruit(0);


        FruitBox<Apple>[] box2=new FruitBox[10];

        ArrayList<Number> fdzz=new ArrayList<>();
        fdzz.add(1.0);
        System.out.println(fdzz.get(0));

    }

}
