import Animals.Zoo;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Grande", 2015, "Россия", "желтый", 1.7, "Седан", 4);
        Car bmw = new Car("bmw ", " Z8", 2020, "Германия", "черный ", 3.0, "Седан", 4);
        Car audi = new Car("audi ", "A8 50 L TDI quattro", 2021, "Германия", "черный ", 3.0, "Седан", 4);
        Car kia = new Car("kia ", "Sportage 4 поколения", 2018, "Корея", "красный", 2.4, "Седан", 4);
        Car hundai = new Car("hundai ", " Avante", 2016, "Корея", "оранжевый", 1.6, "Седан", 4);
        allInfCar(lada);
        allInfCar(bmw);
        allInfCar(audi);
        allInfCar(kia);
        allInfCar(hundai);
        System.out.println("");
        Train lastochka = new Train("Ласточка","модель B-901", 2011, "Россия",301, 3500,
                2,"Белорусского вокзала", " станции Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград","D-125",  2019, "Россия",270, 1700,
                3,"Ленинградского вокзала", "  станции Ленинград-Пассажирский", 8);
        allInfTrain(lastochka);
        allInfTrain(leningrad);

        Bus ikarus = new Bus("ВАЗ ", "Икарус", "Белый", 1974, "CCР", 50);
        Bus mersedez = new Bus("Мерседес ", "E8", "черный", 2020, "Германия", 160);
        Bus england = new Bus("Лондон транспорт компани", "Двух этажный", "красный", 2000, "UK", 90);
        System.out.println("");
        allInfBus(ikarus);
        allInfBus(mersedez);
        allInfBus(england);
        Zoo.Zoo();


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
    public static  void allInfTrain(Train train){
        System.out.println(
                "Марка: " +   train.getBrand() + " " + "Модель: " + train.getModel() + " " +
                        " " +" Страна производитель: " +  train.getProductionCountry() + " " + "Год выпуска: " + train.getProductionYear() +
                        " " + "Максимальная скорость: " +  train.getMaxSpeed()+ "км/ч " +" Отходит от "+  train.getNameStationStart()+ " " + " Идет до: "+ train.getNameStatoinFinal()+
                        " "+ "цена : "+ train.getCost() + "  рублей"
                        +", Количество вагонов : " +  train.getNumberOfWagons()+ ", " +   " Время в пути в часах: " + train.getTimeTrip() + " " + train.refill()
        );
    }
    public static  void allInfBus(Bus bus){
        System.out.println(
                "Марка: " +   bus.getBrand() + " " + "Модель: " + bus.getModel() + " " + "цвет: " +  bus.getColor() +
                        " " +" Страна производитель: " +  bus.getProductionCountry() + " " + "Год выпуска: " + bus.getProductionYear() +
                         " Макс скорость: " + bus.getMaxSpeed() + " " + bus.refill()

        );
    }

}

