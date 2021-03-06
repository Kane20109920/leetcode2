class Solution {
    public int climbStairs(int n) {
        
        if(n == 0||n==1){
            return 1;
        }
        int[] temp = new int[n+1];
        temp[0] = 1;
        temp[1] = 1;
        for(int i =2;i<n+1;i++){
            temp[i] = temp[i-1]+temp[i-2];
        }
        return temp[n];
        // return climbStairs(n-1)+climbStairs(n-2);            
    }
}
