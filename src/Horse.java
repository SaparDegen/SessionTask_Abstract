public class Horse extends Animal{

    public Horse(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void uniqueness() {
        System.out.println(getName() + " yldam churkayt");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " arpa jeit");
    }
}
