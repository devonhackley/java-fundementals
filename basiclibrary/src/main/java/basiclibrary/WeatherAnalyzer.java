package basiclibrary;

import java.util.*;

public class WeatherAnalyzer {

    public static void main(String[] args) {
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

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }
    public String analyzeWeather(int[][] arr){
        HashSet<Integer> weatherDataSet = new HashSet<>();

        int min = 999, max = 0;

        

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                min = arr[i][j] < min ? arr[i][j] : min;
                max = arr[i][j] > max ? arr[i][j] : max;
                weatherDataSet.add(arr[i][j]);
            }
        }

        String response = "High: " + max + "\n" + "Low: " + min + "\n";
        for(int i = 0; i <(max-min); i++){
            if(!weatherDataSet.contains(min+i)){
                response += "Never saw temperature: " + (min+i) + "\n";
            }
        }
        return response;
    }


    public static String tally(List<String> votes){
        int most = 0;
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < votes.size(); i++){
            set.add(votes.get(i));
            map.put(votes.get(i), 0);
        }

        for(int i = 0; i < votes.size(); i++){
            if(set.contains(votes.get(i))){
                int countSoFar = map.get(votes.get(i));
                map.put(votes.get(i), countSoFar + 1);
            }
        }

        String name = "";
        // Was able to figure out how to loop thru keys from this post: https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
        for (String key : map.keySet()) {
            if(map.get(key) > most){
                most = map.get(key);
                name = key;
            }
        }

        return name;
    }


}
