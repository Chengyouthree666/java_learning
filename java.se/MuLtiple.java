public class Multiple {
  public static void main(String[] args) {
    System.out.println("\033[32;4m" + "multiple:>>" + "\033[0m");

    /**
     * // java中的多态： 同一形态的不同表现形式
     * // 例如：类中方法通过继承后便可在不同子类中实现不同的表现形式
     */
    Task1 t1 = new Task1();
    Task2 t2 = new Task2();
    t1.output();
    t2.output();
  }
}

class PrintBox {
  public void print(String message) {
    System.out.println("\033[32;4m" + "打印机输出:>>" + message + "\033[0m");
  }
}

class Task1 extends PrintBox {
  public void speak() {
    System.out.println("\033[32;4m" + "this is task1 speaking..." + "\033[0m");
  }
  public void output() {
    // 子类调用自身方法
    this.speak();
    // 子类调用父类方法super
    super.print("task1 is running....");
  }
}

class Task2 extends PrintBox {
  public void speak() {
    System.out.println("\033[32;4m" + "this is task2 speaking..." + "\033[0m");
  }
  public void output() {
    // 子类调用自身方法
    this.speak();
    // 子类调用父类方法super
    super.print("task2 is running....");
  }
}