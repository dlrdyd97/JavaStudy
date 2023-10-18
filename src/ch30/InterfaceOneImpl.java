package ch30;

public class InterfaceOneImpl implements InterfaceOne{

    @Override
    public void sayTest() {
        System.out.println("test1 입니다.");
    }

    @Override
    public void sayTest2() {
        System.out.println("test2 입니다.");
    }

    public void sayTest3(){
        System.out.println("test3 입니다.");
    }
}
