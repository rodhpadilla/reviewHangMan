public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isCheckedOut;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            System.out.println(title + " has been checked out");
            isCheckedOut = true;
        } else {
            System.out.println(title + " is already checked out! Check again");
        }
    }

    public void returnBook(){
        if (isCheckedOut) {
            System.out.println("Thanks for returning the book " + title);
            isCheckedOut = false;
        } else {
            System.out.println(title + " is not valid for return");
        }
    }

    public void displayBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        String status = isCheckedOut ? "Checked Out" : "Available";
        System.out.println("Status: " + status);
    }
}
