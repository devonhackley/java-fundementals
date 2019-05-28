
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main (String[] args) {

    // pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // flip coin
    flipNHeads(1);

    //clock
    clock();
  }

  public static String pluralize(String animal, int count) {
    String plural = animal;
    if(count == 0 || count > 1){
      plural = animal + "s";
    }
    return plural;
  }

  public static void flipNHeads(int num){
    int flips = 0;
    int numOfHeads = 0;
    while(numOfHeads < num){
      double randomNum = Math.random();
      flips++;
      if (randomNum < 0.5) {
        System.out.println("tails");
        numOfHeads = 0;
      } else if (randomNum >= 0.5){
        System.out.println("heads");
        numOfHeads++;
      }
    }
    System.out.println("It took " + flips + " flips to flip " + num + " head in a row.");
  }

  public static void clock(){
    LocalDateTime prevTime = LocalDateTime.now();
    while(true){
      LocalDateTime currentTime = LocalDateTime.now();
      if(prevTime.getSecond() != currentTime.getSecond()){
        prevTime = currentTime; // reassign the prevTime to the new time
        System.out.println(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
      }
    }
  }
}