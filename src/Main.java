import edible.IEdible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2] ;
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (Animal animals: animal) {
            System.out.println(animals.makeSound());
            if (animals instanceof Chicken){
                IEdible iEdible = (Chicken) animals;
                System.out.println(iEdible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}