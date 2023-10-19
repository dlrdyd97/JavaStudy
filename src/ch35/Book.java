package ch35;

public class Book {

    private String title; // 제목
    private String author; // 저자

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title+","+author;
    }
}
