class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i <= n+t ;i++){
            int product = 1;
            int current = i;
            while (current > 0){
                product = product * (current % 10);
                current = current / 10;
            }
            if(product % t == 0){
                return i;
            }
        }
        return n;
    }
}