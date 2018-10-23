import javax.persistence.*;
import java.util.*;

@Entity
public class Author {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.TABLE)
    //@Column(name = "Author_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //@Column(name = "First_Name")
    private String firstName;

    //@Transient
    private String lastName;
    private int age;

    //@Temporal(TemporalType.DATE)
    private Date DOB;

    @ElementCollection
    List<String> Subjects=new LinkedList<>() ;

    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }



    //for one to one
   /* @OneToOne
    @JoinColumn(name = "Join_Col_Book")
    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/
    //


    //one-many unidirectional and bidirectional
    /*@OneToMany
    @JoinTable(joinColumns = @JoinColumn(name="author_id")
            ,inverseJoinColumns = @JoinColumn(name = "book_id"))
    List<Book> Book= new ArrayList<>();

    public List<Book> getBook() {
        return Book;
    }

    public void setBook(List<Book> book) {
        Book = book;
    }*/

    //one to many without additional table
    /*@OneToMany(mappedBy = "author")
    List<Book> Book= new ArrayList<>();

    public List<Book> getBook() {
        return Book;
    }

    public void setBook(List<Book> book) {
        Book = book;
    }*/

    @Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
