public interface Wheelable {

     void updateTyre();

     int getWheelsCount();

     void setWheelsCount(int wheelsCount);

     default void updateTyres() {
          for (int i = 0; i < getWheelsCount(); i++) {
               updateTyre();
          }
     }
}
