import Transport.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Mechanic<Car> petr = new Mechanic<Car>("Петр", "Петров", "Pirelli");
        Sponsor lukoil = new Sponsor("Лукоил", 2_000_000);
        Sponsor michlen = new Sponsor("Мишлен", 3_000_000);

        Car ferrari = new Car("Феррари","488",3.9,"B",TypeOfBody.COUPE);
        ferrari.addDriver(new Driver<Car>("Александр Александрович Александров",true,3));
        ferrari.addMehanic(new Mechanic<Car>("Петр", "Петров", "Pirelli"));
        ferrari.addSponsor(lukoil,michlen);

        Car bugatti = new Car("Бугатти","Вейрон",8.0,"B",TypeOfBody.SEDAN);
        Car mcLaren  = new Car("Макларен","P1",3.8,"B",TypeOfBody.SEDAN);
        Car astonMartin  = new Car("Астон Мартин","DB9",5.9,"B",TypeOfBody.SEDAN);


        Bus ikarus = new Bus("ВАЗ ", "Икарус", 1.7, Capacity.MEDIUM);
        Bus mersedez = new Bus("Мерседес ", "E8", 2.5, Capacity.MEDIUM);
        Bus england = new Bus("Лондон транспорт компани", "Двух этажный", 1.9,Capacity.MEDIUM);
        Bus spain = new Bus("Мадрид транспорт компани", "Рейсовый", 2.0,Capacity.MEDIUM);

        Trucks mersedezBenz = new Trucks("Мерседес","M8",4.0, Weight.N1);
        Trucks skania = new Trucks("Сканиа","l11",5.0,Weight.N1);
        Trucks toyta = new Trucks("Тойта","R8",3.9,Weight.N1);
        Trucks vollkswagen = new Trucks("Фольсваген","V8",5.3,Weight.N1);



         DriverCategoryC<Trucks> vlad = new DriverCategoryC<Trucks>("Влад Владович Владов",true,5);
         vlad.categoryC();
         DriverCategoryD<Bus> dima = new DriverCategoryD<Bus>("Дмитрий дмитриев дмитриевич",true,1);
         dima.categoryD();
         ferrari.doInf(Car.MS);
         ferrari.doInf(Car.BS);
         ferrari.doInf(Car.PS);
         skania.doInf(Car.MS);
         skania.doInf(Car.PS);
         skania.doInf(Car.BS);
         spain.doInf(Car.BS);
         spain.doInf(Car.MS);
         spain.doInf(Car.PS);

        List<Transport>transports = List.of(
                ferrari,
                ikarus,
                mersedezBenz
        );

      for ( Transport transport : transports){
          printinfo(transport);
      }

    }
    private static  void printinfo(Transport transport){
        System.out.println(transport.getBrand() + " " + transport.getModel());
        for ( Driver<?> driver : transport.getDrivers()){
            System.out.println(driver.getFullname());
        }
        for (Sponsor sponsor: transport.getSponsors()){
            System.out.println(sponsor.getName());
        }
        for (Mechanic <?> mechanic : transport.getMechanics()){
            System.out.println( mechanic.getSurname());
        }

    }






}

