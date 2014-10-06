package adapter;

/**
 * Created by Tudor on 03-10-14.
 */
public class MallardDuck implements Duck{
    public void quack () {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
