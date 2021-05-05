package web.model;

public class Car {

    private String manufacturer;
    private int model;
    private String option;

    public Car() {
    }

    public Car(String manufacturer, int model, String option) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.option = option;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model=" + model +
                ", option='" + option + '\'' +
                '}';
    }
}
