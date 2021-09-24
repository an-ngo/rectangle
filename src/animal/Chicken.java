package animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chicken: Quack quack";
    }

    @Override
    public String howToEat() {
        // TODO Auto-generated method stub
        return "Could be fried";
    }
    
}



