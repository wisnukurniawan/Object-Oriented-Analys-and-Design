package ch1;

/**
 * Created by private on 30/12/2016.
 */
public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    
    public String toString(){
        switch (this){
            case ADIRONDACK:        return "Adirondack";
            case ALDER:             return "Alder";
            case CEDAR:             return "Cedar";
            case BRAZILIAN_ROSEWOOD:return "Brazillian Rosewood";
            case COCOBOLO:          return "Cocobolo";
            case INDIAN_ROSEWOOD:   return "Indian Rosewood";
            case MAHOGANY:          return "Mahogany";
            case MAPLE:             return "Maple";
            case SITKA:             return "Stika";
            default:                return "Unspecified";
        }
    }

}
