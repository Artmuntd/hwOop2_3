package Transport;

public class Trucks extends  Transport implements Competing{
    private String categoryC;
    public static final String PS = "заезжаю на Пит-Стоп";
    public static final String BS = "Ставлю лучший круг";
    public static final  String MS = "Достигаю максимальную скорость";

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String getCategoryC() {
        return categoryC;
    }

    public void setCategoryC(String categoryC) {
        this.categoryC = categoryC;
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
                System.out.println( getBrand() + " "+ getModel()+ " " + "заезжаю на пит стоп на 35 секунд");;
                break;

            case MS:
                System.out.println(getBrand()+ " "+ getModel()+ " " + "Достигаю Максимальной скорости 140");
                break;

            case BS:
                System.out.println(getBrand()+ " "+ getModel()+ " " +"Ставлю лучший круг");
                break;
            default:
                System.out.println("Нет информации");
        }

    }
}

