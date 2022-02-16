import java.io.IOException;
import java.sql.SQLException;


public class Main {

	public static void main(String[] args) throws IOException {
		CityID.getCityID();
		System.out.println("Прогноз погоды на " + DateInfo.getDate() + " число");
		System.out.println("Город: " + CityName.getCityName());
		System.out.println("Температура: " + CityTemperature.getCityTemp());
		System.out.println("Погода: " + CityWeather.getCityWeather());

		try {
			DBHandler dbHandler = new DBHandler();

			dbHandler.addSQLStaff();

			System.out.println(dbHandler.getSQLInfo());
			System.out.println(dbHandler.getSQLInfo().size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
