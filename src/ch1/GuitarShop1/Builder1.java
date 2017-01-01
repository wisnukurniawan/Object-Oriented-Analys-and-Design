package ch1.GuitarShop1;

/**
 * Created by private on 30/12/2016.
 */
public enum Builder1 {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    public String toString(){
        switch (this){
            case ANY: return "Any";
            case COLLINGS: return "Collings";
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case MARTIN: return "Martin";
            case OLSON: return "Olson";
            case PRS: return "Prs";
            case RYAN: return "Ryn";
            default: return "Unspecified";
        }
    }

}
