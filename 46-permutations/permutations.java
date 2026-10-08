class Solution {
    public void permutations(boolean[] used, ArrayList<Integer> curr, List<List<Integer>> ans, int[] nums){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            curr.add(nums[i]);
            permutations(used,curr,ans,nums);
            used[i] = false;
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        for(int i = 0; i < used.length; i++){
            used[i] = false;
        }
        permutations(used,curr,ans,nums);
        return ans;
    }
}