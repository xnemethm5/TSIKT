public class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
