class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer> temp = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
        temp.add(intervals[0][0]);
        temp.add(intervals[0][1]);
        for(int i = 0 ; i < n ; i++){
            if(temp.get(temp.size()-1) < intervals[i][0]){
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
            }else if(temp.get(temp.size() - 1) < intervals[i][1]) 
                temp.set(temp.size() - 1 , intervals[i][1]);
        }
        int ans[][]=new int[temp.size()/2][2];
        int k=0;
        for(int i=0;i<ans.length;i++){
            ans[i][0]=temp.get(k++);
            ans[i][1]=temp.get(k++);
        }
        return ans;
    }
}