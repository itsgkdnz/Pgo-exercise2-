public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;
    public Book(String title, String author, int pageCount, boolean available) {

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }
public void printInfo(){
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("pageCount: " + pageCount);
    System.out.println("available: " + available);
}
public void borrow(){
        if(available){
            available = false;
            System.out.println("Book is borrowed  ");
        }else{
            System.out.println("Book is not available.");
        }
}
public void returnBook(){
        if(!available){
            available = true;
            System.out.println("Book returned.");

        }else {
            System.out.println("Book is already in the library");
        }
}
public boolean isAvailable(){
        return available;
    }
    public String getTitle() {
return title;

    }
    }
