public class Fish extends Animal{

    public Fish(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void uniqueness() {
        System.out.println(getName() + " suuda jashayt");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " jem jeit");
    }
}
