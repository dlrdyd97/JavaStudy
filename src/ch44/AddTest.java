package ch44;

public class AddTest {

    public static void main(String[] args){

        Add add=(x,y)->{return x+y;};

        System.out.println(add.add(2,3));

        MyNumber myNumber=(x,y)->{
            return Math.max(x,y);
        };

        System.out.println(myNumber.getMax(1,10));

        StringConcat sc=new StrungConcatImpl();
        sc.makeString("함","형우");

        StringConcat sc1=(s1,s2)->{
            System.out.println(s1+","+s2);
        };
        sc1.makeString("김","익환");

    }

}
