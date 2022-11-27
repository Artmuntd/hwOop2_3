import Animals.Zoo;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Grande", 2015, "Россия", "желтый", 1.7, "Седан", 4);
        Car bmw = new Car("bmw ", " Z8", 2020, "Германия", "черный ", 3.0, "Седан", 4);
        Car audi = new Car("audi ", "A8 50 L TDI quattro", 2021, "Германия", "черный ", 3.0, "Седан", 4);
        Car kia = new Car("kia ", "Sportage 4 поколения", 2018, "Корея", "красный", 2.4, "Седан", 4);
        Car hundai = new Car("hundai ", " Avante", 2016, "Корея", "оранжевый", 1.6, "Седан", 4);
        Car.allInfCar(lada);
        Car.allInfCar(audi);
        Car.allInfCar(bmw);
        Car.allInfCar(kia);
        Car.allInfCar(hundai);
        System.out.println("");
        Train lastochka = new Train("Ласточка","модель B-901", 2011, "Россия",301, 3500,
                2,"Белорусского вокзала", " станции Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград","D-125",  2019, "Россия",270, 1700,
                3,"Ленинградского вокзала", "  станции Ленинград-Пассажирский", 8);
        Train.allInfTrain(lastochka);
        Train.allInfTrain(leningrad);

        Bus ikarus = new Bus("ВАЗ ", "Икарус", "Белый", 1974, "CCР", 50);
        Bus mersedez = new Bus("Мерседес ", "E8", "черный", 2020, "Германия", 160);
        Bus england = new Bus("Лондон транспорт компани", "Двух этажный", "красный", 2000, "UK", 90);
        System.out.println("");
        Bus.allInfBus(ikarus);
        Bus.allInfBus(mersedez);
        Bus.allInfBus(england);
        Zoo.Zoo();


    }





}

