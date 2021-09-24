package animal;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal a:animals){
            System.out.println(a.makeSound());
            if(a instanceof Chicken){
                Edible edible = (Chicken) a;
                System.out.println(edible.howToEat());
                System.out.println(((Chicken)a).howToEat());
                System.out.println(edible.equals(a));
            }
        }
    }
}
