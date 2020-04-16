public class AnimalIdentity implements AnimalCoreBehavior {

    private String name;
    private int age;
    private Species type;

    @Override
    public String greeting() {
        switch (type) {
            case CAT:
                return "hello my name cat";
            case DOG:
                return "hello my name dog";
            default:
                throw new RuntimeException();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public AnimalIdentity(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
