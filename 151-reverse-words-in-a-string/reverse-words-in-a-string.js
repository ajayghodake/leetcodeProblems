/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let result = s.split(/\s+/).reverse().join(' ');
    return result.trim();
};