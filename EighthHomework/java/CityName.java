import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

public class CityName {

    static OkHttpClient okHttpClient = new OkHttpClient();
    static ObjectMapper objectMapper = new ObjectMapper();

    public static String getCityName() throws IOException {
        HttpUrl detectCityID = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "TBvSpIwWxlQRhzry7191Ptt8JspKiSsr")
                .addQueryParameter("q", TypingCityName.getCityName())
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(detectCityID)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String jsonOfCities = response.body().string();
        String cityLocalName = objectMapper.readTree(jsonOfCities).get(0).at("/LocalizedName").asText();

        return cityLocalName;
    }
}
