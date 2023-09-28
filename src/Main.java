import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("src\\cities\\cities.csv"));
        String row = "";
        while ((row = csvReader.readLine()) != null) {
            String[] dataOfCity = row.split(";");
            if (dataOfCity.length < 6) {
                System.out.printf("City{name='%s', region='%s', district='%s', population='%s', foundation='не известен'}\n\n",
                        dataOfCity[1], dataOfCity[2], dataOfCity[3], dataOfCity[4]);
            }
            else System.out.printf("City{name='%s', region='%s', district='%s', population='%s', foundation='%s'}\n\n",
                    dataOfCity[1], dataOfCity[2], dataOfCity[3], dataOfCity[4], dataOfCity[5]);
        }
        csvReader.close();
    }
}