
public class Static_details {
    static int age;

    static {
        age=23;
        System.out.println("Firstname=Gurleen");

    }

    static void lastName()
    {
        System.out.println("Lastname=Kaur");
    }

        public static void main(String args[])
        {
            lastName();
            System.out.println("Age is:" +Static_details.age);
        }
}
