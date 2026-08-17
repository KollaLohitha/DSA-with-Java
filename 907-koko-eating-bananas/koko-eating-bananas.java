class Solution {
    public static long hours(int[] piles, int mid){
        long total = 0;
        for(int p : piles){
            total += (p+(long)mid-1)/mid;
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = Integer.MIN_VALUE;
        for(int num : piles){
            maxi = Math.max(num,maxi);
        }
        int ans = maxi;
        int low = 1, high = maxi;
        while(low <= high){
            int mid = low +(high - low)/2;
            long total = hours(piles,mid);
            if(total <= h){
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