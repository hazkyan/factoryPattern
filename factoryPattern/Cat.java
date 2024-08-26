package factoryPattern;

public class Cat implements Pet {
    private static Integer noOfLives;

    public static Integer getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        Cat.noOfLives = noOfLives;
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
    }

    
}
