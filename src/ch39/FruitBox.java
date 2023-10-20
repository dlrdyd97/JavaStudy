package ch39;

class Apple {}
class Banana {}

class FruitBox<T> {
    // 모든 클래스 타입을 받기 위해 최고 조상인 Object 타입으로 설정
    private T[] fruit;

    public FruitBox(T[] fruit) {
        this.fruit = fruit;
    }

    public T getFruit(int index) {
        return fruit[index];
    }

    public T addBox(T x, T y) {
        return x;
    }

    // 독립적으로 타입 할당 운영되는 제네릭 메서드
    public static <T> T addBoxStatic(T x, T y) {
        return x;
    }
}