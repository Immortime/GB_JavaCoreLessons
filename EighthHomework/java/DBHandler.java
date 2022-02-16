import org.sqlite.JDBC;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHandler {

    private final static String PATH_DB =
            "jdbc:sqlite:C:\\Users\\nikis\\IdeaProjects\\Homework7\\src\\main\\resources\\WeatherTable.db";

    private Connection connection;

    public DBHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(PATH_DB);
    }

    public void addSQLStaff() throws SQLException, IOException {
        PreparedStatement statement = this.connection.prepareStatement(" " +
                "INSERT INTO WeatherThing('city', 'date', 'weather', 'temperature') " +
                "VALUES(?, ?, ?, ?)"
        );
        statement.setObject(1, CityName.getCityName());
        statement.setObject(2, DateInfo.getDate());
        statement.setObject(3, CityWeather.getCityWeather());
        statement.setObject(4, CityTemperature.getCityTemp());
        statement.execute();
    }

    public List<InfoHelper> getSQLInfo() throws SQLException {
        List<InfoHelper> info = new ArrayList<>();
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM WeatherThing");

        while (resultSet.next()) {
            String city = resultSet.getString("city");
            String date = resultSet.getString("date");
            String weather = resultSet.getString("weather");
            String temperature = resultSet.getString("temperature");

            InfoHelper infoHelper = new InfoHelper(city, date, weather, temperature);
            info.add(infoHelper);
        }
        return info;
    }
}
