class Solution {
    public static int sum(int[] nums, int mid){
        int total = 0;
        for(int num : nums){
            total += Math.ceil((double)num/mid);
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi = Integer.MIN_VALUE;
        for(int num : nums){
            maxi = Math.max(num,maxi);
        }
        int ans = -1;
        int low = 1, high = maxi;
        while(low <= high){
            int mid = low + (high - low)/2;
            int total = sum(nums,mid);
            if(total <= threshold){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}