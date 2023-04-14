import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class TestRead {
    public static void main(String[] args) {
        File f = new File("D:\\Module2\\TextFile\\ssss");
        try {
            List<String> all = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
            for (String line : all ){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
