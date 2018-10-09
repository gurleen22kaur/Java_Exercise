public class Q5_Clone_Copy implements Cloneable {

int id;
String name;

    Q5_Clone_Copy(int i, String s)
    {
        id=i;
        name=s;
    }
    Q5_Clone_Copy(Q5_Clone_Copy cc)
    {
        id=cc.id;
        name=cc.name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[])
    {
        try {

            Q5_Clone_Copy obj1 = new Q5_Clone_Copy(1, "Gurleen");
            Q5_Clone_Copy obj2 = (Q5_Clone_Copy) obj1.clone();
            System.out.println("Id is: "+obj1.id +"  Name is: "+obj1.name);
            System.out.println("Id is: "+obj2.id +" Name is: "+obj2.name+" for cloned object ");

            Q5_Clone_Copy obj3=new Q5_Clone_Copy(obj1);
            System.out.println("Id is: "+obj3.id +" Name is: "+obj3.name+" for copy constructor ");


        }
        catch (CloneNotSupportedException ex)
        {
            System.out.println("Exception arises");
        }
    }





}
