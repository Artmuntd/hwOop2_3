package Transport;

public abstract class Transport {
       private final String brand;
       private final String model;

       private  double engineVolume;


       public Transport(String brand, String model, double engineVolume) {
              if (brand == "" && brand == null && brand.isEmpty() && brand.isBlank()) {
                     this.brand = "Неизвестно";
              } else {
                     this.brand = brand;
              }
              if (model == "" && model == null && model.isEmpty() && model.isBlank()){
                     this.model = "default";
              } else {
                     this.model = model;

              }
             setEngineVolume(engineVolume);

       }



       public String getBrand() {
              return brand;
       }



       public String getModel() {
              return model;
       }

       public double getEngineVolume() {
              return engineVolume;
       }

       public void setEngineVolume(double engineVolume) {
            if( engineVolume >= 0){
                   this.engineVolume = 2.0;
            }
              this.engineVolume = Math.abs(engineVolume);
       }

     public void startRace(){
            System.out.println("Начать Гонку");
     }
     public  void finishRace(){
            System.out.println("Финишировать");
     }
 public  abstract  void printType();
       public abstract boolean service();

}
