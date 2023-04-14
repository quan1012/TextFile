
import java.io.PrintWriter;


public class TestWrite {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\Module2\\TextFile\\ssss", "UTF-8");
            pw.println("Trần Hồng Quân");
            pw.flush();
            pw.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
