package com.bootcamp.design_patterns;


class User{
    private String type;

    public User(String type)
    {
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
interface FetchDetails
{
     void fetch();
}

class StudentDetails implements FetchDetails {
    protected User user;

    public StudentDetails(User user) {
        this.user = user;
    }

    @Override
    public void fetch() {
        System.out.println("Student is pursuing MCA");
    }
}

class StudentProxy extends StudentDetails
{

    public StudentProxy(User user) {
        super(user);
    }
    public void fetch()
    {
        if(user.getType()=="admin") {
            System.out.println("Displaying student details");
            super.fetch();
        }


        else {
            System.out.println("Unauthorized user");

        }
    }

}

public class Q8_Proxy {
    public static void main(String[] args) {
        User Mohit=new User("admin");
        FetchDetails fetchDetails=new StudentProxy(Mohit);
        fetchDetails.fetch();

        /*User q1=new User("noe");
        FetchDetails fetchDetails1=new StudentProxy(q1);
        fetchDetails1.fetch();*/
    }
}
