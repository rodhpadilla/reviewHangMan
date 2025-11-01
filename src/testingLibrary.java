public class testingLibrary {
    public static void main(String[] args) {
        Library myLibrary = new Library("Pelucho Library");
        Book book1 = new Book("Eragon", "Cristhoper Paulini", "item1234as");
        Book book2 = new Book("Hornet flight", "Ken Follet", "item456as");
        Book book3 = new Book("Africanus", "Santiago Posterguillo", "item789as");
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.displayAllBooks();
        // Find a book
        Book findBook = myLibrary.findBookByTitle("Africanus");
        if (!(findBook == null)) {
            findBook.checkOut();
        }
        // Checkout a busy book
        book3.checkOut();
        // Print everything
        myLibrary.displayAllBooks();
        // Return book
        book3.returnBook();
        // Print again everything
        myLibrary.displayAllBooks();
    }
}
