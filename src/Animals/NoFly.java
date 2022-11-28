package Animals;

import java.util.Objects;

public class NoFly extends  Birds{
    private  String movementType;
    public NoFly(String name, int age, String habitat, String movementType) {
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

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    public  void  walk(){
        System.out.println("Я не умею летать");
    };

    @Override
    public void hunt() {
        super.hunt();
    }



    @Override
    public String toString() {
        return
                "Летает или нет: " + movementType + ". "+
                        super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NoFly NoFly = (NoFly) o;
        return movementType.equals(NoFly.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }


}

