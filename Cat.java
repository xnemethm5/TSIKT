public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(name + " mňauká: Mňau, mňau!");
    }

    public void move() {
        System.out.println(name + " sa pohybuje po štyroch labkách.");
    }
}
