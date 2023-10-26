class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.height = height;
        this.width = width;
    }


    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (height + width);
    }
}
