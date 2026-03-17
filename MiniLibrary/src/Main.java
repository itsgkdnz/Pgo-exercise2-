
public class Main{
  public static void main (String[] args){

    Book book1 = new Book("Harry Potter", "J.K. Rowling", 500, true);
    Book book2 = new Book("1984", "George Orwell", 328, true);
    Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);


    book1.printInfo();
    System.out.println();
    book1.borrow();
    System.out.println();
    book1.printInfo();
    System.out.println();
    book1.returnBook();
    System.out.println();
    book1.printInfo();







  }


  }


