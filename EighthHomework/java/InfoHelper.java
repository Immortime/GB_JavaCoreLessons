public class InfoHelper {
    String city;
    String date;
    String weather;
    String temperature;

    public InfoHelper(String city, String date, String weather, String temperature) {
        this.city = city;
        this.date = date;
        this.weather = weather;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "InfoHelper{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", weather='" + weather + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
