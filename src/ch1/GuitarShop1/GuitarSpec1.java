package ch1.GuitarShop1;

/**
 * Created by private on 30/12/2016.
 */
public class GuitarSpec1 {
    private Builder1 builder1;
    private Wood1 topWood1;
    private Wood1 backWood1;
    private Type1 type1;
    private String model;

    public GuitarSpec1(Builder1 builder1, String model, Type1 type1, Wood1 topWood, Wood1 backWood) {
        this.builder1 = builder1;
        this.topWood1 = topWood;
        this.backWood1 = backWood;
        this.type1 = type1;
        this.model = model;
    }

    public Builder1 getBuilder1() {
        return builder1;
    }

    public Wood1 getTopWood() {
        return topWood1;
    }

    public Wood1 getBackWood() {
        return backWood1;
    }

    public Type1 getType1() {
        return type1;
    }

    public String getModel() {
        return model;
    }
}
