package Animals;



public class Zoo {
    public static void Zoo() {
     Herbivores jiraf = new Herbivores("Жирав", 5,"Африка - на суше",24,"Травоядный");
        System.out.println(jiraf.toString());
        Herbivores Hourse = new Herbivores("Лошадь",10,"Америка,Африка,Европа,Азия - на суше",40, "Травоядный");
        System.out.println(Hourse.toString());
        Herbivores gazelle = new Herbivores("Газель", 3, "Африка - на суше", 25, "Травоядный");
       System.out.println(gazelle.toString());
        Predators bear = new Predators("Медведь",20, "Везде - на суше",20, "Хищник");
       System.out.println(bear.toString());
        Predators tiger = new Predators("Тигр",10, "Везде - на суше",30, "Хищник");
       System.out.println(tiger.toString());
        Predators hiena = new Predators("Гиена",1, "Везде - на суше",23, "Хищник");
       System.out.println(hiena.toString());
        Amphibians frog = new Amphibians("Лягушка", 1,"В воде");
       System.out.println(frog.toString());
        Amphibians snakeFreshwater = new Amphibians("Уж", 7,"В воде");
       System.out.println(snakeFreshwater.toString());
        Flying falcon = new Flying("Сокол",25,"Скалы","Летает");
       System.out.println(falcon.toString());
        Flying albatross = new Flying("Альбатрос",13,"У моря","Летает");
       System.out.println(albatross.toString());
        Flying gull= new Flying("Чайка",10,"У моря","Летает");
       System.out.println(gull.toString());
        NoFly dodo = new NoFly("Додо",3,"Лес","Не летает");
       System.out.println(dodo.toString());
        NoFly peacock = new NoFly("Павлин",9,"Африка","Не летает");
       System.out.println(peacock.toString());
        NoFly penguin = new NoFly("Пингвин",11,"Север","Не летает");
        System.out.println(penguin.toString());

    }
}