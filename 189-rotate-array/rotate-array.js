/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    const reverseArr = (start, end) => {
        while(start < end){
            [nums[start], nums[end]] = [nums[end], nums[start]];
            start++;
            end--;
        }
    }
    
   k = k%nums.length;
   reverseArr(0, nums.length-1);
   reverseArr(0, k-1);
   reverseArr(k, nums.length-1);


};