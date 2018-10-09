import java.io.*;

interface library {
    void addBooks(int id,String book_name, String genre);
    void bookIssue(int book_id,String book_name,String student_name);
    void showAllBooks();
}

class Book implements library {

    int id;
    String book_name;
    String student_name;
    String genre;

    public void addBooks(int bid,String bname,String gen)
    {
        id=bid;
        bname=book_name;
        genre=gen;
    }

    public void bookIssue(int bid,String bname,String sname)
    {
        id=bid;
        book_name=bname;
        student_name=sname;
    }

    @Override
    public void showAllBooks() {
        System.out.println("Book is : "+book_name);
        System.out.println("Issued by : "+student_name);
        System.out.println("Genre : "+genre);
    }



}

public class Q1_Library {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.addBooks(1,"Alchemist","Quest");
        b1.bookIssue(1,"Alchemist","Gurleen");
        b1.showAllBooks();

       Book b2 = new Book();
        b2.addBooks(2,"The Notebook","Romannce");
        b2.bookIssue(2,"The Notebook", "Priya");
        b2.showAllBooks();

    }
}


