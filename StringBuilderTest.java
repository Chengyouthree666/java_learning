public class StringBuilderTest {
  public static void main(String[] args) {
    
    /**
     * StringBuilder类  
     *  append()--末尾追加字符串
     *  insert()--中间追加字符串
     *  delete()--删除指定索引位置字符（前闭后开）
     */

     /**
      * 在使用StringBuffer类时，每次都会对StringBuffer本身操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐StringBuffer
      * StringBuilder不是线程安全的，但有速度优势
      */

     StringBuilder sb1 = new StringBuilder(10);
     System.out.println(sb1);

     sb1.append("hello");
     System.out.println(sb1);


     sb1.insert(5, "world");
     System.out.println(sb1);

     sb1.delete(6, 9);
     System.out.println(sb1);
  }
}