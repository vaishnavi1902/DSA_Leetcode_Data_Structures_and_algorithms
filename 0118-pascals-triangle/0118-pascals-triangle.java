class Solution {
    public List<Integer> genR(int row){
        int var = 1 ;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int j = 1 ; j < row ; j++){
            var = var * (row - j);
            var = var / j ;
            temp.add(var);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ; i <= numRows ; i++){
            ans.add(genR(i));
        }
        return ans;
    }
}