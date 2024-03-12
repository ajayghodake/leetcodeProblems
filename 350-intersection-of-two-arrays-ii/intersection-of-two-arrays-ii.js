/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    let map = new Map();

    for(let ele of nums1){
        let freq = map.get(ele) || 0;
        map.set(ele, freq + 1);
    }

    let insertion = [];
    for(let ele of nums2){
        let freq = map.get(ele) || 0;
        if(freq > 0){
            insertion.push(ele);
            map.set(ele, freq - 1);
        }
    }

return insertion;
};