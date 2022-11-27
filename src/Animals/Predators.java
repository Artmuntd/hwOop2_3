package Animals;

import java.util.Objects;

public class Predators  extends  Mammals{
    private String typeOfEat;

    public Predators(String name, int age, String habitat, int movementSpeed, String typeOfEat) {
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

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    public  void  hunt(){};
    @Override
    public String toString() {
        return "Тип пищи: " + typeOfEat  + ". " +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return typeOfEat.equals(predators.typeOfEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfEat);
    }




}
