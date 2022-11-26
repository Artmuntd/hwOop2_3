package Animals;

import java.util.Objects;

public class Birds extends Animals {
    private  String habitat;

    public Birds(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (getName() == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds that = (Birds) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    @Override
    public String toString() {
        return  "Среда обитания: " + habitat  + ". " +

                super.toString();
    }

    public  void  hunt(){};
}
