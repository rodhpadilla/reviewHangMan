import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByTitle(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks(){
        System.out.println("--- Books in " + name + " ---");
        for (Book book : books) {
            book.displayBookInfo();
            System.out.println("/*/*/");
        }
        System.out.println("---------------------");
    }

}
