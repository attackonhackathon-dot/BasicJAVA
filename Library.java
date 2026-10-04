import java.util.Scanner;
import java.util.ArrayList;
public class Library{
    public static void main(String[]args){
       Scanner s1=new Scanner(System.in);
      String book_add=s1.nextLine();
      String book_rem=s1.nextLine();
      String book_search=s1.nextLine();
        ArrayList<String> array_book=new ArrayList<>();
        Book obj= new Book("J.K.Rowling","harry potter",1980);
        obj.show();
        Author obj1= new Author("J.K.Rowling",100);
        obj1.bio();
        array_book.add("Harry potter");
        array_book.add("a sage with two horns");
        array_book.add("Dark psychology");
        array_book.add(book_add);
        array_book.remove(book_rem);
        System.out.println(array_book);
        if(array_book.contains(book_search)){
            System.out.println(book_search+"is found");

        }
        else{
            System.out.println("book not found");
        }

    }
    

    }




 class Book{
   public String title;
   public String author;
   public int year;
    Book(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;

    }
    void show(){
        System.out.println("THE Author is"+author);
        System.out.println("title of the book is "+title);
        System.out.println("year of publicaion"+year);
    }

}
class Author{
 public  int number_of_books_;
 public String name;
    Author(String name,int number_of_books_){
        this.number_of_books_=number_of_books_;
        this.name=name;
    }
    void bio(){
        System.out.println("authour name is"+name);
        System.out.println("number of book written"+number_of_books_);
    }
    



}
