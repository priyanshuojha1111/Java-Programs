class Roman{
     
        public void romanToInt() {
           int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
           String symbols[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
           int key =1600;
           String s="";
            for(int i=0;i<arr.length;i++){
                
                while(arr[i]<=key){

                    key= key- arr[i];
                    
                    s+= symbols[i];
                }   
            }
            System.out.println(s);
        }
        public static void main(String[] args) {
            Roman t =new  Roman();
              t.romanToInt();
        }
    }