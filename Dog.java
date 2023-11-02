public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(name + " šteká: Haf, haf!");
    }

    public void move() {
        System.out.println(name + " sa pohybuje po štyroch labkách.");
    }
}