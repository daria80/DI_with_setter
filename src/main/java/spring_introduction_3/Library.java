package spring_introduction_3;

public class Library {

    private Book book;

    public Library() {
        System.out.println("Book bean is created");
    }

    public void setBook(Book book) {
        System.out.println("Class Library: set book");
        this.book = book;
    }

    public void giveNeedBook() {
        System.out.println("Thank you, your book is about ");
        book.give();
    }
}
