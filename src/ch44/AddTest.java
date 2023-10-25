package ch44;

public class AddTest {

    public static void main(String[] args){

//        Add add=(x,y)->{return x+y;};
        Add add=(x,y)-> x+y;

        System.out.println(add.add(2,3));

        MyNumber myNumber=(x,y)->Math.max(x,y);

        System.out.println(myNumber.getMax(1,10));

        StringConcat sc=new StrungConcatImpl();
        sc.makeString("함","형우");

        StringConcat sc1=(s1,s2)->System.out.println(s1+","+s2);
        sc1.makeString("김","익환");

        StringConcat sc2=new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {

            }
        };

    }


}
