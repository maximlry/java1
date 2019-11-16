public class Animal {

    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK
    }

    public enum FoodKind {
        UNKNOWN,
        HAY,
        CORN
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    @Override
    public String toString() {

        return "I am " + getKind() + ", eat" + getFoodKind();
    }

    public double getWeight() {
        return 1.0;
    }

    public double getFoodCoeff() {
        return 0.02;
    }
}

