package template;

import java.util.Scanner;

/**
 * Created by Tudor on 06-10-14.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            System.out.println("Coffee with sugar and milk");
            return true;
        } else {
            System.out.println("Coffee WITHOUT sugar and milk");
            return false;
        }
    }

    private String getUserInput() {
        String answer;
        System.out.println("Would you like milk and sugar with your coffee? (y/n)");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();

        if (answer==null) {
            return "no";
        }
        return answer;
    }

}
