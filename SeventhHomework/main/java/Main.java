import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Прогноз погоды на " + DateInfo.getDate() + " число");
		System.out.println(CityWeather.getCityWeather(CityID.getCityID("Moscow")));

	}
}
