/**
 * java 基本数据类型
 *
 *  1. 整数：   byte(8) short(16) int(32) long(64)
 *  2. 浮点数： float double
 *  3. 字符串： char  String
 *  4. 布尔值： boolean
 * */
public class DataType {
    // 6中数字类型 4种整数+2种浮点数
    static byte _byte;
    static short _short;
    static int _int;
    static long _long;
    static float _float;
    static double _double;

    // 2种字符串类型
    static char _char;
    static String _str;

    // 布尔类型
    static boolean _bool;

    public static void main(String[] args) {
        System.out.println("默认值_byte：" + _byte); // 0
        System.out.println("默认值_short：" + _short); // 0
        System.out.println("默认值_int：" + _int); // 0
        System.out.println("默认值_long：" + _long); // 0
        System.out.println("默认值_float：" + _float); // 0.0
        System.out.println("默认值_double：" + _double); // 0.0
        System.out.println("默认值_char：" + _char); //
        System.out.println("默认值_str：" + _str); // null
        System.out.println("默认值_bool：" + _bool); // false
    }
}