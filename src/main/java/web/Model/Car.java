package web.Model;

public class Car {
    private String carModel;
    private int age;
    private int gosNumber;

    public Car(String carModel, int age, int gosNumber) {
        this.carModel = carModel;
        this.age = age;
        this.gosNumber = gosNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(int gosNumber) {
        this.gosNumber = gosNumber;
    }
}
