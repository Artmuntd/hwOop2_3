package Animals;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    public  void  eat(){};
    public  void  go(){};
    public  void  sleep(){};

    @Override
    public String toString() {
        return "Название животного: " + name + ". Возраст животного: " + age+ " Лет.";
    }
}
