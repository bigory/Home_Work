package task.lesson10.two;

public class Universal extends Car {

    public Universal(String marka, String model, int yearIssue, String color, double engineCapacity) {
        super(marka, model, yearIssue, color, engineCapacity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universal universal = (Universal) o;
        return universal.getYearIssue() == getYearIssue() &&
                Double.compare(universal.getEngineCapacity(), getEngineCapacity()) == 0 &&
                universal.getMarka().equals(getMarka()) &&
                universal.getModel().equals(getModel()) &&
                universal.getColor().equals(getColor());
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + getYearIssue();
        result = (int) (prime * result + getEngineCapacity());
        result = prime * result + getColor().hashCode();
        result = prime * result + getMarka().hashCode();
        result = prime * result + getModel().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\n\nMarka:" + getMarka() + "\n" +
                "Model:" + getModel() + "\n" +
                "YearIssue:" + getYearIssue() + "\n" +
                "Color:" + getColor() + "\n" +
                "EngineCapacity:" + getEngineCapacity() + "\n" +
                "NameClass:" + getClass().getSimpleName() + "\n";
    }
}