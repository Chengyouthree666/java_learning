public class StringTest {
  public static void main(String[] args) {
    char[] helloworld = { 'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd' };
    String helloString = new String(helloworld);

    System.out.println(helloString);
  }
}