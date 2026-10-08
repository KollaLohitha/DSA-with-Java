class Solution {
    public void backtrack(int n, int k, ArrayList<Integer> curr, List<List<Integer>> ans,int idx){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i <= n; i++){
            curr.add(i);
            backtrack(n,k,curr,ans,i+1);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        backtrack(n,k,curr,ans,1);
        return ans;
    }
}