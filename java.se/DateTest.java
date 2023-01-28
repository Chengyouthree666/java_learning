import java.util.Date;

public class DateTest {
  public static void main(String[] args) {
    long _now = System.currentTimeMillis();
    System.out.println(_now); // // 时间戳 等价于 【js】new Date().getTime()
    // // 1年  = 12 * month = 365 * day * 60 * min * 60 * s * 1000 = currentTimeMillis

    // 初始化 Date 对象
      Date date = new Date();
      
    // 使用 toString() 函数显示日期时间
    System.out.println(date.toString());
  }
}