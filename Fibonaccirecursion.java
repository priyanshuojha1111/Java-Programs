public class Fibonaccirecursion {
  public static void main(String[] args) {
    
   int n1=0,n2=1;
   Fibo(n1,n2);
   }   

   public static void Fibo(int a, int b){
    
 if(a<100)
{
   System.out.print(a+" ");
   Fibo(b,a+b);
   }
   }
   }
