package Transport;

public class Train  extends Transport {
    private int cost;
    private int timeTrip;
    private  String nameStationStart;
    private  String nameStatoinFinal;
    private  int numberOfWagons;



    public Train(String brand, String model, int productionYear, String productionCountry, int maxSpeed, int cost, int timeTrip, String nameStationStart, String nameStatoinFinal, int numberOfWagons) {
        super(brand, model, "", productionYear, productionCountry, maxSpeed);
        this.cost = cost;
        this.timeTrip = timeTrip;
        this.nameStationStart = nameStationStart;
        this.nameStatoinFinal = nameStatoinFinal;
        this.numberOfWagons = numberOfWagons;
    }



    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getNameStationStart() {
        return nameStationStart;
    }

    public void setNameStationStart(String nameStationStart) {
        this.nameStationStart = nameStationStart;
    }

    public String getNameStatoinFinal() {
        return nameStatoinFinal;
    }

    public void setNameStatoinFinal(String nameStatoinFinal) {
        this.nameStatoinFinal = nameStatoinFinal;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public static  void allInfTrain(Train train){
        System.out.println(
                "Марка: " +   train.getBrand() + " " + "Модель: " + train.getModel() + " " +
                        " " +" Страна производитель: " +  train.getProductionCountry() + " " + "Год выпуска: " + train.getProductionYear() +
                        " " + "Максимальная скорость: " +  train.getMaxSpeed()+ "км/ч " +" Отходит от "+  train.getNameStationStart()+ " " + " Идет до: "+ train.getNameStatoinFinal()+
                        " "+ "цена : "+ train.getCost() + "  рублей"
                        +", Количество вагонов : " +  train.getNumberOfWagons()+ ", " +   " Время в пути в часах: " + train.getTimeTrip() + " " + train.refill()
        );
    }

    @Override
  String refill() {
   return      "Ездиет на дизеле";

    }
}
