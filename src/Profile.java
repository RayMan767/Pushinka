public class Profile {

    private String name;
    private double weight;
    private int age;

    public Profile(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void feedCat() {
        weight += 0.1;
    }

    public String getName() {

        return name;
    }

    public double getWeight() {

        return weight;
    }

    public int getAge() {
        return age;
    }
}
