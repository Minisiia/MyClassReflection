package my_class;

public final class Velociraptor {
    private int age;
    private int weight;
    public String name;

    public Velociraptor() {
    }

    public Velociraptor(int age) {
        this.age = age;
        this.weight = 100;
        this.name = "Unnamed";
    }

    public Velociraptor(int age, int weight) {
        this.age = age;
        this.weight = weight;
        this.name = "Unnamed";
    }

    public Velociraptor(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Yummy-yummy!");
    }
    public void sleep () {
        System.out.println("I'm so sleepy!");
    }

}
