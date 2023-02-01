package chp4;

public class Book {
    String title;
    String author;

    void show(){
        System.out.println((title + " " + author));
    }
    public Book(){
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book(String title){
        this(title, "작자 미상");
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String args[]){
        Book book = new Book("어린왕자", "생택쥐 페리");
        Book lovebook = new Book("춘향전");
        Book emptyBook = new Book();
        lovebook.show();
        lovebook = book;
        lovebook.show();
        book = lovebook;
        book.show();

    }
}
