package Transport;

public class Sponsor {
    private  String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public  void toSponsorRace () {
        System.out.printf("Спор \"%s\" проспонсировал заезд на %d%n", name, amount);
    }
}
