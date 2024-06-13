package org.example.sort.tools;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.example.sort.data.Experiment;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
    private static final String JSON_PATH = "C:\\Users\\ankud\\Downloads\\Sort-RTF\\src\\main\\java\\org\\example\\sort\\data\\experiments.json";

    public static ArrayList<Experiment> readJsonFile() {
        ArrayList<Experiment> experiments = new ArrayList<>();
        try {
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(new FileReader(JSON_PATH)).getAsJsonObject();

            JsonArray experimentsJson = jsonObject.getAsJsonArray("experiments");

            for (JsonElement experimentElement : experimentsJson) {
                JsonObject experiment = experimentElement.getAsJsonObject();
                int length = experiment.get("Length").getAsInt();
                int counts = experiment.get("Counts").getAsInt();

                experiments.add(new Experiment(length, counts));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return experiments;
    }
}
