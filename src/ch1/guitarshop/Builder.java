package ch1.guitarshop;

/**
 * Created by private on 30/12/2016.
 */
public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    public String toString(){
        switch (this){
            case FENDER:    return "Fender";
            case MARTIN:    return "Martin";
            case GIBSON:    return "Gibson";
            case OLSON:     return "Olson";
            case COLLINGS:  return "Collings";
            case PRS:       return "Prs";
            case RYAN:      return "Ryan";
            case ANY:       return "Any";
            default:        return "Unspecified";
        }
    }
}
