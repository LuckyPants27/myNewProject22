public class Car extends WheelableTransport implements Engineable {

    public Car(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyres();
        checkEngine();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}