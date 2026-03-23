public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void printAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
                System.out.println();
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        Book foundBook = findBookByTitle(title);

        if (foundBook != null) {
            if (foundBook.isAvailable()) {
                foundBook.borrow();
                reader.increaseBorrowedCount();
            } else {
                System.out.println("Book is not available.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(String title, Reader reader) {
        Book foundBook = findBookByTitle(title);

        if (foundBook != null) {
            if (!foundBook.isAvailable()) {
                foundBook.returnBook();
                reader.decreaseBorrowedCount();
            } else {
                System.out.println("Book is already in the library.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}