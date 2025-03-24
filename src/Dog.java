import Interface.Prey;

public class Dog extends Animal {
    public static class Rabbit implements Prey {

        @Override
        public void flee(){
            System.out.println("Rabbit flee");
        }
    }
}
