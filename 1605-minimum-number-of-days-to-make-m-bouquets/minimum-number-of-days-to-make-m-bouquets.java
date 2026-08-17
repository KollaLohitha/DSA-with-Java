class Solution {
    public static boolean isPossible(int[] bloomDay, int mid, int m, int k){
        int count = 0;
        int bouquets = 0;
        for(int b : bloomDay){
            if(b <= mid){
                count++;
                if(count ==k){
                    bouquets++;
                    count = 0;
                }
            }
            else{
                count = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0; i < bloomDay.length; i++){
            mini = Math.min(bloomDay[i],mini);
            maxi = Math.max(bloomDay[i],maxi);
        }
        int low = mini, high = maxi;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(isPossible(bloomDay,mid,m,k)){
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