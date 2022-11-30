package Animals;

public class Mammals extends  Animals{
    private  String habitat;
    private  int movementSpeed;

    public Mammals(String name, int age, String habitat, int movementSpeed) {
        super(name, age);
        setHabitat(habitat);
        setMovementSpeed(movementSpeed);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed >= 0) {
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = Math.abs(movementSpeed);
        }
    }
    public  void walk(){
        System.out.println("Я гуляю");
    };

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
        return  "Среда обитания: " + habitat + '\'' +
                ", Скорость передвижения: " + movementSpeed + ". " +
                super.toString();
    }
}
