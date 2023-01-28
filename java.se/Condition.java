public class Condition {
  public static void main(String[] args) {
    // 条件语句 if else
    /**
     * if else-if else-if else
     * 
     */
    int condition = 12;

    String username = "butch";

    if (condition > 10) {
      System.out.print("+++++++++++++");
    } else {
      System.out.print("-------------");
    }


    System.out.print("\n");

    switch (username) {
      case "jerry":
        System.out.print("my name is jerry");
        break;
      case "butch":
        System.out.print("my name is butch");
        break;
      default:
        System.out.print("default username is tom");
        break;
    }
    System.out.print("\n");

  
    double randomNum = Math.random();
    System.out.println(randomNum > 0.5 ? "AAA" : "BBB" );

    System.out.println("this is a \'text\'");
  }
}