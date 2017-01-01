package ch1.GuitarShop1;

/**
 * Created by private on 30/12/2016.
 */
public enum Type1 {
    ACOUSTIC, ELECTRIC;

    public String toString(){
        switch (this){
            case ACOUSTIC: return "Acoustic";
            case ELECTRIC: return "Electric";
            default:       return "Unspecified";
        }
    }
}
