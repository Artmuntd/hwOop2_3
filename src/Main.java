import Transport.*;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Феррари","488",3.9,"B",TypeOfBody.COUPE);
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

