package web.model;


public class Car {
    private String mark;
    private String model;
    private int power;

    public Car() {
    }

    public Car(String mark, String model, int power) {
        this.mark = mark;
        this.model = model;
        this.power = power;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
