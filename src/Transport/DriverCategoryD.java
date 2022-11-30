package Transport;

public class DriverCategoryD < D extends Bus & Competing> {
    private String fullname;
    private boolean driverLicense;
    private int experience;

    public DriverCategoryD(String fullname, boolean driverLicense, int experience) {
        setFullname(fullname);
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFullname() {
        return fullname;
    }
    public void categoryD(){
        System.out.println("Водитель D управляет автомобилем D и участвует в заезде");
    }
    public void setFullname(String fullname) {
        if (fullname == "" && fullname == null && fullname.isEmpty() && fullname.isBlank()) {
            this.fullname = "Неизвестно";
        } else {
            this.fullname = fullname;
        }
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {

        this.experience = Math.abs(experience);
    }

    public void startRace(){
        System.out.println("Начать Гонку");
    }
    public  void finishRace(){
        System.out.println("Финишировать");
    }


    public void pitStop() {
        System.out.println("Заехать на пит-стоп");
    }
}
