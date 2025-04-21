public class GuitarSpec {
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numString;

    public GuitarSpec(String model, Builder builder, Type type, Wood topWood, Wood backWood, int numString) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public String getModel() {
        return model;
    };

    public Type getType() {
        return type;
    };

    public Wood getBackWood() {
        return backWood;
    };

    public Wood getTopWood() {
        return topWood;
    };

    public Builder getBuilder() {
        return builder;
    }

    public int getNumString() {
        return numString;
    }

    public Boolean matches(GuitarSpec guitarSpec) {
        if (builder != guitarSpec.builder) {
            return false;
        }
        if (type != guitarSpec.type){
            return false;

        }
        if (topWood != guitarSpec.topWood){
            return false;
        }

        if (backWood != guitarSpec.backWood){
            return false;
        }
        if (numString != guitarSpec.numString){
            return false;
        }

        if (!model.equals(guitarSpec.model)){
            return false;
        }

        return true;
    }
}
