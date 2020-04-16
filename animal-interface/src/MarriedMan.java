public class MarriedMan implements MarriedMankind {

    private AnimalCoreBehavior animalCoreBehavior;
    private CrawlAndWalkable crawlAndWalkDelegator;
    private String sideName;

    public MarriedMan(String name, int age, String sideName) {
        this.animalCoreBehavior = new AnimalCoreDelegator(name, age);
        this.crawlAndWalkDelegator = new CrawlAndWalkDelegator("유난히 빨리 걷는다", "유난히 느리가 뛴다.");
        this.sideName = sideName;
    }

    @Override
    public void speak() {
        System.out.println("안녕 난 말할수 있다.");
    }

    @Override
    public void study() {
        System.out.println("공부중");
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

    @Override
    public void crawl() {
        crawlAndWalkDelegator.crawl();
    }

    @Override
    public void tellMeYourSide() {
        System.out.println("hello my " + this.sideName);
    }

    @Override
    public void walk() {
        crawlAndWalkDelegator.walk();
    }

    @Override
    public void run() {
        crawlAndWalkDelegator.run();
    }
}
