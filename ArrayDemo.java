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

  // 1
  public static int countZeros2D(int[][] nums) {
    int ret = 0;
    for (int s = 0; s < nums.length; s++) {
      for (int t = 0; t < nums[s].length; t++) {
        if (nums[s][t] == 0) {
          ret = ret + 1;
        }
      }
    }
    return ret;
}

  //2a THIS DOES NOT WORK YET
  public static void fill2D(int[][] vals) {
    int row = 0;
    int column = 0;
    int placeholder = 0;
    for (int u = 0; u < vals.length; u++) {
      row = vals[u];
      for (int v = 0; v < vals[u].length; v++) {
        column = vals[u][v];
        if (column == row) {
          placeholder = 1;
          vals[u][v] = 3;
        } else {
          vals[u][v] = 1;
        }
      }
      if (placeholder == 1) {
        vals[u] = 3;
      } else {
        vals[u] = 1;
      }
    }
    return vals;
  }
}
