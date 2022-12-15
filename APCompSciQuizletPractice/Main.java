package APCompSciQuizletPractice;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {

        //Stores QA.txt in the string "content"(Format is question,answer,question,answer,etc.). Credit to DigitalOcean.
            //Replace fileName with QA.txt file path.
            Scanner scanner = new Scanner(Paths.get("fileName"), StandardCharsets.UTF_8.name());
            String content = scanner.useDelimiter("\\A").next();
            scanner.close();

        //TODO: Run quiz program until player gets a score of 10 then print a win statement.
        

    }
}