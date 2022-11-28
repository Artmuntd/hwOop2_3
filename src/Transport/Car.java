package Transport;

import java.time.LocalDate;

public class Car extends Transport {



    private double engineVolume;

    private String gears;
    private String typeBody;
    public String regNumber;
    private int seatsCount;
    private boolean summerTypes;
    private Key key;
    private Insurance insurance;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gears,
               String typeBody,
               String regNumber,
               int seatsCount,
               boolean summerTypes,
               Key key,
               Insurance insurance,
               int maxSpeed) {
        super(brand,model,color,productionYear,productionCountry, maxSpeed);
        this.engineVolume = engineVolume;

        if (gears == "") {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
        if (typeBody == null) {
            this.typeBody = "седан";
        } else {
            this.typeBody = typeBody;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = new Key();
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }


        this.seatsCount = seatsCount;
        this.summerTypes = summerTypes;
    }

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               double engineVolume,
               String typeBody, int seatsCount) {

        this(brand,
                model,
                engineVolume,
                productionCountry,
                productionYear,
                color,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true,
                new Key(),
                new Insurance(),
                180



        );

    }




    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null || gears == "") {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTypes() {
        return summerTypes;
    }

    public void setSummerTypes(boolean summerTypes) {
        this.summerTypes = summerTypes;
    }


    public String getTypeBody() {

        return typeBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void changeTypes() {
        summerTypes = !summerTypes;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean corretRegNumber() {
        //"х000хх000"
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7])
                || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    @Override
   String refill() {
    return "Ездиет на бензине, дизеле, электричестве";
    }

    public static class Key {
        private final boolean remoteRunEng;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEng, boolean withoutKeyAccess) {
            this.remoteRunEng = remoteRunEng;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEng() {
            return remoteRunEng;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusYears(1);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }

        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkexp() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println(" Оформить страховку");
            }
        }

        public void checkNumb() {
            if (number.length() != 9) {
                System.out.println(" Не правильный номер");
            }
        }
    }

    public static  void allInfCar(Car car){
        System.out.println(
                "Марка: " +   car.getBrand() + " " + "Модель: " + car.getModel() + " " + "цвет: " +  car.getColor() +
                        " " +" Страна производитель: " +  car.getProductionCountry() + " " + "Год выпуска: " + car.getProductionYear() +
                        " " + "Двигатель: " +  car.getEngineVolume()+ " " +" Мест: "+  car.getSeatsCount()+ " " + " Регистранционный номер: "+ car.getRegNumber() +
                        " "+ "Тип кузова: "+ car.getTypeBody() + " "
                        +"КП: " +  car.getGears()+ ", " +  " Макс скорость: " + car.getMaxSpeed() +  " " + (car.isSummerTypes()? "летняя" : "зимняя ") +  " резина" + " "
                        + (car.getKey().isWithoutKeyAccess()? " безключевой" : "ключевой") +  " "
                        + (car.getKey().isRemoteRunEng()? "удаленный " : " не удаленный") + " "
                        + car.getInsurance().getExpireDate() + " " + car.getInsurance().getNumber() + " " + " Срок страховки "+ car.getInsurance().getCost() + " " + car.refill()
        );
    }
}

