package currency.main;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String url_str = "https://v6.exchangerate-api.com/v6/" + APIKey.getApi_key() + "/latest/USD";

        // Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        Gson gson = new Gson();

        RequestData data = gson.fromJson(new InputStreamReader((InputStream) request.getContent()), RequestData.class);

        Map<String, Double> map = data.getConversion_rates();

        // prints out exchange rates
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        GUI gui = new GUI(map);

        while (true) {
            System.out.println(gui.getInput());
            System.out.println(gui.getOutput());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
