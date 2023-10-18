package ch30;

public interface InterfaceConcept {

    // 자바에서는 다중 상속을 할 경우 메소드 출처의 모호성 등 여러가지 문제가 발생할 수 있어 자바에서는 클래스를 통한
    // 다중 상속은 지원하지 않는다. 하지만 다중 삭속의 이점을 버릴 수는 없기에 자바에서는 인터페이스라는 것을
    // 통해 다중 상속을 지원하고 있다.

    float pi=3.14F; // 모든 변수는 상수로 선언됨. public static final
    void makeSomething(); // 모든 메서드가 추상 메서드로 선언됨. public abstract
}
