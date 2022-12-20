package Transport;

public class Bus  extends Transport implements  Competing{
     private Capacity capacity;
      private  String categoryD;
    public static final String PS = "заезжаю на Пит-Стоп";
    public static final String BS = "Ставлю лучший круг";
    public static final  String MS = "Достигаю максимальную скорость";
    public Bus(String brand, String model, double engineVolume ,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public String getCategoryD() {
        return categoryD;
    }

    public void setCategoryD(String categoryD) {
        this.categoryD = categoryD;
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
        if( capacity == null){
            System.out.println("Данных по авто не достаточно");
        } else  {
            System.out.println("Тип Авто: " + capacity);
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " Диагностика не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " Починен");
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
                System.out.println( getBrand() + " "+ getModel()+ " " + "заезжаю на пит стоп на 15 секунд");
                break;

            case MS:
                System.out.println(getBrand()+ " "+ getModel()+ " " + "Достигаю Максимальной скорости 110");
                break;

            case BS:
                System.out.println(getBrand()+ " "+ getModel()+ " " +"Ставлю лучший круг");
                break;
            default:
                System.out.println("Нет информации");
        }

    }
}
