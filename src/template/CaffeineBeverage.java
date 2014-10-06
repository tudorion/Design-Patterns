package template;

/**
 * Created by Tudor on 06-10-14.
 */
public abstract class CaffeineBeverage {
    final void prepareReceipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
