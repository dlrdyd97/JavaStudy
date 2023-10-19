package ch35;

public class BookTest {

    public static void main(String[] args){

        Book book=new Book("데미안","헤르만 헤세");
        System.out.println(book); // 원래는 주소를 출력하지만, Book class에서 toString를 재정의 하여 제목과 저자를 출력

    }

}
