import Transport.*;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Феррари","488",3.9,"B");
        Car bugatti = new Car("Бугатти","Вейрон",8.0,"B");
        Car mcLaren  = new Car("Макларен","P1",3.8,"B");
        Car astonMartin  = new Car("Астон Мартин","DB9",5.9,"B");


        Bus ikarus = new Bus("ВАЗ ", "Икарус", 1.7);
        Bus mersedez = new Bus("Мерседес ", "E8", 2.5);
        Bus england = new Bus("Лондон транспорт компани", "Двух этажный", 1.9);
        Bus spain = new Bus("Мадрид транспорт компани", "Рейсовый", 2.0);

        Trucks mersedezBenz = new Trucks("Мерседес","M8",4.0);
        Trucks skania = new Trucks("Сканиа","l11",5.0);
        Trucks toyta = new Trucks("Тойта","R8",3.9);
        Trucks vollkswagen = new Trucks("Фольсваген","V8",5.3);

         Driver<Car> alex = new Driver<Car>("Александр Александрович Александров",true,3);
         alex.category();
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




    }





}

