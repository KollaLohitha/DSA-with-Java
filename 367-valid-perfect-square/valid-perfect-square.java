class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int low = 1, high = num/2;
        while(low <= high){
            int mid = low+(high-low)/2;
            long ans = (long) mid * mid;
            if(ans == num){
                return true;
            }
            else if(ans < num){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}