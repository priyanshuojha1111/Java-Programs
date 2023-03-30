
abstract class shape 
{ 
    abstract int area(int l, int b);
    
    abstract int volume(int l, int b, int h);
    
    void circumpherence( int r)
     {
     
        System.out.println( 2*3.14*r);
     }

}
 
// p.1= create abstract class shape 
// p.2= create abstarct method area l, b  in shape
// p.3= create abstract method volume l,b, h 
// create non abstract method circumpherence radius

public class Mathematics extends shape{
   
    int area(int l, int b )
    {  
        return l*b; 
    }
     int volume(int l,int b,int h)
     {
        return l*b*h;
        
       }
     public static void main(String[] args) {
        
        Mathematics mt= new Mathematics();
         int a=  mt.area(2,5);
         System.out.println(a);
         int b=  mt.volume(3,4,5);
         System.out.println(b);
                 mt.circumpherence(10);
         
     } 
     
}


