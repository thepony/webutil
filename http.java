/*

HTTP Class Includes:
    http: GET, POST
    https: GET, POST
    Base64 Encode/Decode
    Xor w/ Base64
    Xor (no Base64)




 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author brucecolburn
 */
public class http {
    String USER_AGENT = "Mozilla/5.0";
    String Set_Req_Property_Lang = "en-US,en;q=0.5"; // Used for POST Methods only!
    
    // HTTP Post Method
    protected String post(String url, String data) throws Exception {
	URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
	con.setRequestMethod("POST");
	con.setRequestProperty("User-Agent", USER_AGENT);
	con.setRequestProperty("Accept-Language", Set_Req_Property_Lang);

        String urlParameters = data;
		
	// Send post request
	con.setDoOutput(true);
	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	wr.writeBytes(urlParameters);
	wr.flush();
	wr.close();

	int responseCode = con.getResponseCode(); // If I ever need it
        BufferedReader in = new BufferedReader(
	new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuilder response = new StringBuilder();

	while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
	}
	
        in.close();
	return response.toString();
        
    }
    
    // HTTPS Post Method
    protected String postSecure(String url, String data) throws Exception {
	URL obj = new URL(url);
	HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
	con.setRequestMethod("POST");
	con.setRequestProperty("User-Agent", USER_AGENT);
	con.setRequestProperty("Accept-Language", Set_Req_Property_Lang);

        String urlParameters = data;
		
	// Send post request
	con.setDoOutput(true);
	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	wr.writeBytes(urlParameters);
	wr.flush();
	wr.close();

	int responseCode = con.getResponseCode(); // If I ever need it
        BufferedReader in = new BufferedReader(
	new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuilder response = new StringBuilder();

	while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
	}
	
        in.close();
	return response.toString();
        
    }
    
    // HTTP Get Method
    protected String get(String url) throws Exception {	
        URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", USER_AGENT);

	int responseCode = con.getResponseCode(); // if I ever need it
	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuilder response = new StringBuilder();

	while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
	}
	in.close();
        return response.toString();
        
    }
    
    // HTTPS Get Method 
    protected String getS(String url) throws Exception {	
        URL obj = new URL(url);
	HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", USER_AGENT);

	int responseCode = con.getResponseCode(); // if I ever need it
	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuilder response = new StringBuilder();

	while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
	}
	in.close();
        return response.toString();
        
    }
    
    protected String base64encode(String encode) throws UnsupportedEncodingException {
        String encoded = DatatypeConverter.printBase64Binary(encode.getBytes("UTF-8"));
        return encoded;
    }
    
    protected String base64decode(String decode) {
        byte[] decoded = DatatypeConverter.parseBase64Binary(decode);
        return new String(decoded);
    }
    
    protected String xorKeyBase64(String msg, String code) throws UnsupportedEncodingException {    
        base64decode(msg);
        base64decode(code);
        byte[] a = msg.getBytes("UTF-8");
        byte[] key = code.getBytes("UTF-8");
        byte[] out = new byte[a.length];
        for (int i = 0; i < a.length; i++) {
            out[i] = (byte) (a[i] ^ key[i%key.length]);
        }
        String reply = new String(out);
        reply = base64encode(reply);
        return reply;
    }
    
    protected String xorKey(String msg, String code) throws UnsupportedEncodingException {    
        byte[] a = msg.getBytes("UTF-8");
        byte[] key = code.getBytes("UTF-8");
        byte[] out = new byte[a.length];
        for (int i = 0; i < a.length; i++) {
            out[i] = (byte) (a[i] ^ key[i%key.length]);
        }
        String reply = new String(out);
        return reply;
    }

    protected String meter(int total, int used, int bars) {
        int i = 0, e = 0, d = 0;
        String meter = "";
        if (used >= total) {
            e = bars;
            d = 0;
        }
        else if (used <= 0) {
            d = bars;
            e = 0;
        }
        else {
            e = (int)((float)used/(float)total * (float)bars);
            d = bars - e;
        }
        
        if (e > 0) {
            i = 0;
            while (i < e) {
                meter += "■ ";
                i++;
            }
        }
        if (d > 0) {
            i = 0;
            while (i < d) {
                meter += "□ ";
                i++;
            }
        }
        return meter;
    }

}


