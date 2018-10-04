
package com.bootcamp.design_patterns;

import java.util.*;

interface Color
{
    public String printColor(String str);
}

class RedColor implements Color {

    @Override
    public String printColor(String str) {
        return "Red";

    }

    @Override
    public String toString() {
        return "Red";
    }
}
class BlueColor implements Color{

    @Override
    public String printColor(String str) {
        return "Blue";
    }
}
abstract class Shape
{
    int side;
    Color color;

    public Shape(int side, Color color) {
        this.side = side;
        this.color = color;
    }
}

class Square extends Shape {
    String specification;
    public Square(String specification, Color color) {
      super(7, color);
        this.specification = specification;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color=" + color +
                ", specification='" + specification + '\'' +
                '}';
    }
}
class Triangle extends Shape{
    String category;

    public Triangle(String category, Color color) {
        super(90, color);
        this.category=category;
   }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", color=" + color +
                ", category='" + category + '\'' +
                '}';
    }
}

public class Q5_Bridge {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       Square square=new Square("Solid",new RedColor());
       System.out.println(square);

        Triangle triangle=new Triangle("Right",new BlueColor());
        System.out.println(triangle);

    }

}


