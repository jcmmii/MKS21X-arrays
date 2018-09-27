public class ArrayDemo {
  // 0a
  public static void printArray(int[]ary) {
    for (int x = 0; x < ary.length; x++) {
      System.out.println("[" + ary[x] + "]");
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


  //2a
  public static void fill2D(int[][] vals) {
    int a = 0;
    for (int u = 0; u < vals.length; u++) {
      a = u;
      for (int v = 0; v < vals[u].length; v++) {
        if (v == a) {
          vals[u][v] = 3;
        } else {
          vals[u][v] = 1;
        }
      }
    }
  }

  //2b
  public static int[][] fill2DCopy(int[][] vals){
    int a = 0;
    int [][] poi = new int [vals.length] [];
    for (int t = 0; t < vals.length; t++) {
      poi[t] = new int [vals[t].length]; //poi[t] is the row, making the # of columns
      for (int s = 0; s <vals[t].length; s++) {
        a = vals[t][s];
        if (a < 0) {
          poi[t][s] = 3;
        } else {
          poi[t][s] = 1;
        }
      }
    }
    return poi;
}



  //Main
  public static void main(String[] args) {
      //int [] xyz = new int[5];
      //xyz[0] = 1;
      // printArray(xyz);
      //int [] arr = new int[] {1,2,4};
      //printArray(arr);
/*
      int [][] abc = new int[3][];
      abc[0] = new int [3];
      abc[1] = new int [3];
      abc[2] = new int [5];
      fill2D(abc);
      printArray(abc);
*/
      int [] [] bnm = new int [] [] {
        {-5,3,5},
        {23,45,62},
        {-5,-10,0},
      };
      printArray(fill2DCopy(bnm));
}
}
