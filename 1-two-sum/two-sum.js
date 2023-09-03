/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    for(var i = 0; i < nums.length; i++){ // 2       2 7 11 15 target = 9
         for(var j = i+1; j < nums.length; j++ ){  // 7
            if(target == nums[i] + nums[j]){ // 9 = 2 + 7
                return [i, j];
            }
        }
    }

};