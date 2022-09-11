package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalCage")
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired //
    Timer timer;

    // далее  без изменений
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
    public Timer getTimer() { // ну почти без изменений))
        return timer;
    }
}
