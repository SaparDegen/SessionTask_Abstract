public class Cow extends Animal{

    public Cow(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void uniqueness() {
        System.out.println(getName() + " sut beret");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " chep jeit");
    }
}
