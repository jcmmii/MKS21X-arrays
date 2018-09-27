public class ArrayDemo {
  // 0a
  public static void printArray(int[]ary) {
    for (int x = 0; x < ary.length; x++) {
      System.out.print("[" + ary[x] + "]");
    }
  }

  // 0b
  public static void printArray(int[][]ary) {
    for (int a = 0; a < ary.length; a++) {
      for (int b = 0; b < ary[a].length; b++) {
        System.out.print("[" +ary[a][b] + "]");
      }
      System.out.println("");
    }
}
}
