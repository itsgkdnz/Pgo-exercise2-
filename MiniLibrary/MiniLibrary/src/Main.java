public class Main {
  public static void main(String[] args) {
    Book book1 = new Book("Harry Potter", "J.K. Rowling", 500, true);
    Book book2 = new Book("1984", "George Orwell", 328, true);
    Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", 310, false);

    System.out.println("----- BOOK 1 -----");
    book1.printInfo();
    System.out.println();
    book1.borrow();
    book1.printInfo();
    System.out.println();
    book1.returnBook();
    book1.printInfo();
    System.out.println();

    System.out.println("----- BOOK 2 -----");
    book2.printInfo();
    System.out.println();
    book2.borrow();
    book2.printInfo();
    System.out.println();
    book2.returnBook();
    book2.printInfo();
    System.out.println();

    System.out.println("----- BOOK 3 -----");
    book3.printInfo();
    System.out.println();
    book3.borrow();
    book3.printInfo();
    System.out.println();
    book3.returnBook();
    book3.printInfo();
    System.out.println();

    Reader reader1 = new Reader("Leroy", "Sane", "x150200", 1);
    Reader reader2 = new Reader("Baris Alper", "Yilmaz", "x310210", 2);

    System.out.println("----- READER 1 -----");
    reader1.printData();
    System.out.println();
    reader1.increaseBorrowedCount();
    reader1.printData();// I  have added these extra printInfo sections because I want it to update the books status
    System.out.println();
    reader1.decreaseBorrowedCount();
    reader1.printData();
    System.out.println();

    System.out.println("----- READER 2 -----");
    reader2.printData();
    System.out.println();
    reader2.increaseBorrowedCount();
    reader2.printData();
    System.out.println();
    reader2.decreaseBorrowedCount();
    reader2.printData();
    System.out.println();



    Library library = new Library(5);
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    System.out.println("-------Available Books-------");
    library.printAvailableBooks();
    System.out.println();





  }












}


