package template;

import java.util.Scanner;

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

    public String getUserInput() {
        String answer;
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();

        if (answer==null) {
            return "no";
        }
        return answer;
    }
}
