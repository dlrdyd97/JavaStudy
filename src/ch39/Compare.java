package ch39;

import java.util.Collection;

public class Compare {
    // 외부로 들어온 타입 E는 Comparable<E>를 구현한 E 객체 이어야 한다.
    public static <E extends Comparable<E>> E max(Collection<E> collection) {
        if(collection.isEmpty()) throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

        E result = null;
        for(E e: collection) {
            if(result == null) {
                result = e;
                continue;
            }

            if(e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }
}
