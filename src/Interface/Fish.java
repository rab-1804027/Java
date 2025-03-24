package Interface;
import com.sun.tools.javac.Main;

public class Fish implements Prey, Predator {

    @Override
    public void flee(){
        System.out.println("Fish Flee");
    }

    @Override
    public void hunt(){
        System.out.println("Fish hunt");
    }
}