package template;

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

        System.out.println("Would you like lemon and honey with your tea? (y/n)");
        String answer = getUserInput();

        return (answer.toLowerCase().startsWith("y"));
    }


}
