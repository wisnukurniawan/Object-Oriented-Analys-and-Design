package ch2;

/**
 * Created by private on 01/01/2017.
 */
public class DogDoor {
    private boolean open;
    public DogDoor(){
        open = false;
    }

    public void open(){
        System.out.println("The dog door opens");
        open = true;
    }

    public void close(){
        System.out.println("The dog door closes");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
