package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class WeatherAnalyzerTest {
    @Test public void testFindMinAndMax(){
        WeatherAnalyzer test = new WeatherAnalyzer();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String returnedValue = test.analyzeWeather(weeklyMonthTemperatures);
        String [] arr = returnedValue.split("\n");
        String [] expectedValues = new String[] {
                "High: 72",
                "Low: 51",
                "Never saw temperature: 63",
                "Never saw temperature: 67",
                "Never saw temperature: 68",
                "Never saw temperature: 69",
        };

        for(int i = 0; i < arr.length; i++){
            assertEquals(arr[i], expectedValues[i]);
        }

    }

    @Test public void testTally(){
        WeatherAnalyzer test = new WeatherAnalyzer();
        // within your main method...
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = test.tally(votes);

        String expected = "Bush";

        assertEquals(winner, expected);

    }
}
