package BaitapDocFile;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Module2\\TextFile\\src\\BaitapDocFile\\country");
        try {
            List<String> all = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : all ){
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
