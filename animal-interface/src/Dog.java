public class Dog implements CrawlAnimal {

    private AnimalCoreBehavior animalCoreBehavior;
    private Crawlable crawlDelegator;
    private Barkable barkDelegator;

    public Dog(String name, int age) {
        animalCoreBehavior = new AnimalCoreDelegator(name, age);
        crawlDelegator = new CrawlDelegator();
        barkDelegator =  new BarkDelegator("왈왈");
    }

    @Override
    public void bark() {
        barkDelegator.bark();
    }

    @Override
    public void crawl() {
        crawlDelegator.crawl();
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
