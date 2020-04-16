public class AnimalCoreDelegator implements AnimalCoreBehavior {

    private String name;
    private int age;

    public AnimalCoreDelegator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void greeting() {
        System.out.println("hello my name is " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
