public class Count {
  public static void main(String[] arguments) {
    int count = 0;

    for (int i = 1; i <= 100; ++i) {
      count += i;
    }
    
    System.out.println("1-100整数之和：" + count);
  }
}