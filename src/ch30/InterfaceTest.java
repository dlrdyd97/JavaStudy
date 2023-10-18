package ch30;

public class InterfaceTest {

    public static void main(String[] args){

        InterfaceOne one=new InterfaceOneImpl();
        one.sayTest();
        one.sayTest2();

        InterfaceOneImpl interfaceOne;
        if(one instanceof InterfaceOneImpl){
            interfaceOne=(InterfaceOneImpl) one;
            interfaceOne.sayTest3();
        }


    }

}
