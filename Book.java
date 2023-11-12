public class Book extends LibraryItem{
  private Person author;
  private String isbn;
  
  public Book(String title, String firstName, String lastName, int day, int mounth, int year, String isbn){
   super(title);
   this.author = new Person(firstName, lastName, day, mounth, year);
   this.isbn = isbn;
  }
  
  
  public Person getAuthor(){
   return author;
  }
  
  public String getISBN(){
   return isbn;
  }
  
  public String toString(){
   System.out.println(super.toString() + " Author: " + getAuthor() );
   return super.toString() + " Author: " + getAuthor() ;
  }
  
  
}