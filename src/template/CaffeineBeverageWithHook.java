package template;

/**
 * Created by Tudor on 06-10-14.
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring in cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
