public class Cat extends Animal{

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void uniqueness() {
        System.out.println(getName() + " chychkan karmayt");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " whiskas jeit");
    }
}
