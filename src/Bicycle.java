public class Bicycle extends WheelableTransport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyres();
    }
}