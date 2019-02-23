package task.lesson10.two;

public abstract class Car {

    private String marka;
    private String model;
    private int yearIssue;
    private String color;
    private double engineCapacity;

    public Car(String marka, String model, int yearIssue, String color, double engineCapacity) {
        this.marka = marka;
        this.model = model;
        this.yearIssue = yearIssue;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }
}