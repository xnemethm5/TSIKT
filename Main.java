import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Car car = new Car("Toyota");
        Bicycle bicycle = new Bicycle("Mountain");

        car.start();
        bicycle.start();

        car.accelerate(30);
        bicycle.accelerate(15);

        car.brake(20);
        bicycle.brake(5);

        car.stop();
        bicycle.stop();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj číslo mesiaca: ");
        int mesiac = scanner.nextInt();

        RocneObdobia.RocneObdobie obdobie = RocneObdobia.zistiRocneObdobie(mesiac);

        System.out.println("Rocne obdobie pre mesiac " + mesiac + " je " + obdobie);

        Animal dog = new Dog("Miki");
        Animal cat = new Cat("Cica");
        Animal bird = new Bird("Ftak");

        dog.speak();
        dog.move();

        cat.speak();
        cat.move();

        bird.speak();
        bird.move();

        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Rectangle rectangle = new Rectangle(3.0, 6.0);

        System.out.println("Kruh Area: " + circle.calculateArea());
        System.out.println("Stvorec Area: " + square.calculateArea());
        System.out.println("Trojuholnik Area: " + rectangle.calculateArea());
    }

}
