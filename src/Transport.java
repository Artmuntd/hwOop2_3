public abstract class Transport {
       private final String brand;
       private final String model;
       private int maxSpeed;
       private   String color;
       private int  productionYear;
       private final String productionCountry;


       public Transport(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {
              if (brand == "") {
                     this.brand = "default";
              } else {
                     this.brand = brand;
              }
              if (model == "") {
                     this.model = "default";
              } else {
                     this.model = model;
                setColor(color);
              }
              if (productionYear == 0  ) {
                     this.productionYear = 2000;
              } else {
                     this.productionYear= productionYear;
              }

              if (productionCountry == "") {
                     this.productionCountry = "default";
              } else {
                     this.productionCountry = productionCountry;
              }
             if(maxSpeed <=0) {
                    this.maxSpeed = 160;
             } else  {
                    this.maxSpeed = maxSpeed;
             }
       }

       abstract String refill();

       public String getBrand() {
              return brand;
       }



       public String getModel() {
              return model;
       }



       public String getColor() {
              return color;
       }
       public void setColor(String color) {

              if (color == "" && color == null) {
                     this.color = "белый";
              } else {
                     this.color = color;
              }
       }
       public int getProductionYear() {
              return productionYear;
       }

       public String getProductionCountry() {
              return productionCountry;
       }

       public int getMaxSpeed() {
              return this.maxSpeed;
       }

       public void setMaxSpeed(int maxSpeed) {

              this.maxSpeed = maxSpeed;
       }


}
