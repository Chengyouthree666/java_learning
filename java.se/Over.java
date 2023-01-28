/**
 * 重写（Override）与重载 (Overload)
 *
 *  重写：子类对父类允许访问的方法的执行体进行编写
 *  重载：同一个类中的多个同名方法（参数不同， 返回类型可同或不同）  【构造器的重载】
 * */
public class Over extends Fa {
    public static void main(String[] args) {
    }
    @Override
    public void speak(String message) {
        System.out.println("\033[32;4m" + "重写speak方法..." + message + "\033[0m");
    }
    public void test(String msg) {
    }
    public int test(int i) {
        return 10 + i;
    }
}

class Fa {
   public void speak(String message) {
       System.out.println("\033[32;4m" + "重写与重载:>>" + message + "\033[0m");
   }
}
