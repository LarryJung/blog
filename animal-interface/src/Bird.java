public class Bird implements FlyingAnimal {

    private AnimalCoreBehavior animalCoreBehavior;
    private Barkable barkDelegator;

    public Bird(String name, int age) {
        this.animalCoreBehavior = new AnimalCoreDelegator(name, age);
        this.barkDelegator = new BarkDelegator("끼약 끼약");
    }

    @Override
    public void fly() {
        System.out.println("푸드드득");
    }

    @Override
    public void bark() {
        barkDelegator.bark();
    }

    @Override
    public void greeting() {
        animalCoreBehavior.greeting();
    }

    @Override
    public String getName() {
        return animalCoreBehavior.getName();
    }

    @Override
    public int getAge() {
        return animalCoreBehavior.getAge();
    }
}
