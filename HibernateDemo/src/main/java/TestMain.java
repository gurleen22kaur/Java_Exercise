import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;


public class TestMain {

    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        //create
        Author author=new Author();

        author.setFirstName("David");
        author.setLastName("Beckham");
        author.setAge(29);

        Address address=new Address();
        address.setStreetNumber(1);
        address.setLocation("Rani Bagh");
        address.setState("Delhi");

        author.setAddress(address);

        author.setSubjects(Arrays.asList("MAthematics","Biology","Chemistry"));

        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(author);

        //one-one
        /*Book book=new Book();
        book.setBookName("The Notebook");
        author.setBook(book);
        session.save(book);
        */

        //one-many undidirectional
        /*Book book=new Book();
        book.setBookName("The Notebook");
        Book book1=new Book();
        book1.setBookName("The Alchemist");
        author.getBook().add(book);
        author.getBook().add(book1);
        session.save(book);
        session.save(book1);
        */


        //one-many bidirectional and without table
       /* Book book=new Book();
        book.setBookName("The Notebook");
        book.setAuthor(author);
        Book book1=new Book();
        book1.setBookName("The Alchemist");
        book1.setAuthor(author);
        author.getBook().add(book);
        author.getBook().add(book1);
        session.save(book);
        session.save(book1);*/



        /*Author auth=new Author();
        auth.setFirstName("John");
        auth.setLastName("Von");
        auth.setAge(33);
        auth.setDOB(new Date());
        auth.setAddress(address);

        auth.setSubjects(Arrays.asList("English","Hindi","Punjabi"));
        session.save(auth);*/

        /*Author a=new Author();
        a.setFirstName("Tom");
        a.setLastName("Goyal");
        a.setAge(21);
        a.setDOB(new Date());


        Author b=new Author();
        b.setFirstName("Harry");
        b.setLastName("Dhawan");
        b.setAge(22);
        b.setDOB(new Date());


        Author c=new Author();
        c.setFirstName("Larry");
        c.setLastName("Khan");
        c.setAge(23);
        c.setDOB(new Date());*/


        //session.save(a);
        //session.save(b);
        //session.save(c);
        transaction.commit();
        session.close();





        //sessionFactory.close();

        /*//read
        Session session1=sessionFactory.openSession();
        Transaction transaction1=session1.beginTransaction();
        Author author1=session1.get(Author.class,1);
        transaction1.commit();
        session1.close();
        System.out.println(author1);

        //update
        Session session2=sessionFactory.openSession();
        Transaction transaction2=session2.beginTransaction();
        Author author2=session2.get(Author.class,1);
        author2.setAge(32);
        session2.update(author2);
        transaction2.commit();
        session2.close();
        System.out.println(author2);

        //delete
        Session session3=sessionFactory.openSession();
        Transaction transaction3=session3.beginTransaction();
        Author author3=session3.get(Author.class,2);
        session3.delete(author3);
        transaction3.commit();
        session3.close();

*/


    }
}
