import edible.IEdible;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "chicken: ooo!!!";
    }

    @Override
    public String howToEat() {
        return "chicken: thoc!!!";
    }
}
