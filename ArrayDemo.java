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
    System.out.println("0a. Prints a 1D array of ints");
      int [] xyz = new int[5];
      xyz[0] = 0;
      xyz[1] = 2;
      xyz[2] = -2;
      xyz[3] = 4;
      xyz[4] = -4;
      printArray(xyz);

    System.out.println("0b. Prints a 2D array of ints");
      int [][] lol = new int[3][5];
      printArray(lol);

    System.out.println("1. Returns amount of zeroes in a parameter (5x5 array)");
      int [][] heck = new int [5][5];
      System.out.println(countZeros2D(heck));

    System.out.println("2a. Modifies a 2D array; all values replaced with 1 unless row number = column, in that case, replaced with 3");
      int [][] abc = new int[3][];
      abc[0] = new int [3];
      abc[1] = new int [4];
      abc[2] = new int [5];
      fill2D(abc);
      printArray(abc);

    System.out.println("2b. Makes new 2d array w/ same dimensions as parameter. Array filled w/ 1s, unless original was a negative number. Replace w/ 3 instead.");
      int [] [] bnm = new int [] [] {
        {-5,3,5},
        {23,45,62},
        {-5,-10,0},
      };
      System.out.println("Original array: ");
      printArray(bnm);
      System.out.println("New array:");
      printArray(fill2DCopy(bnm));
}
}
