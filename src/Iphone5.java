public class Iphone5 implements Telephone{
    String model;
    String battery;
    String langitude;
    String latitude;


    public void setModel(String model) {
        this.model = model;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setLangitude(String langitude) {
        this.langitude = langitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Iphone5(String model, String battery, String langitude, String latitude) {
        this.model = model;
        this.battery = battery;
        this.langitude = langitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Iphone5{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", langitude='" + langitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBattery() {
        return null;
    }

    @Override
    public String getLangitude() {
        return null;
    }

    @Override
    public String getLatitude() {
        return null;
    }
}
