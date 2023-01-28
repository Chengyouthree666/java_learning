public class TestArray {
  
  // 定义一个返回反序的数组的方法
  public static int[] getReverseArr(int[] arr) {
    int[] res = new int[arr.length];
    for (int i = 0, j = res.length - 1; i < arr.length; i++, j--) {
      res[j] = arr[i];
    }
    return res;
  }
  
  public static void main(String[] args) {
    
    // 定义数组的大小
    int arrSize = 10;

    String[] strArr = new String[arrSize];
    String arrResult = "";

    strArr[0] = "a";
    strArr[1] = "b";
    strArr[2] = "c";
    strArr[3] = "d";
    strArr[4] = "e";
    strArr[5] = "f";
    strArr[6] = "g";
    strArr[7] = "h";
    strArr[8] = "i";
    strArr[9] = "j";
    // strArr[10] = "k"; 编译报错，超出长度

    for (int i = 0; i < arrSize; i++) {
      arrResult += strArr[i];
    }

    System.out.println(arrResult);
    System.out.println("-------------------------");

    // for-each打印所有数组元素
    double[] myList = {1.1, 2.2, 3.3};
    for (double ele: myList) {
      System.out.println(ele);
    }

    
    int[] testArr = {1, 2, 3};
    int[] resArr = getReverseArr(testArr);
    for (int ele: resArr) {
      System.out.println(ele);
    }
  }
}