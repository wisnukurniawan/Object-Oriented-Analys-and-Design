package ch1.guitarshop;

/**
 * Created by private on 30/12/2016.
 */
public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type,
                      int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec otehrGuitarSpec) {
        if (builder != otehrGuitarSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.toLowerCase().equals(otehrGuitarSpec.model.toLowerCase())))
            return false;
        if (type != otehrGuitarSpec.type)
            return false;
        if (backWood != otehrGuitarSpec.backWood)
            return false;
        if (topWood != otehrGuitarSpec.topWood)
            return false;
        return true;
    }


}
