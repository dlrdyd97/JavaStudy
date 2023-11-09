package ch59;

public class Latte extends Decorator{
    public Latte(Coffee coffee) { // 상위 클래스의  디폴트 생성자가 없으면 하위 클래스가 명시적으로 호출해야 함.
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Milk");
    }
}
