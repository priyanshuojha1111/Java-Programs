

class occ {
 
  /**
   * @param args
   */
  public static void main(String[] args) {
    int arr1[] = { 2, 3, 4, 2, 3, 2, 4, 6 };
    int x = 6;
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] == x) {
        count++;
      }
    }

    System.out.println(x + " Occurs " + count + "times");

  }
}

