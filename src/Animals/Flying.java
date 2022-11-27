package Animals;

import java.util.Objects;

public class Flying  extends  Birds{

    private  String movementType;
    public Flying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        setMovementType(movementType);

    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
            this.movementType = movementType;
        }
    }
    public  void  fly(){};

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    @Override
    public String toString() {
        return
                "Летает или нет" + movementType + ". "+
                        super.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return movementType.equals(flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }


}
