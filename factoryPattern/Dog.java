package factoryPattern;

public class Dog implements Pet {
    private static String breed;

    public static String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        Dog.breed = breed;
    }
    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Catching objects that you throw!";
    }
}
