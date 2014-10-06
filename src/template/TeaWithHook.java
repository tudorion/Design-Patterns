package template;

import java.util.Scanner;

/**
 * Created by Tudor on 06-10-14.
 */
public class TeaWithHook extends CaffeineBeverageWithHook{

    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon and honey");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        return (answer.toLowerCase().startsWith("y"));
    }

    private String getUserInput() {
        String answer;
        System.out.println("Would you like lemon and honey with your tea? (y/n)");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();

        if (answer==null) {
            return "no";
        }
        return answer;
    }
}
