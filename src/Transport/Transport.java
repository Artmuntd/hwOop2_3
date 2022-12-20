package Transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
       private final String brand;
       private final String model;

       private  double engineVolume;

       private List<Driver<?>> drivers = new ArrayList<>();

       private final  List<Mechanic<?>> mechanics = new ArrayList<>();

      private final  List<Sponsor> sponsors = new ArrayList<>();

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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>...driver){
          this.drivers.addAll(Arrays.asList(driver));
    }
    public void addMehanic(Mechanic<?>...mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors){
      this.sponsors.addAll(Arrays.asList(sponsors));
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

    public abstract void  repair();

}
