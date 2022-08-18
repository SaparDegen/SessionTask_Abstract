public class Dog extends Animal{

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void uniqueness() {
        System.out.println(getName() + " uy kaitarat");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " et jeit");
    }
}
