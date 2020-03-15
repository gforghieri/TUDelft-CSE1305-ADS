import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringParser {

    public static void main(String[] args)throws Exception {
        File file = new File("C:\\Users\\forgh\\OneDrive\\Asztali gép\\kolbot-master\\kolbot-master\\d2bs\\kolbot\\mules\\Europe\\tiger55\\Tristen.sel.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        String title;
        String description;

        List<String> titles = new ArrayList<String>();

        List<String> descriptions = new ArrayList<String>();

        while ((line = bufferedReader.readLine()) != null) {

            // Clean description
            description = line.split(",")[3];
            description = description.replaceAll("xffc[0-9]", "").
                    replaceAll("Can be Inserted into Socketed Items", "").
                    replaceAll("\\\\", " ").replaceAll(" n ", "").
                    replaceAll("description", "").
                    replaceAll("Keep in Inventory to Gain Bonus", "").replaceAll("", "")
                    .replaceAll("\"\":\"  ", "[B]").replaceAll("Durability: [0-9][0-9] of [0-9][0-9]", "")
                    .replaceAll(" \\(..\\)", "[/B]").replaceAll(" \\(.\\)      ", "[/B]")
                    .replaceAll("Required Level: ..", "").replaceAll("  ", " ")
                    .replaceAll(".*Horadric Cube.*", "").replaceAll(".*Mephisto's.*", "")
                    .replaceAll("[$].*", "").replaceAll("^*Weapons:.*$", "")
                    .replaceAll("Ethereal \\(Cannot be Repaired\\)", "[B]ETH[/B]");

            System.out.println(description);


            // Titles are clean
            title = line.split(",")[2];
            title = title.split("\"")[3];
            titles.add(title);



        }
    }
}
