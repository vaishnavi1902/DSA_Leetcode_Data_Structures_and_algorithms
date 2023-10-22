class Solution {
    public boolean divisorGame(int n) {
        int a = 0 , b = 0 ;
        for(int i = 0 ; i < n-1 ; i++){
            if(i % 2 == 0 ) a++; 
            else b++; 
        }
        if(a == b) return false ; 
        if(a == 1) return true; 
        return true;
    }
}
