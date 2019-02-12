
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class HttpUrlConnectionSample {
	public static void main(String args[]) throws IOException, URISyntaxException {
		URL obj = new URL("http://localhost:8080/HttpPractice/HttpPractice?somequery=value");
		HttpURLConnection con =  (HttpURLConnection) obj.openConnection();
		con.setRequestProperty("content-type","text/plain");
		con.setRequestMethod("POST");
		
		con.setRequestProperty("User-Agent", "Chrome/71.0.3578.98");
		//con.setRequestProperty("Accept-Language", "ja");
		con.setDoOutput(true);
		OutputStream out=con.getOutputStream();
		out.write("jebin".getBytes("utf-8"));
		out.flush();
		out.close();
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// Response Content
			System.out.println(response.toString());

			File htmlFile = new File("E:\\index.html");
			FileWriter f=new FileWriter(htmlFile);
			f.write(response.toString());
			f.close();
			System.out.println("File Write operation is successfully done!");
			java.awt.Desktop.getDesktop().browse(htmlFile.toURI());
		} else {
			System.out.println("GET request not worked");
		}

	}
}
