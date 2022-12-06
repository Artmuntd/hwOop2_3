package Transport;

public class Car extends Transport implements Competing  {
    private  TypeOfBody typeOfBody;
    private  String categoryB;
     public static final String PS = "заезжаю на Пит-Стоп";
     public static final String BS = "Ставлю лучший круг";
     public static final  String MS = "Достигаю максимальную скорость";
    public Car(String brand, String model, double engineVolume,String categoryB, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.categoryB = categoryB;
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
    public void printType() {
        if( typeOfBody == null){
            System.out.println("Данных по авто не достаточно");
        } else  {
            System.out.println("Тип Авто: " + typeOfBody);
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

