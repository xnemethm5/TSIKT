public class Bird implements Animal {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println(name + " spieva: Pi-pi-pi!");
    }

    @Override
    public void move() {
        System.out.println(name + " lieta vo vzduchu.");
    }
}
