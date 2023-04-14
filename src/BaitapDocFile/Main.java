package BaitapDocFile;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Module2\\TextFile\\src\\BaitapDocFile\\country");
        try {
            List<String> all = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : all ){
                princountry(parase(line));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<String> parase(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private static void princountry(List<String> country ){
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
