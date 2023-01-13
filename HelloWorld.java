public class HelloWorld {
    // 访问修饰符+关键字+返回类型+函数名（string类 参数）
    /**
     * 1. 修饰符-修饰类中的方法和属性
     * 访问控制修饰符 : default, public , protected, private
     * 非访问控制修饰符 : final, abstract, static, synchronized
     * */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * 2. 变量
     * 局部变量
     * 类变量（静态变量）
     * 成员变量（非静态变量）
     * */

    /**
     * java 5中引入的枚举enum
     * */
    class SizeType {
        enum Types{ MINI, SMALL, MEDIUM, LARGE }
    }
}