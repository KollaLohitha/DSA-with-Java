class Solution {
    public static int daysReq(int[] weights, int mid){
        int day = 1, load = 0;
        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > mid){
                day = day + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int weight : weights){
            maxi = Math.max(maxi,weight);
            sum += weight;
        }
        int low = maxi , high = sum;
        while (low <= high){
            int mid = low +(high - low)/2;
            int TDays = daysReq(weights,mid);
            if(TDays <= days){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
}