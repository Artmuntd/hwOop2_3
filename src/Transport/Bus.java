package Transport;

public class Bus  extends Transport {
    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }
    public static  void allInfBus(Bus bus){
        System.out.println(
                "Марка: " +   bus.getBrand() + " " + "Модель: " + bus.getModel() + " " + "цвет: " +  bus.getColor() +
                        " " +" Страна производитель: " +  bus.getProductionCountry() + " " + "Год выпуска: " + bus.getProductionYear() +
                        " Макс скорость: " + bus.getMaxSpeed() + " " + bus.refill()

        );
    }
    @Override
    String refill() {
       return "Ездиет на дизеле и бензине";
    }
}
