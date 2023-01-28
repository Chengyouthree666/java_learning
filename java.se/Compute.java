public class Compute {
  public static void main(String[] args) {
    int [] nummbers = { 1, 2, 3 };
    String [] members = { "tom", "jerry", "butch" };

    for  (int x : nummbers) {
      System.out.println(x);
    }

    for (String mem : members) {
      System.out.println(mem + ',');
    }
  }
}