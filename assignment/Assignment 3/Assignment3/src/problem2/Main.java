package problem2;

public class Main {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("J.K. Rowling", "Harry Potter", 500, 1997, true);
        Book book2 = new Book("George Orwell", "1984", 328, 1949, false);
        Book book3 = new Book("J.R.R. Tolkien", "The Hobbit", 310, 1937, true);

        // Test Book methods
        System.out.println("Book 1 ID: " + book1.getId());
        System.out.println("Book 1 Title: " + book1.getTittle());
        System.out.println("Book 1 Author: " + book1.getAuthor());

        // Create a Library
        Library library = new Library("NY Public Library", "New York", "NY");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Total books in the library: " + library.totalBooks());

        // Lend out a book
        Book lentBook = library.lendBook(1); // Lending Book 1
        if (lentBook != null) {
            System.out.println("Lent out book: " + lentBook.getTittle());
        } else {
            System.out.println("Book is not available to lend.");
        }

        // Return a book
        if (library.returnBook(1)) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book return failed.");
        }

        // Check books in stock
        Book[] inStock = library.booksInStock();
        System.out.println("Books in stock: ");
        for (Book book : inStock) {
            System.out.println(book.getTittle());
        }
    }
}
