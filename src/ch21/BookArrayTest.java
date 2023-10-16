package ch21;

public class BookArrayTest {

    public static void main(String[] args){

        Book[] library=new Book[5];
        Book[] copyLibrary = new Book[5]; // 얕은복사
        Book[] copyLibrary2 = new Book[5]; // 깊은복사

        for(int i=0;i<library.length;i++){
            library[i]=new Book("태백산맥"+String.valueOf(i),"조정래");
        }

        for(int i=0;i< library.length;i++){ // 깊은 복사
//            copyLibrary2[i]=new Book();
//            copyLibrary2[i].setTitle(library[i].getTitle());
//            copyLibrary2[i].setAuthor(library[i].getAuthor());
            copyLibrary2[i]=new Book(library[i].getTitle(),library[i].getAuthor());
        }


        for(int i=0;i< library.length;i++){
            System.out.println(library[i]);
            library[i].showBookInfo();
        }

        System.arraycopy(library,0,copyLibrary,0,5); // 얕은복사
        System.out.println("========copy library========");

        for(Book book:copyLibrary){
            book.showBookInfo();
        }

        library[0].setTitle("이것이 MYSQL 이다");
        library[0].setAuthor("우재남");

        System.out.println();
        System.out.println("얕은복사");
        System.out.println("===== library[0] 변경 =====");
        copyLibrary[0].showBookInfo();

        System.out.println();
        System.out.println("깊은복사");
        copyLibrary2[0].showBookInfo();


    }

}
