package Transport;

public abstract class Transport {
       private final String brand;
       private final String model;

       private  double engineVolume;


       public Transport(String brand, String model, double engineVolume) {
              if (brand == "") {
                     this.brand = "default";
              } else {
                     this.brand = brand;
              }
              if (model == "") {
                     this.model = "default";
              } else {
                     this.model = model;

              }
              this.engineVolume=engineVolume;

       }



       public String getBrand() {
              return brand;
       }



       public String getModel() {
              return model;
       }




}
