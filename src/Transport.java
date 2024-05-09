public abstract class Transport {

    private String modelName;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Transport(String modelName) {
        this.modelName = modelName;
    }

    public abstract void check();
}
