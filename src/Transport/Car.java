package Transport;

public class Car extends Transport implements Competing  {
     private  String categoryB;
     public static final String PS = "заезжаю на Пит-Стоп";
     public static final String BS = "Ставлю лучший круг";
     public static final  String MS = "Достигаю максимальную скорость";
    public Car(String brand, String model, double engineVolume,String categoryB) {
        super(brand, model, engineVolume);
        this.categoryB = categoryB;
    }

    public String getCategoryB() {
        return categoryB;
    }

    public void setCategoryB(String categoryB) {
        this.categoryB = categoryB;
    }

    @Override
    public void startRace() {
        super.startRace();
    }

    @Override
    public void finishRace() {
        super.finishRace();
    }

    @Override
    public String pitStop() {
        return PS;
    }

    @Override
    public String bestCircle() {
        return BS;
    }

    @Override
    public String maxSpeed() {
        return MS;
    }

    @Override
    public void doInf(String inf) {
        switch (inf) {
            case PS:
                System.out.println( getBrand() + " "+ getModel()+ " " + "заезжаю на пит стоп на 7 секунд");
                break;

            case MS:
                System.out.println(getBrand()+ " "+ getModel()+ " " + "Достигаю Максимальной скорости 190");
                break;

            case BS:
                System.out.println(getBrand()+ " "+ getModel()+ " " +"Ставлю лучший круг");
                break;
            default:
                System.out.println("Нет информации");
        }

    }




}

