package Transport;

public class Trucks extends  Transport implements Competing{
    private Weight weight;
   private String categoryC;
    public static final String PS = "заезжаю на Пит-Стоп";
    public static final String BS = "Ставлю лучший круг";
    public static final  String MS = "Достигаю максимальную скорость";

    public Trucks(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
    public void printType() {
        if( weight == null){
            System.out.println("Данных по авто не достаточно");
        } else  {
            String from =  weight.getFrom()==null?"":"от " + weight.getFrom();
            String to =  weight.getTo()==null?"":"до " + weight.getTo();
            System.out.println("Тип Авто: от " + from + " до: " + to);
        }
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

