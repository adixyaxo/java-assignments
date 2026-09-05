public class ShapeManagementApp {

  public void ShapeManagementApp_main(){
    Shape[] arr = new Shape[5];
    arr[0] = new Circle(10);
    arr[1] = new Square(-10);
    arr[2] = new Circle(20);
    arr[3] = new Rectangle(-10,15);
    arr[4] = new Rectangle(1,-20);
    for (int i = 0; i < arr.length; i++) {
      arr[i].Display();
    }
    System.out.println("Total Perimeter: "+Shape.totalPerimeter);
  }

  private abstract class Shape {

    private String name;

    public abstract double area();

    public abstract double perimeter();

    Shape(String name) {
      this.name = name;
    }

    public static double totalPerimeter = 0;

    public void Display(){
      System.out.println("Name: "+name);
      System.out.println("Area: "+area());
      System.out.println("Perimeter: "+perimeter());
      System.out.println();
    }
  }

  private class Circle extends Shape {
    private double radius;

    @Override
    public double area() {
      return 3.14 * radius * radius;
    };

    @Override
    public double perimeter() {
      return 2 * 3.14 * radius;
    };

    Circle(double radius) {
      super("Circle");
      if (radius < 0) {
        this.radius = -radius;
      } else {
        this.radius = radius;
      }
      totalPerimeter += perimeter();
    }
  }

  private class Square extends Shape {
    private double side;

    @Override
    public double area() {
      return side * side;
    };

    @Override
    public double perimeter() {
      return 4 * side;
    };

    Square(double side) {
      super("Square");
      if (side < 0) {
        this.side = -side;
      } else {
        this.side = side;
      }
      totalPerimeter += perimeter();
    }
  }

  private class Rectangle extends Shape {
    private double height;
    private double width;

    @Override
    public double area() {
      return height * width;
    };

    @Override
    public double perimeter() {
      return 2 * (height + width);
    };

    Rectangle(double height, double width) {
      super("Rectangle");
      if (height < 0) {
        this.height = -height;
      } else {
        this.height = height;
      }
      if (width < 0) {
        this.width = -width;
      }
      else{
        this.width = width;
      }
      totalPerimeter += perimeter();
    }
  }

}
