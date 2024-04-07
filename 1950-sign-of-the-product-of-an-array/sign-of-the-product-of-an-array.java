class Solution {
    public int arraySign(int[] nums) {
        
        double res = 1;

        for(int i = 0; i<nums.length; i++){
            res *= nums[i];
        }

        if(res >= 1) {
            return 1;
            }

        else if(res < 0){ 
            return -1;
            }
        else {
            return 0;
        }
        
        
    }
}