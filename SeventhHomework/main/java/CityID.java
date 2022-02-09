import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class CityID {

	static OkHttpClient okHttpClient = new OkHttpClient();
	static ObjectMapper objectMapper = new ObjectMapper();

	public static String getCityID(String cityName) throws IOException {
		HttpUrl detectCityID = new HttpUrl.Builder()
				.scheme("http")
				.host("dataservice.accuweather.com")
				.addPathSegment("locations")
				.addPathSegment("v1")
				.addPathSegment("cities")
				.addPathSegment("search")
				.addQueryParameter("apikey", "TBvSpIwWxlQRhzry7191Ptt8JspKiSsr")
				.addQueryParameter("q", cityName)
				.build();

		Request request = new Request.Builder()
				.addHeader("Accept", "application/json")
				.url(detectCityID)
				.build();

		Response response = okHttpClient.newCall(request).execute();
		String jsonOfCities = response.body().string();
		String cityID = objectMapper.readTree(jsonOfCities).get(0).at("/Key").asText();

		return cityID;
	}
}

