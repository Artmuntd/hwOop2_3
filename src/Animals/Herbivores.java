package Animals;

import java.util.Objects;

public class Herbivores  extends Mammals{
    private String typeOfEat;

    public Herbivores(String name, int age, String habitat, int movementSpeed, String typeOfEat) {
        super(name, age, habitat, movementSpeed);
        setTypeOfEat(typeOfEat);
    }

    public String getTypeOfEat() {
        return typeOfEat;
    }

    public void setTypeOfEat(String typeOfEat) {
        if (typeOfEat != null && !typeOfEat.isEmpty() && !typeOfEat.isBlank()) {
            this.typeOfEat = typeOfEat;
        }
    }
    public  void  graze(){};

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public String toString() {
        return "Тип пищи: " + typeOfEat  + ". " +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return typeOfEat.equals(that.typeOfEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfEat);
    }


}
