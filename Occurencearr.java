
public class Occurencearr {
  /**
   * @param args
   */
  public static void main(String[] args) {
    int arr1[] = { 2, 3, 4, 2, 3, 2, 4, 6 };
    int arr2[] = new int[arr1.length];
    int arr3[] = new int[arr1.length];
     int index=0; 
     boolean found=false;

    for (int ele : arr1) {
       
      found= false;
      for (int j = 0; j < arr1.length; j++) {

        if (ele == arr2[j]) {
          arr3[j] += 1;
          
          found=true;

        } 
         
      }
        if(found==false)
        {

        arr2[index] = ele;
        arr3[index] = 1;
        index +=1;
        }
         }
         for(

      int i = 0;i<arr2.length;i++)
  {
    System.out.println(arr2[i] + " " + arr3[i]);
  }
}

}