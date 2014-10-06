package adapter;

/**
 * Created by Tudor on 03-10-14.
 */
public class WildTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("I fly a short distance");
    }

    @Override
    public void gobble() {
        System.out.println("");
    }
}
