package Interface;

import com.sun.tools.javac.Main;

public class Hawk implements Predator {

    @Override
    public void hunt(){
        System.out.println("Rabbit hunt");
    }
}
