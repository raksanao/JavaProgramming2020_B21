package day44_Inheritance.ShapesTask;

public class Triangle  extends Shape{

    public double height, base;

    public Triangle( double height, double base) {
        super("Triangle");
        this.height = height;
        this.base = base;
    }

}
