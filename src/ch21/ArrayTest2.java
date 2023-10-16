package ch21;

public class ArrayTest2 {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        arr2[0]=10;
        System.arraycopy(arr,1,arr2,1,4);

        for(int fd:arr2){
            System.out.println(fd);

        }

    }

}
