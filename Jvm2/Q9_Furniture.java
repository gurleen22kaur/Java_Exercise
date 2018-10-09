public class Q9_Furniture {
    public static void main(String[] args) {
    }
}

abstract class Wooden {
    String type;
    String durability;
    double price;
    String finishing;

    abstract public void fireTest();
}

abstract class Metal {
    String Type;
    double price;
    String finishing;

    abstract  public void stressTest();
}


class Chair_wooden extends Wooden
{
    private double height;
    private double width;
    private String color;
    private String chairType;
    private double makingCost;

    @Override
    public void fireTest() {

    }
}

class Table_Wooden extends Wooden
{
    private double height;
    private double width;
    private String color;
    private String tableType;
    private double cost;

    @Override
    public void fireTest() {

    }
}

class ChairMetallic extends Metal
{
    private double height;
    private double width;
    private String color;
    private String chairType;
    private double cost;

    @Override
    public void stressTest() {

    }
}

class TableMetallic extends Metal
{
    private double height;
    private double width;
    private String color;
    private String chairType;
    private double cost;

    @Override
    public void stressTest() {

    }
}
