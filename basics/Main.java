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
}