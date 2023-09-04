class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0 ; 
        for(int n = low ; n <= high ; n++){
            int  f = 0 , s = 0 ;
            int l = String.valueOf(n).length();
            if(l == 1){
                
            }else{
                int h = l / 2 ;
                for(int a = 0 ; a < h ; a++){
                    int temp = String.valueOf(n).charAt(a);
                    f = f + temp ;
                    // System.out.println();
                }
                for(int b = h  ; b < l ; b++){
                    int temp = String.valueOf(n).charAt(b);
                    s = s + temp ;
                }
                if(f == s){
                    // System.out.println(f);
                    count++;
                }
            }
         
        } return count;
    }
}