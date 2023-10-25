package ch46;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntArrayStreamTest {

    public static void main(String[] args){

        int[] arr={1,2,3,4,5};

        for(int num:arr){
            System.out.print(num);
        }

        System.out.println();

        Arrays.stream(arr).forEach(n-> System.out.print(n)); // 인자를 하나씩 꺼내서 , sout 해라

        System.out.println();

        IntStream is = Arrays.stream(arr);
        System.out.println(is.max());
        is=Arrays.stream(arr); // 재사용하려면 초기화해야함. 초기화 안하면 에러 발생
        System.out.println(is.average().orElse(0));
        is=Arrays.stream(arr);
        System.out.println(is.sum());


        int[] numbers={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        is=Arrays.stream(numbers);
        System.out.println(is.average().orElse(0));

        Integer[] arr2={1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr2);
        int fdzz=Arrays.stream(arr2).mapToInt(n->n.intValue()).sum();
        System.out.println(fdzz);

        IntStream fd=Arrays.stream(arr);
        System.out.println(fd.max());


    }

}
