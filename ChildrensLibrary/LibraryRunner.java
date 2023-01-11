
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library Library = new Library();
    ArrayList<Book> childrensBooks = Library.getChildrensBooks();
    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    Double minimumRating = 0.0;
    for (Book x : childrensBooks){
      if (x.getAuthor().equals(authorToFind)){
        System.out.println(x.getTitle());
      }
    }
    for (Book x : childrensBooks){
      if (x.getTitle().equals(bookToFind)){
        minimumRating = x.getRating();
      }
    }
    System.out.println(minimumRating);
    for (Book x : childrensBooks){
      if (x.getRating() <= minimumRating){
        System.out.println(x.getTitle() + " by " + x.getAuthor());
      }
    }
  }
}