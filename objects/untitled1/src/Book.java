public class Book {
    private String title;// название книги
    private Author author;// автор книги
    private int publicationYear;// год публикации
   public Book(String title, Author author, int publicationYear) {
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
   }

   public String getTitle() {
        return title;
   }
   public Author getAuthor() {
        return author;
   }
   public int getPublicationYear () {
        return publicationYear;
   }

   public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
   }
}