import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CrawlAnimal dog = new Dog("우리강아지", 5);
        FlyingAnimal eagle = new Bird("매아님", 3);
        MarriedMankind yubunam = new MarriedMan("철수", 30, "영희");


        List<Barkable> barkables = Arrays.asList(dog, eagle);
        List<AnimalCoreBehavior> animalCoreBehaviors = Arrays.asList(dog, eagle, yubunam);
    }

}
