package API_Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;


public class SearchAPITest {
	
private final String USER_AGENT = "Mozilla/5.0";
    
	@Test
	public static void main(String[] args) throws Exception {

		SearchAPITest http = new SearchAPITest();

		System.out.println("Sending HTTP GET request");
		http.sendGet();

	}

	private void sendGet() throws Exception {

		String url = "https://api.giphy.com/v1/stickers/search?api_key=d9aaV1wcdFHrvckHT5sEV4fF0Bh3ZQjL&q=cats&limit=20&offset=0&rating=r&lang=fr";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//Request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		

		BufferedReader in = new BufferedReader(
				new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		System.out.println(response.toString());
		
		System.out.println("Response Code : " + responseCode);
		

	}
}


