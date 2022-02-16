import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

public class DateInfo {

	static OkHttpClient okHttpClient = new OkHttpClient();
	static ObjectMapper objectMapper = new ObjectMapper();

	public static String getDate() throws IOException {

		HttpUrl getDateInfo = new HttpUrl.Builder()
				.scheme("http")
				.host("dataservice.accuweather.com")
				.addPathSegment("forecasts")
				.addPathSegment("v1")
				.addPathSegment("daily")
				.addPathSegment("1day")
				.addPathSegment(CityID.getCityID())
				.addQueryParameter("apikey", "TBvSpIwWxlQRhzry7191Ptt8JspKiSsr")
				.build();

		Request request = new Request.Builder()
				.addHeader("Accept", "application/json")
				.url(getDateInfo)
				.build();

		Response response = okHttpClient.newCall(request).execute();
		String jsonOfWeather = response.body().string();
		String dateInfo = objectMapper.readTree(jsonOfWeather).at("/DailyForecasts").get(0).at("/Date").asText();

		return dateInfo;
	}
}
