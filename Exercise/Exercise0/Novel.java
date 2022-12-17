public class Novel {
    private String title;
    private String author;
    private int numPages;
    private String genre;
    private String publisher;
    private boolean isHardcover;
    private String bookName;
    private int bookId;
    public static void main(String[] args) {
      Book book3 = new Book("Pride and Prejudice", "Jane Austen", 279, "Fiction", "Thomas Egerton", true, "Book 3", 3);
  }
    
    public Novel(String title, String author, int numPages, String genre, String publisher, boolean isHardcover, String bookName, int bookId) {
      this.title = title;
      this.author = author;
      this.numPages = numPages;
      this.genre = genre;
      this.publisher = publisher;
      this.isHardcover = isHardcover;
      this.bookName = bookName;
      this.bookId = bookId;
      System.out.println("Book instance created with name: " + bookName + " and ID: " + bookId);
    }
    
    public void read() {
      System.out.println("Reading book...");
    }
    
    public void turnPage() {
      System.out.println("Turning page...");
    }
    
    public void closeBook() {
      System.out.println("Closing book...");
    }

 
  }
  

  