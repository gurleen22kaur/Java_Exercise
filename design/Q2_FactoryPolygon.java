package com.bootcamp.design_patterns;


import java.util.stream.Stream;

interface PolygonShape
{
    public void showPolygon();
}
class Hexagon implements PolygonShape{

    @Override
    public void showPolygon() {
        System.out.println("Polygon with six sides");
    }
}
class Octagon implements PolygonShape{

    @Override
    public void showPolygon() {
        System.out.println("Polygon with eight sides");
    }
}

class Polygon{
    PolygonShape polygonShape;

    public PolygonShape getPolygonShape() {
        return polygonShape;
    }

    public void setPolygonShape(PolygonShape polygonShape) {
        this.polygonShape = polygonShape;
    }
}
class PolygonFactory{
    static Polygon getPolygonObject(int sides)
    {
        Polygon polygon=new Polygon();
        switch (sides) {
            case 6:
                polygon.setPolygonShape(new Hexagon());
                break;
            case 8:
                polygon.setPolygonShape(new Octagon());
                break;
        }
        return polygon;
    }
}
public class Q2_FactoryPolygon {
    public static void main(String[] args) {
        Polygon polygonHex=PolygonFactory.getPolygonObject(8);
        polygonHex.getPolygonShape().showPolygon();
    }
}

