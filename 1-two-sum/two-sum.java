class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Created hashMap
        HashMap<Integer, Integer> map = new HashMap();

        //Filling the HashMap
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        //Searching Form the HashMap
        for(int i = 0; i < nums.length; i++){  // 2 7 11 15 target = 9
            int num = nums[i]; // 2
            int rem = target - num; // 7
                if(map.containsKey(rem)){
                    int index = map.get(rem);
                    if(index==i)continue; // if the number is duplicate in the array
                    return new int[]{i, index};
                }
        }

        return new int[]{};
    }
}




//  for (int i = 0; i < num.length; i++) {
//             for (int j = i + 1; j < num.length; j++) {
//                 if (target == num[i] + num[j]) {
//                     res[count] = i;
//                     count++;
//                     res[count] = j;
//                     count++; 
//                 }
//             }
//         }
//         for (int k = 0; k < count; k++) {
//             System.out.print(res[k] + " ");
//         }