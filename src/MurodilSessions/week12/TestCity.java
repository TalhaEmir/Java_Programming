package MurodilSessions.week12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TestCity {
    public static void main(String[] args) {
        //Baltimore,-4.0,622104,Maryland
        City city1 = new City("Baltimore", -4.0, 622104L, "Maryland");
        System.out.println("name = " + city1.getName());
        System.out.println("growth = " + city1.getGrowthRate());
        System.out.println("population = " + city1.getPopulation());
        System.out.println("state = " + city1.getState());

        String cityInfo = "Nashville-Davidson,16.2,634464,Tennessee";
        //convert cityInfo to City java object
        String[] arr = cityInfo.split(",");
        System.out.println(Arrays.toString(arr));

        City city2 = new City(arr[0], Double.parseDouble(arr[1]), Long.parseLong(arr[2]), arr[3]);
        System.out.println(city2);

        //Double.parseDouble(arr[1]) => returns double as primitive.
        //Double.valueOf(arr[1]) => return Double as wrapper object. ArrayList<Double>
        List<String> allLines;
        try {
            allLines = Files.readAllLines(Paths.get("src/week12/cities.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(allLines.size());
        System.out.println(allLines.get(0));
        System.out.println(allLines.get(1));

    }
}


